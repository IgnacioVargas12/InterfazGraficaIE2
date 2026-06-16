
package Controlador;

import Modelo.Estudiante;
import Modelo.InscripcionMateria;
import java.util.ArrayList;
import DAOEstudiante.DAOEstudiante;
import Vista.JFPrincipal;
import Modelo.Materia;

public class ControladorEstudiante {
    private DAOEstudiante dao;
    private Estudiante estudiante;
    private JFPrincipal vista; 
    
    public ControladorEstudiante(JFPrincipal vista) {
        this.dao = new DAOEstudiante();
        this.estudiante = dao.cargarEstudiante();
        this.vista = vista;
        
        if (this.estudiante == null) {
            this.estudiante = new Estudiante("Juan Pérez", "12345", "Marketing", 2026);
        }
    }
    
    public Estudiante getEstudiante() {
        return this.estudiante;
    }

    public ArrayList<InscripcionMateria> getInscripciones() {
        return this.estudiante.getMaterias();
    }
    
    public void inscribirNuevaMateria(String nombre, String codigo, int cuatrimestre, String anioTexto) {
        try {
            if (nombre.isEmpty() || codigo.isEmpty() || anioTexto.isEmpty() || cuatrimestre > 2 || cuatrimestre < 1 ) {
                vista.mostrarError("Todos los campos son obligatorios.");
                return;
            }
            
            int anio = Integer.parseInt(anioTexto);

            Materia nuevaMateria = new Materia(nombre, codigo, cuatrimestre, anio);
            
            this.estudiante.inscribirse(nuevaMateria);
            
            this.dao.guardarEstudiante(this.estudiante);
            
            vista.mostrarExito("¡La materia se ha registrado y guardado con éxito!", "Inscripción exitosa");

        } catch (NumberFormatException e) {
            vista.mostrarError("El campo 'Año' debe ser un número entero válido.");
        } catch (IllegalArgumentException e) {
            vista.mostrarError(e.getMessage());
        }
    }
    
    public ArrayList<String> obtenerNombresMaterias() {
        ArrayList<String> listaNombres = new ArrayList<>();

        for (Modelo.InscripcionMateria ins : this.estudiante.getMaterias()) {
            listaNombres.add(ins.getMateria().getNombre() + " [" + ins.getMateria().getCodigo() + "]");
        }

        return listaNombres;
    }


    public void eliminarMateriaPorIndice(int indiceSeleccionado) {
        try {
            if (indiceSeleccionado == -1) {
                vista.mostrarError("Por favor, seleccione una materia de la lista para darla de baja.");
                return;
            }

            this.estudiante.getMaterias().remove(indiceSeleccionado);

            this.dao.guardarEstudiante(this.estudiante);

            vista.mostrarExito("La materia ha sido dada de baja correctamente.", "Eliminación exitosa");

            vista.actualizarListaMaterias();

        } catch (Exception e) {
            vista.mostrarError("Ocurrió un error inesperado al eliminar: " + e.getMessage());
        }
    }
    
    public String buscarMateria(String criterio, String tipoBusqueda) {
        
        if (criterio.isEmpty()) {
            vista.mostrarError("Por favor, ingrese un término de búsqueda.");
            return ""; 
        }

        Modelo.InscripcionMateria encontrada = null;

        if (tipoBusqueda.equalsIgnoreCase("Código")) {
            encontrada = this.estudiante.buscarPorCodigo(criterio);
        } else if (tipoBusqueda.equalsIgnoreCase("Nombre")) {
            encontrada = this.estudiante.buscarPorNombre(criterio);
        }

        
        if (encontrada != null) {
            Modelo.Materia m = encontrada.getMateria();

            return "<html>"
                    + "<font color='#1b4f72'><b>📚 Materia Encontrada</b></font><br><br>"
                    + "<b>Nombre:</b> " + m.getNombre() + "<br>"
                    + "<b>Código:</b> " + m.getCodigo() + "<br>"
                    + "<b>Cuatrimestre:</b> " + m.getCuatrimestre() + "°<br>"
                    + "<b>Condición Actual:</b> " + encontrada.getCondicion() + "<br>"
                    + "<b>Promedio:</b> " + encontrada.getPromedio()
                    + "</html>";
        } else {
            return "<html><font color='red'>❌ No se encontró ninguna materia por " + tipoBusqueda.toLowerCase() + ".</font></html>";
        }
    }
    
    public void registrarAsistencia(int indiceSeleccionado, String estadoAsistencia) {
        String[] resultado = new String[2]; 

        if (indiceSeleccionado == -1) {
            resultado[0] = "ERROR: Por favor, seleccione una materia de la lista.";
            vista.mostrarError(resultado[0]);
            return;
        }

        try {
            Modelo.InscripcionMateria inscripcion = this.estudiante.getMaterias().get(indiceSeleccionado);

            if (estadoAsistencia.equalsIgnoreCase("Presente")) {
                inscripcion.registrarAsistencia(true);
            } else {
                inscripcion.registrarAsistencia(false);
            }

            this.dao.guardarEstudiante(this.estudiante);

            resultado[0] = "Asistencia (" + estadoAsistencia + ") cargada con éxito en " + inscripcion.getMateria().getNombre() + ".";

            double porcentaje = inscripcion.getPorcentajeAsistencia(); 
            if (porcentaje < 75.0) {
                resultado[1] = " ¡ALERTA DE REGULARIDAD!\n"
                             + "La materia '" + inscripcion.getMateria().getNombre() + "' "
                             + "quedó con un " + porcentaje + "% de asistencia.\n"
                             + "Está por debajo del 75% requerido.";
                vista.mostrarExito(resultado[1], "Asistencia registrada correctamente");
            }

        } catch (Exception e) {
            resultado[0] = "ERROR: No se pudo registrar la asistencia: " + e.getMessage();
        }
        vista.mostrarExito(resultado[0], "Asistencia registrada correctamente");
    }
    
    public void cargarNotaAMateria(int indiceSeleccionado, int notaCargada) {
        if (indiceSeleccionado == -1) {
            vista.mostrarError("Error: Por favor, seleccione una materia de la lista");
        }

        try {
            Modelo.InscripcionMateria inscripcion = this.estudiante.getMaterias().get(indiceSeleccionado);

            inscripcion.agregarNota(notaCargada); 

            this.dao.guardarEstudiante(this.estudiante);

            vista.mostrarExito("Nota cargada registrada con éxito en "+ inscripcion.getMateria().getNombre(), "Nota registrada");

        } catch (Exception e) {
            vista.mostrarError("Error: No se puede agregar más de 5 notas por materia.");
           
        }
    }
    
    public String[] obtenerNotasYPromedioMateria(int indiceSeleccionado) {
        String[] datos = new String[6]; 

        if (indiceSeleccionado == -1) {
            java.util.Arrays.fill(datos, "-");
            vista.mostrarError("Error: Por favor, seleccione una materia");
            return datos;
        }

        try {
            Modelo.InscripcionMateria inscripcion = this.estudiante.getMaterias().get(indiceSeleccionado);

            ArrayList<Double> notas = inscripcion.getNotas(); 

            for (int i = 0; i < 5; i++) {
                if (i < notas.size()) {
                    datos[i] = String.valueOf(notas.get(i)); 
                } else {
                    datos[i] = "-"; 
                }
            }

            datos[5] = String.valueOf(inscripcion.getPromedio());

        } catch (Exception e) {
            java.util.Arrays.fill(datos, "Error");
        }

        return datos;
    }
    
    public Object[] generarReporteGeneral() {
        ArrayList<Modelo.InscripcionMateria> materias = this.estudiante.getMaterias();

        String[][] matrizTabla = new String[materias.size()][5]; 
        String[] datosLabels = new String[4]; 

        int cantRegulares = 0;
        int cantRiesgo = 0;
        int cantLibres = 0;
        double sumaPromedios = 0;
        int materiasEvaluadas = 0;

        for (int i = 0; i < materias.size(); i++) {
            Modelo.InscripcionMateria im = materias.get(i);

            String nombre = im.getMateria().getNombre();
            String condicion = im.getCondicion();
            double asistencia = im.getPorcentajeAsistencia();
            double promedio = im.getPromedio();
            String estado = "";

            if (asistencia < 75.0) {
                estado = "Libre";
                cantLibres++;
            } else if (promedio > 0 && promedio < 6.0) { 
                estado = "En curso (Riesgo)";
                cantRiesgo++;
            } else if (promedio >= 7.0 && asistencia >= 75.0) {
                estado = "Aprobada";
                cantRegulares++; 
            } else {
                estado = "En curso";
                cantRegulares++;
            }

            matrizTabla[i][0] = nombre;
            matrizTabla[i][1] = condicion;
            matrizTabla[i][2] = String.format("%.2f %%", asistencia);
            matrizTabla[i][3] = String.valueOf(promedio);
            matrizTabla[i][4] = estado;

            if (promedio > 0) {
                sumaPromedios += promedio;
                materiasEvaluadas++;
            }
        }

        double promedioGeneral = (materiasEvaluadas > 0) ? (sumaPromedios / materiasEvaluadas) : 0.0;

        datosLabels[0] = "Promedio general: " + String.format("%.2f", promedioGeneral);
        datosLabels[1] = "Materias regulares: " + String.valueOf(cantRegulares);
        datosLabels[2] = "Materias en riesgo: " + String.valueOf(cantRiesgo);
        datosLabels[3] = "Materias libres: " + String.valueOf(cantLibres);

        return new Object[] { matrizTabla, datosLabels };
    }
    
    public Object[][] generarReporteCriticas() {
        ArrayList<Modelo.InscripcionMateria> todasLasMaterias = this.estudiante.getMaterias();
        ArrayList<Modelo.InscripcionMateria> criticas = new ArrayList<>();

        for (Modelo.InscripcionMateria im : todasLasMaterias) {
            double asistencia = im.getPorcentajeAsistencia();

            if (asistencia >= 75.0 && asistencia <= 85.0) {
                criticas.add(im);
            }
        }

        criticas.sort((m1, m2) -> Double.compare(m1.getPorcentajeAsistencia(), m2.getPorcentajeAsistencia()));

        Object[][] matrizTabla = new Object[criticas.size()][5];

        for (int i = 0; i < criticas.size(); i++) {
            Modelo.InscripcionMateria im = criticas.get(i);
            String nombre = im.getMateria().getNombre();
            String condicion = im.getCondicion();
            double asistencia = im.getPorcentajeAsistencia();
            double promedio = im.getPromedio();

            matrizTabla[i][0] = nombre;
            matrizTabla[i][1] = condicion;
            matrizTabla[i][2] = String.format("%.2f %%", asistencia); 
            matrizTabla[i][3] = promedio; 
            matrizTabla[i][4] = "Crítica";
        }
        return matrizTabla;
    }
    
    public Object[] generarReporteAprobadas() {
        ArrayList<Modelo.InscripcionMateria> materias = this.estudiante.getMaterias();
        ArrayList<Modelo.InscripcionMateria> aprobadas = new ArrayList<>();

        for (Modelo.InscripcionMateria im : materias) {
            if (im.getPromedio() >= 6.0 && im.getCondicion().trim().equalsIgnoreCase("Regular")) {
                aprobadas.add(im);
            }
        }

        double notaMaxima = -1.0;
        double notaMinima = 11.0; 
        double sumaPromediosConjunto = 0;

        for (Modelo.InscripcionMateria im : aprobadas) {
            double promedioMateria = im.getPromedio();

            if (promedioMateria > notaMaxima) {
                notaMaxima = promedioMateria;
            }
            if (promedioMateria < notaMinima) {
                notaMinima = promedioMateria;
            }
            sumaPromediosConjunto += promedioMateria;
        }

        double promedioConjunto = (!aprobadas.isEmpty()) ? (sumaPromediosConjunto / aprobadas.size()) : 0.0;

        String[] datosLabels = new String[3];
        if (aprobadas.isEmpty()) {
            datosLabels[0] = "-"; 
            datosLabels[1] = "-"; 
            datosLabels[2] = "-"; 
        } else {
            datosLabels[0] = "Nota máxima: " + String.valueOf(notaMaxima);
            datosLabels[1] = "Nota mínima: " + String.valueOf(notaMinima);
            datosLabels[2] = "Promedio del conjunto: " + String.format("%.2f", promedioConjunto);
        }

        String[][] matrizTabla = new String[aprobadas.size()][5];
        for (int i = 0; i < aprobadas.size(); i++) {
            Modelo.InscripcionMateria im = aprobadas.get(i);
            matrizTabla[i][0] = im.getMateria().getNombre();
            matrizTabla[i][1] = im.getCondicion();
            matrizTabla[i][2] = String.format("%.2f %%", im.getPorcentajeAsistencia());
            matrizTabla[i][3] = String.valueOf(im.getPromedio());
            matrizTabla[i][4] = "Aprobada";
        }

        return new Object[] { matrizTabla, datosLabels };
    }
    
}


package DAOEstudiante;

import Modelo.InscripcionMateria;
import java.io.*;
import java.util.ArrayList;

public class DAOInscripcionMateria {
    private final String FILE_NAME = "DatosInscripciones.txt";
    
    
    public void guardarInscripciones(ArrayList<InscripcionMateria> inscripciones) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(inscripciones); 
        } catch (IOException e) {
            System.out.println("Error crítico al guardar inscripciones: " + e.getMessage());
        }
}
    @SuppressWarnings("unchecked")
    public ArrayList<InscripcionMateria> cargarInscripciones() {
        File archivo = new File(FILE_NAME);
        
        if (!archivo.exists()) {
            return new ArrayList<>(); // Devuelve una lista vacía si el archivo no existe
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<InscripcionMateria>) ois.readObject(); 
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar inscripciones (archivo corrupto): " + e.getMessage());
            return new ArrayList<>();
        }
    }
}

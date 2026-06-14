
package DAOEstudiante;
import Modelo.Estudiante;
import java.io.*;

public class DAOEstudiante {
    private final String FILE_NAME = "DatosEstudiante.txt";
    
    public void guardarEstudiante(Estudiante estudiante) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(estudiante); 
        } catch (IOException e) {
            System.out.println("Error crítico al guardar datos: " + e.getMessage());
        }
    }

    public Estudiante cargarEstudiante() {
        File archivo = new File(FILE_NAME);
        
        if (!archivo.exists()) {
            return null; 
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (Estudiante) ois.readObject(); 
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar datos (puede que el archivo esté corrupto): " + e.getMessage());
            return null;
        }
    }
}

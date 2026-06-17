
package DAOEstudiante;
import Modelo.Materia;
import java.io.*;
import java.util.ArrayList;

public class DAOMateria {
    private final String FILE_NAME = "DatosMateria.txt";
    
    public void guardarMaterias(ArrayList<Materia> materias) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(materias); 
        } catch (IOException e) {
            System.out.println("Error crítico al guardar materias: " + e.getMessage());
        }
        
    }
    public ArrayList<Materia> cargarMaterias() {
        File archivo = new File(FILE_NAME);
        
        if (!archivo.exists()) {
            return new ArrayList<>(); // Retorna una lista vacía si el archivo no existe
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Materia>) ois.readObject(); 
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar materias (puede que el archivo esté corrupto): " + e.getMessage());
            return new ArrayList<>();
        }
    }
}


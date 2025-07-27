// Importación de ArrayList (opcional para usar listas más adelante)
import java.util.ArrayList;

// Clase principal donde se ejecuta el programa
public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de la clase Persona
        Persona persona = new Persona("Juan", 20);
        persona.saludar(); // Llama al método saludar() de Persona
        persona.inscripcion();

        // Creamos una lista de estudiantes (objetos tipo Estudiante)
        ArrayList<Estudiante> ClaseNuevaEstudiante = new ArrayList<>();

        // Agregamos estudiantes a la lista
        ClaseNuevaEstudiante.add(new Estudiante ("Ana", 20, "Ingeniería"));
        ClaseNuevaEstudiante.add(new Estudiante("Luis", 22, "Medicina"));
        ClaseNuevaEstudiante.add(new Estudiante("Sofía", 21, "Derecho"));

        // Recorremos la lista: todos saludan y estudian
        for (Estudiante est : ClaseNuevaEstudiante) {
            est.saludar();   // Usa el método @Override de Estudiante
            est.estudiar();  // Método propio de Estudiante
            System.out.println("----------------------");
        }

    }
}
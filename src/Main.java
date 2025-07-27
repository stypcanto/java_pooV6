
import java.util.ArrayList;

// Clase principal donde se ejecuta el programa
public class Main {

    public static void main(String[] args) {
        // Creamos una lista que contendrá objetos del tipo MiembroUniversitario
        // Esto permite almacenar tanto Estudiantes como Profesores gracias al polimorfismo
        ArrayList<MiembroUniversitario> miembros = new ArrayList<>();

        // Agregamos estudiantes a la lista. Cada uno es una instancia de Estudiante
        // Estudiante hereda de MiembroUniversitario, por lo que pueden añadirse a la lista
        miembros.add(new Estudiante("Ana", 20, " Ingeniería"));
        miembros.add(new Estudiante("Luis", 22, " Medicina"));

        // Agregamos profesores a la lista. También son instancias de subclase de MiembroUniversitario
        miembros.add(new Profesor("Dra. Pérez", 45, " Biología"));
        miembros.add(new Profesor("Dr. Gómez", 50, " Matemáticas"));

        // Recorremos la lista con un bucle for-each.
        // Gracias al polimorfismo, podemos tratar a todos como MiembroUniversitario.
        for (MiembroUniversitario m : miembros) {
            // Cada miembro universitario saluda.
            // El método saludar() está sobrescrito en Estudiante y Profesor, por eso se invoca el correcto según el tipo.
            m.saludar();

            // Verificamos si el objeto actual es un Estudiante
            if (m instanceof Estudiante) {
                // Hacemos un "casting" a Estudiante para poder usar su método específico: estudiar()
                ((Estudiante) m).estudiar();
            }
            // Verificamos si es un Profesor
            else if (m instanceof Profesor) {
                // Hacemos un "casting" a Profesor para poder llamar a dictarClase()
                ((Profesor) m).dictarClase();
            }

            // Separador visual entre cada miembro para que la salida sea más clara
            System.out.println("------------------------");
        }
    }

}

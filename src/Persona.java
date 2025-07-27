// Definimos una clase llamada Persona
public class Persona {

    // Atributos privados: representan el estado de cada objeto Persona
    // 'private' significa que solo se puede acceder a estos datos desde esta clase
    private String nombre;
    private int edad;

    // Constructor: se llama automáticamente cuando se crea un nuevo objeto
    // Sirve para inicializar los valores de nombre y edad al crear una Persona
    public Persona(String nombre, int edad){
        // 'this.nombre' se refiere al atributo de la clase
        // 'nombre' (sin this) es el parámetro recibido
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método "getter" para obtener el valor del atributo 'nombre'
    public String getNombre(){
        return nombre;
    }

    // Método "setter" para cambiar el valor del atributo 'nombre'
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Getter para obtener el valor de 'edad'
    public int getEdad(){
        return edad;
    }

    // Setter para cambiar el valor de 'edad'
    public void setEdad(int edad){
        this.edad = edad;
    }

    // Método que imprime un saludo.
    // Este método usa los atributos del objeto para formar un mensaje.
    public void saludar(){
        System.out.println("Hola, soy " + nombre + " tengo " + edad + " años");
    }

    public void inscripcion(){
        System.out.println("Buen dia, mi nombre es "+nombre+" deseo inscribirme a la universidad, tengo "+edad+ " años");
    }


        // ✅ Nuevo método para practicar lógica
    public void cumplirAnios(){
            edad++; // Incrementa la edad en 1
            System.out.println(nombre + " ha cumplido años. Nueva edad: " + edad);
        }


}

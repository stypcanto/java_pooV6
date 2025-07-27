// Declaramos una clase abstracta: no se puede instanciar directamente
public abstract class MiembroUniversitario {

    // Atributos privados: solo accesibles desde esta clase
    private String nombre;
    private int edad;

    // Constructor para inicializar nombre y edad
    public MiembroUniversitario(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para el nombre (permite obtenerlo desde fuera de forma controlada)
    public String getNombre(){
        return nombre;
    }

    // Getter para la edad
    public int getEdad(){
        return edad;
    }

    // Método común que incrementa la edad del miembro y muestra un mensaje
    public void cumplirAnios() {
        this.edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años.");
    }

    // Método abstracto: no tiene cuerpo aquí, las subclases están obligadas a implementarlo
    public abstract void saludar();
}

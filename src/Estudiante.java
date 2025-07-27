public class Estudiante extends Persona {
        private String carrera;

        //Constructor
    public Estudiante(String nombre, int edad, String carrera){
        super(nombre, edad);
        this.carrera = carrera;
    }

    // Getter y Setter
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Método específico
    public void estudiar() {
        System.out.println(getNombre() + " está estudiando " + carrera);
    }

    // @Override en Java, una anotación que indica que estás sobreescribiendo un método que fue definido en una clase padre o interfaz. Es una buena práctica porque:
    //Te ayuda a evitar errores si escribes mal el nombre del método.
    //Mejora la legibilidad del código.
    //Obliga al compilador a verificar que realmente estás sobreescribiendo algo válido.

    @Override
    public void saludar() {
        // Redefine el saludo para incluir la carrera
        System.out.println("Hola, soy " + getNombre()+", tengo " + getEdad()+ " años y estoy estudiando " + carrera + " en la UTP");
    }
}

public class Persona extends MiembroUniversitario {
    public Persona(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + getNombre() + " y tengo "+ getEdad() + "años" );
    }
    public void inscripcion() {
        System.out.println(getNombre() + "se ha inscrito a la universidad");
    }

}
package modelo;
import interfaces.Estudiable;

public class Estudiante extends MiembroUniversitario implements Estudiable {
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy " + getNombre() + ", estudio " + carrera + " y tengo " + getEdad() + " años.");
    }

    @Override
    public void estudiar() {
        System.out.println(getNombre() + " está estudiando " + carrera + ".");
    }
}

package modelo;

import interfaces.Enseñable;

public class Profesor extends MiembroUniversitario implements Enseñable {
    private String especialidad;

    public Profesor(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    @Override
    public void saludar() {
        System.out.println("Buen día, soy el profesor " + getNombre() + ", especialista en " + especialidad + ".");
    }

    @Override
    public void dictarClase() {
        System.out.println(getNombre() + " está dictando clase de " + especialidad + ".");
    }
}

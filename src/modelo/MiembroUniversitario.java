package modelo;

import interfaces.Saludable;

public abstract class MiembroUniversitario implements Saludable {
    private String nombre;
    private int edad;

    public MiembroUniversitario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void cumplirAnios() {
        this.edad++;
    }
}

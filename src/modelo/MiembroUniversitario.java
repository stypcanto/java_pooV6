package modelo;

public class MiembroUniversitario {
    private int id;
    private String nombre;
    private int edad;
    private String tipo;
    private String carreraOCurso;

    public MiembroUniversitario(int id, String nombre, int edad, String tipo, String carreraOCurso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
        this.carreraOCurso = carreraOCurso;
    }

    public MiembroUniversitario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public MiembroUniversitario() {}

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getCarreraOCurso() { return carreraOCurso; }
    public void setCarreraOCurso(String carreraOCurso) { this.carreraOCurso = carreraOCurso; }
}

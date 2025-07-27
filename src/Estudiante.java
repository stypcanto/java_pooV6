public class Estudiante extends Persona{
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera){
        super(nombre, edad);
        this.carrera = carrera;
    }

    public void estudiar(){
        System.out.println(getNombre()+" está estudiando "+carrera+ ".");
    }

    @Override
    public void saludar(){
        System.out.println("Hola, soy "+getNombre() + ",  estudio" + carrera + " y tengo " + getEdad() + " años");
    }


}

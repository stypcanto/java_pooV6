import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Juan", 20);
        Persona persona2 = new Persona("Maria", 21);
        Persona persona3 = new Persona("Pedro", 22);
        Persona persona4 = new Persona("Ana", 23);
        Persona persona5 = new Persona("Jose", 24);

        // ✅ Usamos ArrayList para almacenar múltiples personas
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);
        personas.add(persona4);
        personas.add(persona5);

// ✅ Recorremos la lista e invocamos métodos
        for (Persona nuevafuncionpersona : personas) {
            nuevafuncionpersona.saludar();
            nuevafuncionpersona.cumplirAnios();
            nuevafuncionpersona.inscripcion();
        }

    }
}

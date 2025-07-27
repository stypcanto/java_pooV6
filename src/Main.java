public class Main {
    public static void main(String[] args) {
        // Creamos un objeto de tipo Persona y lo inicializamos con nombre y edad
        Persona persona1 = new Persona("Carlos", 28);

        // Usamos el método saludar para mostrar un mensaje
        persona1.saludar(); // Imprime: Hola, soy Carlos tengo 28 años

        // Cambiamos la edad usando el sy mi mainetter
        persona1.setEdad(29);

        // Volvemos a saludar con la nueva edad
        persona1.saludar(); // Imprime: Hola, soy Carlos tengo 29 años

        // También podemos acceder a los datos usando getters
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());

        // 1. Creamos un objeto (una instancia de la clase Persona)
        Persona persona2 = new Persona("Ana", 25);

        // 2. Llamamos a un método para que salude
        persona2.saludar(); // Imprime: Hola, soy Ana tengo 25 años

        // 3. Cambiamos su edad usando un método (encapsulamiento)
        persona2.setEdad(26);

        // 4. Volvemos a usar otro método
        System.out.println("Nueva edad: " + persona2.getEdad()); // Imprime: Nueva edad: 26

        Persona persona3 = new Persona("Juan", 25);
    persona3.inscripcion();

        Persona persona4 = new Persona("Maria", 25);
        persona4.cumplirAnios();
    }
}

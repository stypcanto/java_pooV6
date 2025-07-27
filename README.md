# 📘 Proyecto Java - Clase `Persona`

Este proyecto es una práctica básica de **Programación Orientada a Objetos (POO)** en Java. Se define una clase `Persona` con atributos privados, métodos de acceso (`get` / `set`), y métodos personalizados para ilustrar el uso de objetos, listas y lógica simple.

---

## 🧠 Conceptos Aplicados

- **Clase:** Plantilla para crear objetos.
- **Objeto:** Instancia de una clase (`persona1`, `persona2`, etc.).
- **Encapsulamiento:** Atributos privados con acceso mediante métodos públicos.
- **Constructor:** Inicializa atributos al crear un objeto.
- **Métodos:** Comportamientos del objeto (`saludar()`, `cumplirAnios()`, etc.).
- **Colecciones (`ArrayList`):** Lista de objetos manejada dinámicamente.

---

## 📄 Código de la Clase `Persona`

```java
public class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void saludar(){
        System.out.println("Hola, soy " + nombre + " tengo " + edad + " años");
    }

    public void inscripcion(){
        System.out.println("Buen día, mi nombre es " + nombre + 
        " deseo inscribirme a la universidad, tengo " + edad + " años");
    }

    // ✅ Método adicional para practicar lógica
    public void cumplirAnios(){
        edad++;
        System.out.println(nombre + " ha cumplido años. Nueva edad: " + edad);
    }
}

```
## 🚀 Código de la Clase Main
```java
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


```

## 🧩 Detalles Técnicos

### Clase `Persona`

**🔒 Atributos privados**

- `String nombre`
- `int edad`

**🧱 Constructor**

- Inicializa `nombre` y `edad` al crear una nueva persona.

**🔄 Getters y Setters**

- `getNombre()`, `setNombre()`
- `getEdad()`, `setEdad()`

**🔧 Métodos personalizados**

- `saludar()`: Imprime un saludo con el nombre y edad.
- `inscripcion()`: Simula una inscripción universitaria.
- `cumplirAnios()`: Incrementa la edad y muestra un mensaje.

---

### Clase `Main`

- Crea varias instancias de la clase `Persona`.
- Demuestra el uso de encapsulamiento y métodos públicos.
- Es útil para practicar la interacción entre objetos y lógica condicional (ampliable).

---

## ✅ Ejemplo de Salida
```plaintext
Hola, soy Juan tengo 20 años
Juan ha cumplido años. Nueva edad: 21
Buen día, mi nombre es Juan deseo inscribirme a la universidad, tengo 21 años
Hola, soy Maria tengo 21 años
Maria ha cumplido años. Nueva edad: 22
Buen día, mi nombre es Maria deseo inscribirme a la universidad, tengo 22 años
...

```

## 🛠️ Recomendaciones para Practicar

A continuación, se presentan algunas sugerencias para reforzar tus conocimientos en Programación Orientada a Objetos y el uso de colecciones en Java:

- ✅ **Crear el método `esMayorDeEdad()`**  
  Implementa un método que retorne `true` si la persona tiene 18 años o más, y `false` en caso contrario. Puedes usarlo para aplicar filtros u otras decisiones lógicas.

- ✅ **Leer datos desde el teclado usando `Scanner`**  
  Permite al usuario ingresar dinámicamente nombres y edades para agregar personas a la lista. Esto mejora la interacción y el manejo de entrada estándar.

- ✅ **Filtrar personas mayores de cierta edad**  
  Crea una función que recorra el `ArrayList` y muestre solo aquellas personas mayores de 21 años, o cualquier otro umbral definido por el usuario.

- ✅ **Ordenar la lista por edad**  
  Utiliza `Collections.sort()` junto con un `Comparator` personalizado para ordenar la lista de personas por edad de forma ascendente o descendente.

- ✅ **Crear un registro de estudiantes**  
  Simula un pequeño sistema de inscripción donde se puedan agregar, eliminar y mostrar estudiantes usando una lista (`ArrayList<Persona>`).

- ✅ **Agregar identificadores únicos**  
  Agrega un atributo `id` a la clase `Persona` para identificar a cada persona de forma única, útil para registros o búsquedas.

- ✅ **Implementar búsqueda por nombre o edad**  
  Crea métodos para buscar personas por nombre exacto o por rango de edad.

---

## 📚 Temas Aprendidos

Durante el desarrollo de este proyecto se han puesto en práctica los siguientes conceptos clave de Java:

- ⚙️ **Encapsulamiento:** Control de acceso a atributos mediante métodos `get` y `set`.
- 🧱 **Constructores:** Inicialización de objetos con valores predeterminados.
- 🔁 **Métodos:** Definición de acciones específicas para los objetos (`saludar()`, `cumplirAnios()`, etc.).
- 👥 **Interacción entre objetos:** Uso de múltiples instancias de la clase `Persona`.
- 🔣 **Lógica condicional y secuencial:** Control de flujo mediante estructuras como `if`, `for`, y métodos booleanos.
- 🔄 **Colecciones dinámicas:** Uso de `ArrayList` para almacenar y manipular grupos de objetos.
- ♻️ **Reutilización de código:** Organización modular que permite extender funcionalidades sin duplicar código.

---



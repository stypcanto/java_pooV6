# 🧠 Proyecto de Práctica POO en Java

Este proyecto fue creado con el objetivo de reforzar los conceptos fundamentales de **Programación Orientada a Objetos (POO)** en Java, como la creación de clases, objetos, encapsulamiento, métodos getters/setters y lógica básica.

## 📦 Estructura del Proyecto

El programa está compuesto por dos clases principales:

- `Main`: Contiene el método `main` donde se crean instancias de la clase `Persona` y se prueban sus métodos.
- `Persona`: Define la estructura de un objeto persona, con atributos privados, constructor y varios métodos para practicar la lógica.

---

## 🚀 Ejecución del Programa

Cuando ejecutas `Main`, el programa:

1. Crea objetos de la clase `Persona`.
2. Llama a métodos para saludar, cambiar la edad, y mostrar información.
3. Ejecuta métodos adicionales como `inscripcion()` y `cumplirAnios()`.

### 📋 Ejemplo de Salida esperada

```bash
Hola, soy Carlos tengo 28 años
Hola, soy Carlos tengo 29 años
Nombre: Carlos
Edad: 29
Hola, soy Ana tengo 25 años
Nueva edad: 26
Buen dia, mi nombre es Juan deseo inscribirme a la universidad, tengo 25años
Maria ha cumplido años. Nueva edad: 26
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

## 🛠️ Recomendaciones para Practicar

- Agrega más métodos a la clase `Persona`, como `presentarseConDocumento()` o `postularTrabajo()`.
- Usa un `ArrayList<Persona>` para manejar listas de personas y recorrerlas con bucles.
- Implementa condiciones (`if`, `switch`) o ciclos (`for`, `while`) para reforzar la lógica.
- Simula una base de datos simple en memoria agregando un sistema de búsqueda por nombre.

---

## 📚 Temas Aprendidos

- Encapsulamiento
- Constructores
- Métodos
- Interacción entre objetos
- Lógica condicional y secuencial
- Reutilización de código

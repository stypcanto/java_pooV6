
## 🧠 Fundamentos de Programación Orientada a Objetos (POO)

### 🔁 Herencia
La **herencia** permite que una clase (llamada *subclase*) herede atributos y métodos de otra clase (llamada *superclase*).

- En este proyecto, la clase `Estudiante` **hereda** de `Persona`, lo que significa que un estudiante tiene un `nombre` y una `edad`, al igual que una persona.
- Además, `Estudiante` puede **agregar** nuevos atributos (como `carrera`) o **sobrescribir** métodos para comportamientos más específicos.

**Beneficio:** Evita duplicar código y promueve la reutilización.

---

### 🔒 Encapsulamiento
El **encapsulamiento** consiste en proteger los datos internos de una clase y permitir el acceso a ellos únicamente a través de métodos públicos (*getters* y *setters*).

- Los atributos `nombre` y `edad` de la clase `Persona` son `private`, lo que impide modificarlos directamente desde fuera de la clase.
- En cambio, se accede a ellos mediante métodos públicos como `getNombre()` y `setEdad()`.

**Beneficio:** Mejora la seguridad y el control del acceso a los datos.

---

### 🎭 Polimorfismo
El **polimorfismo** permite que diferentes clases respondan de manera distinta a un mismo método, según su propio comportamiento.

- En este proyecto, tanto `Persona` como `Estudiante` tienen un método llamado `saludar()`.
- Pero en `Estudiante`, el método está **sobrescrito** para mostrar información adicional (la carrera), logrando un comportamiento diferente.

**Beneficio:** Permite usar un mismo método en distintas clases, pero con resultados adaptados a cada tipo de objeto.



📘 Estos principios son esenciales para escribir código mantenible, escalable y orientado a objetos.

---
## 📁 Estructura del Proyecto

```bash
├── Main.java          # Clase principal con el método main()
├── Persona.java       # Clase base que representa a una persona
├── Estudiante.java    # Subclase que extiende Persona y añade el atributo 'carrera'
```
## 🧱 Clases Implementadas

### 🔹 Persona
**Atributos:**
- `nombre`
- `edad`

**Métodos:**
- `saludar()`: Muestra un saludo personalizado.
- `inscripcion()`: Simula una inscripción a la universidad.
- `cumplirAnios()`: Incrementa la edad de la persona.

---

### 🔹 Estudiante (extiende Persona)
**Atributo adicional:**
- `carrera`

**Métodos:**
- `estudiar()`: Indica que el estudiante está estudiando su carrera.
- `saludar()`: Sobrescribe el método de la clase padre para incluir la carrera.

---

## 🚀 Ejecución del Programa

El programa crea:

- Una persona (`Persona`)
- Una lista de estudiantes (`ArrayList<Estudiante>`)

Cada estudiante:

- Saluda (método sobrescrito)
- Informa que está estudiando su carrera

---

## 📌 Resultados Esperados

Al ejecutar el programa, verás una salida similar a la siguiente:

```text
Hola, soy Juan y tengo 20 años.
Buen día, mi nombre es Juan y deseo inscribirme a la universidad. Tengo 20 años.
======================
Hola, soy Ana, tengo 20 años y estudio Ingeniería.
Ana está estudiando Ingeniería.
----------------------
Hola, soy Luis, tengo 22 años y estudio Medicina.
Luis está estudiando Medicina.
----------------------
Hola, soy Sofía, tengo 21 años y estudio Derecho.
Sofía está estudiando Derecho.
----------------------

```
---

## ✍️ Recomendaciones para Seguir Practicando

- 🔸 **Crear una clase `Universidad`** que administre la lista de estudiantes.
- 🔸 **Agregar nuevas clases** como `Profesor` o `Curso` para enriquecer el modelo.
- 🔸 **Implementar interfaces** que representen habilidades o roles, por ejemplo: `Enseñable`, `Evaluable`.
- 🔸 **Agregar lógica dinámica** para:
    - Cambiar la carrera de un estudiante.
    - Hacer que las personas cumplan años en tiempo de ejecución (simular el paso del tiempo).


# 🎓 Sistema de Miembros Universitarios en Java

Este proyecto es un ejercicio de Programación Orientada a Objetos (POO) en Java. Simula una estructura de miembros universitarios (profesores y estudiantes) utilizando conceptos clave como:

- ✅ Clases abstractas
- ✅ Herencia
- ✅ Polimorfismo
- ✅ Sobrescritura de métodos (`@Override`)
- ✅ Uso de `ArrayList` para almacenar objetos

---

## 📂 Estructura de Clases

### 🔹 `MiembroUniversitario` (Clase abstracta)

Esta es la **clase base** de la jerarquía. Representa cualquier miembro de la universidad (estudiante, profesor, etc.).

```java
public abstract class MiembroUniversitario {
    private String nombre;
    private int edad;

    // Métodos comunes
    public void cumplirAnios() {...}
    public abstract void saludar(); // método abstracto
}
```

#### 🔸 No se puede instanciar directamente. Obliga a las subclases a implementar el método saludar().

## 🔹 Persona (Subclase concreta de MiembroUniversitario)
Clase intermedia que representa a cualquier persona concreta.

```java
public class Persona extends MiembroUniversitario {
    public void inscripcion() {...}
    public void saludar() {...}
}
```

## 🔹 Estudiante (Subclase de Persona)
Clase que extiende de Persona y representa a un estudiante.

```java
public class Estudiante extends Persona {
    private String carrera;

    public void estudiar() {...}
    @Override public void saludar() {...}
}

```


## 🔹 Profesor (Subclase de MiembroUniversitario) 
Clase que extiende de Persona y representa a un estudiante.

```java
public class Profesor extends MiembroUniversitario {
    private String especialidad;

    public void dictarClase() {...}
    @Override public void saludar() {...}
}


```

## 🚀 Ejecución del Programa
La clase Main es la encargada de ejecutar el programa:

```java
ArrayList<MiembroUniversitario> miembros = new ArrayList<>();
```

Se agregan instancias de `Estudiante` y `Profesor`, aprovechando el **polimorfismo**:  
todos son tratados como `MiembroUniversitario`, pero ejecutan su versión específica del método `saludar()`.

También se usa `instanceof` para verificar el tipo real del objeto y llamar a métodos específicos como:

- `estudiar()` si es un `Estudiante`
- `dictarClase()` si es un `Profesor`

---

## 🧠 Conceptos Aplicados

| Concepto           | Aplicación                                                                 |
|--------------------|----------------------------------------------------------------------------|
| **Clase abstracta** | `MiembroUniversitario` no se puede instanciar directamente                |
| **Herencia**        | `Estudiante`, `Profesor`, `Persona` heredan de `MiembroUniversitario`     |
| **Polimorfismo**    | Lista `ArrayList<MiembroUniversitario>` que acepta objetos diferentes      |
| **Sobrescritura**   | Métodos `saludar()` redefinidos en cada clase hija                         |
| **Encapsulamiento** | Uso de `private` y getters como `getNombre()`                              |

---

## 🖥️ Ejemplo de salida en consola

```text
Hola, soy Ana,  estudio Ingeniería y tengo 20 años
Ana está estudiando Ingeniería.
------------------------
Hola, soy Luis,  estudio Medicina y tengo 22 años
Luis está estudiando Medicina.
------------------------
Buen día, soy el profesor Dra. Pérez, especialista en  Biología.
Dra. Pérez está dictando clase de  Biología.
------------------------
Buen día, soy el profesor Dr. Gómez, especialista en  Matemáticas.
Dr. Gómez está dictando clase de  Matemáticas.
------------------------

```

## ✍️ Recomendaciones para practicar

A continuación, se sugieren ejercicios y conceptos técnicos clave que te permitirán **reforzar la Programación Orientada a Objetos (POO)** y avanzar hacia el dominio de frameworks profesionales como **Spring Boot**:

### 🧱 Extiende el modelo

- ✅ **Agrega más subclases** como `Administrativo` o `Investigador` que hereden de `MiembroUniversitario`, cada una con comportamientos propios.
- ✅ **Aplica herencia múltiple mediante interfaces**, como `Asistente`, `Evaluador` o `Mentor`. Implementa métodos abstractos como `asistirEvento()` o `evaluarTrabajo()`.

### 🏛️ Gestión y estructura

- 🏫 **Crea una clase `Universidad`** que tenga una lista de miembros (`ArrayList<MiembroUniversitario>`) y métodos para:
    - Registrar nuevos miembros.
    - Listar estudiantes o profesores por criterios.
    - Contar cuántos hay por tipo.

### 💾 Persistencia de datos

- 📂 **Almacena y recupera información** usando:
    - Archivos planos (`FileWriter`, `BufferedReader`).
    - Bases de datos usando **JDBC**, lo cual te prepara para **JPA y Spring Data JPA** en Spring Boot.

### 🧪 Mejora la lógica y separación

- 🔄 **Aplica principios SOLID**:
    - Separa responsabilidades por clase.
    - Usa la inversión de dependencias para simular capas (servicio, modelo, repositorio).
- ✅ Agrega **tests unitarios** con JUnit para simular flujos como inscripción, evaluación o asistencia.

### 🔄 Aplica principios SOLID

-  Aplicar los principios **SOLID** te permitirá escribir código más mantenible, escalable y fácil de probar. A continuación, cómo puedes integrarlos a tu modelo actual:

| Principio | Aplicación práctica |
|----------|---------------------|
| **S** - Single Responsibility Principle (Responsabilidad única) | Cada clase debe encargarse de una sola cosa. Por ejemplo, `Estudiante` solo contiene lógica relacionada al estudiante; una nueva clase `InscripcionService` podría manejar la inscripción. |
| **O** - Open/Closed Principle (Abierto/Cerrado) | Puedes extender clases como `MiembroUniversitario` sin modificarlas. Agrega nuevas clases como `Administrador` sin tocar las anteriores. |
| **L** - Liskov Substitution Principle | Las clases hijas como `Profesor` o `Estudiante` deben poder usarse sin errores donde se espere un `MiembroUniversitario`. Tu código actual ya lo cumple con polimorfismo. |
| **I** - Interface Segregation Principle | Crea interfaces pequeñas y específicas, como `Asistente`, `Evaluador`, en lugar de una sola interfaz con muchos métodos. |
| **D** - Dependency Inversion Principle | Simula capas como en Spring Boot: usa clases como `RepositorioEstudiantes`, `ServicioInscripciones`, etc., que dependan de **abstracciones** (interfaces), no de implementaciones concretas. |

#### 🧪 Ejemplo de separación en capas:

```java
// Capa modelo
public class Estudiante extends MiembroUniversitario { ... }

// Capa repositorio (simulada)
public class RepositorioEstudiantes {
    public void guardar(Estudiante e) {
        // Simula guardar en archivo o BD
    }
}

// Capa servicio
public class ServicioEstudiantes {
    private RepositorioEstudiantes repo;

    public ServicioEstudiantes(RepositorioEstudiantes repo) {
        this.repo = repo;
    }

    public void inscribir(Estudiante e) {
        // Lógica de negocio
        System.out.println("Inscribiendo estudiante...");
        repo.guardar(e);
    }
}
```

### 🛠️ Prepárate para Spring Boot

- Aprende a estructurar código en **capas**:
    - `modelo` → tus clases como `Estudiante`
    - `servicio` → clases que gestionan lógica como inscripción
    - `repositorio` → clases que acceden a datos
- Empieza a trabajar con anotaciones simuladas como:
  ```java
  //@Entity
  //@Service
  //@Repository


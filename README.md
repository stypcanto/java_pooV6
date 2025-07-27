# 🧠 Proyecto de Práctica POO en Java con Principios SOLID

Este proyecto ejemplifica el uso avanzado de Programación Orientada a Objetos (POO) en Java, aplicando los principios **SOLID**, así como conceptos clave como clases abstractas, interfaces, herencia, polimorfismo y encapsulamiento.

---

## 📁 Estructura del Proyecto

```bash
src/
├── Main.java
├── modelo/
│ ├── MiembroUniversitario.java
│ ├── Estudiante.java
│ └── Profesor.java
├── interfaces/
│ ├── Saludable.java
│ ├── Estudiable.java
│ └── Enseñable.java
├── servicio/
│ └── UniversidadService.java
└── util/
└── SaludoPrinter.java
```


---

## 🧱 Clases e Interfaces

### 🔹 `MiembroUniversitario` (clase abstracta)
Clase base que **no puede instanciarse directamente**.

- Define atributos comunes como `nombre` y `edad`.
- Implementa la interfaz `Saludable`.
- Contiene el método `cumplirAnios()`.
- Obliga a sus subclases a implementar `saludar()`.

```java
public abstract class MiembroUniversitario implements Saludable {
    // Atributos y métodos comunes
}
```

## 🔹 Interfaces

| Interfaz     | Método requerido | Implementada por        |
|--------------|------------------|--------------------------|
| `Saludable`  | `saludar()`      | `MiembroUniversitario`  |
| `Estudiable` | `estudiar()`     | `Estudiante`            |
| `Enseñable`  | `dictarClase()`  | `Profesor`              |

---

## 🔹 Clases concretas

- `Estudiante` extiende `MiembroUniversitario` e implementa la interfaz `Estudiable`.
- `Profesor` extiende `MiembroUniversitario` e implementa la interfaz `Enseñable`.
- Cada clase sobrescribe el método `saludar()` de forma personalizada para mostrar un comportamiento específico según el rol del miembro universitario.

---

## 🛠️ Servicio

### `UniversidadService.java`

- Aplica el principio de **Responsabilidad Única (SRP)**.
- Su función es **procesar una lista de miembros universitarios**.
```java
public void procesarMiembros(List<MiembroUniversitario> miembros)

```
- Utiliza polimorfismo e interfaces para determinar el comportamiento correcto según el tipo de objeto (`Estudiante`, `Profesor`, etc.).
- Se apoya en `SaludoPrinter` para desacoplar la lógica de presentación.

```java
public class UniversidadService {
    public void procesarMiembros(List<MiembroUniversitario> miembros) {
        for (MiembroUniversitario miembro : miembros) {
            miembro.saludar();

            if (miembro instanceof Estudiable) {
                ((Estudiable) miembro).estudiar();
            }

            if (miembro instanceof Enseñable) {
                ((Enseñable) miembro).dictarClase();
            }
        }
    }
}
```



## 🖨️ Utilidad

### `SaludoPrinter.java`

- Clase encargada **únicamente de mostrar saludos en consola**.
- Aplica el **principio de inversión de dependencias (DIP)** al separar la lógica de presentación de la lógica del servicio.
- Esta clase puede ser modificada o reemplazada sin afectar la lógica principal de negocio.

```java
public class SaludoPrinter {
    public void imprimirSaludo(String mensaje) {
        System.out.println(mensaje);
    }
}
```

## 🧪 Ejecución

- Main.java
```java
public class Main {
    public static void main(String[] args) {
        List<MiembroUniversitario> miembros = new ArrayList<>();
        miembros.add(new Estudiante("Ana", 20, "Sistemas"));
        miembros.add(new Profesor("Dr. Pérez", 45, "Matemáticas"));

        UniversidadService universidadService = new UniversidadService();
        universidadService.procesarMiembros(miembros);
    }
}
```
## 🧠 Conceptos Aplicados

| Concepto           | Implementación                                                                 |
|--------------------|--------------------------------------------------------------------------------|
| Clase abstracta    | `MiembroUniversitario` no puede instanciarse directamente                      |
| Herencia           | `Estudiante`, `Profesor` extienden de `MiembroUniversitario`                   |
| Polimorfismo       | Se usa `List<MiembroUniversitario>` para almacenar objetos heterogéneos        |
| Interfaces         | Contratos como `Estudiable`, `Enseñable`, `Saludable` para comportamientos     |
| Encapsulamiento    | Uso de atributos `private` y acceso mediante getters                           |
| Principios SOLID   | SRP, DIP aplicados en clases como `UniversidadService` y `SaludoPrinter`       |


---

## ✅ Recomendaciones para Profundizar

- 🔸 Crea nuevas subclases como `Administrativo`, `Investigador`, etc.
- 🔸 Añade interfaces como `Evaluador`, `Coordinador`, etc.
- 🔸 Usa patrones de diseño como:
  - Factory Pattern (para crear diferentes tipos de miembros)
  - Strategy Pattern (para estrategias de evaluación o enseñanza)
- 🔸 Simula persistencia:
  - Guarda y lee miembros desde archivos `.txt` o `.csv`
  - Usa **JDBC** para conexión real con una base de datos
- 🔸 Organiza en capas:
  - `modelo` → Clases del dominio
  - `servicio` → Reglas de negocio
  - `vista` → Presentación o consola
- 🔸 Agrega pruebas automatizadas:
  - Usa **JUnit** para probar comportamientos
  - Aplica TDD en nuevos desarrollos

---

## 🚀 Siguiente paso: Migrar a Spring Boot

Una vez dominados los conceptos anteriores, este proyecto puede evolucionar a una arquitectura moderna con Spring Boot:

| Aspecto                        | En Spring Boot                                     |
|-------------------------------|----------------------------------------------------|
| Separación en capas           | `@Controller`, `@Service`, `@Repository`           |
| Inyección de dependencias     | `@Autowired`, `@Component`                         |
| Persistencia real             | Con `Spring Data JPA` y entidades @Entity          |
| Controladores REST            | `@RestController`, `@GetMapping`, `@PostMapping`   |
| DevTools & Testing            | `spring-boot-devtools`, `spring-boot-starter-test`|

> 📌 Comprender bien la **POO en Java** te da una gran ventaja para dominar frameworks modernos como **Spring Boot**.

---

## 📚 Recursos Recomendados

- [Java Brains - Spring Boot Series](https://www.youtube.com/user/koushks)
- [Clean Code - Robert C. Martin](https://www.oreilly.com/library/view/clean-code/9780136083238/)
- [Documentación oficial de Spring Boot](https://spring.io/projects/spring-boot)
- [Refactoring Guru - SOLID Principles](https://refactoring.guru/design-patterns)

---


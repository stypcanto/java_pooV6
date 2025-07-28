# 🏛️ Sistema de Gestión Universitaria - Java + PostgreSQL

Este proyecto implementa un sistema de gestión de miembros universitarios (profesores y estudiantes) aplicando los principios de **Programación Orientada a Objetos (POO)** en Java, y persistiendo los datos mediante **JDBC** y una base de datos **PostgreSQL**.


---
## ⚙️ Tecnologías Usadas

- **Java 17**
- **JDBC (Java Database Connectivity)**
- **PostgreSQL 15**
- **Docker & Docker Compose**
- **IntelliJ IDEA** (IDE recomendada)

---


## 🧱 Estructura del Proyecto



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

---

## 🚀 Características

- Registro de miembros (profesores y estudiantes).
- Listado de todos los miembros registrados.
- Eliminación de un miembro por ID.
- Persistencia en base de datos PostgreSQL usando JDBC.
- Diseño orientado a objetos con herencia e interfaces.
- Separación en capas: modelo, DAO, servicio y presentación.

---

## 🔧 Requisitos

- Java 17 o superior
- PostgreSQL instalado (o Docker)
- IntelliJ IDEA, VS Code u otro IDE
- Driver JDBC para PostgreSQL (`postgresql-42.7.2.jar`)

---

## 🛠️ Configuración de la Base de Datos

1. **Crear la base de datos**
```sql
CREATE DATABASE universidad;
```
2. Crear tabla
  ```sql
CREATE TABLE miembro_universitario (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100),
    edad INT,
    tipo VARCHAR(50), -- Profesor o Estudiante
    carrera_o_curso VARCHAR(100)
);
``` 
3. Conexión en ConexionBD.java

```java
String url = "jdbc:postgresql://localhost:5432/universidad";
String usuario = "usuario";
String clave = "clave123";

```

## ▶️ Ejecución
1. Compila el proyecto en tu IDE o desde terminal.

2. Ejecuta la clase Main.java.

3. Se insertarán datos de prueba y se eliminará un miembro por ID.

##  🖥️ Ejemplo de salida

```yaml
✅ Miembro insertado correctamente.
📋 Lista de miembros:
- ID: 1, Nombre: Laura Torres, Edad: 22, Tipo: Estudiante, Carrera/Curso: Ingeniería de Sistemas

🗑️ Eliminando miembro con ID 5...

📋 Lista de miembros actualizada:
...

## 📦 Uso de JDBC

Este proyecto **no utiliza frameworks ORM** como Hibernate ni plataformas como Spring. En su lugar, emplea **JDBC puro** para conectarse y realizar operaciones sobre una base de datos PostgreSQL. Esto permite al desarrollador:

- Comprender a bajo nivel cómo funciona el acceso a datos.
- Controlar directamente la apertura y cierre de conexiones, manejo de `PreparedStatement`, `ResultSet`, etc.
- Aplicar prácticas básicas de optimización SQL y evitar sobreingeniería para proyectos pequeños o educativos.

> ✅ Esta decisión es ideal para quienes están comenzando con Java y desean dominar primero los fundamentos de la conexión y persistencia de datos.

---

## 📚 Principios de Programación Aplicados

El diseño del proyecto sigue varios principios fundamentales de la Programación Orientada a Objetos (POO):

- **Herencia:**  
  Las clases `Estudiante` y `Profesor` heredan de `MiembroUniversitario`, compartiendo atributos comunes como `nombre` y `edad`, y especializando su comportamiento.

- **Interfaces:**  
  Se definen `Estudiable` y `Ensenable`, permitiendo aplicar **polimorfismo** y garantizar contratos de comportamiento.

- **Encapsulamiento:**  
  Todos los atributos están declarados como `private` y se accede a ellos mediante métodos `get` y `set`, protegiendo la integridad del estado interno.

- **Responsabilidad Única (SRP):**  
  Cada clase tiene una única función:
  - `MiembroUniversitarioDAO` gestiona la interacción con la base de datos.
  - `UniversidadService` orquesta la lógica del negocio.
  - Las clases del paquete `modelo` representan entidades del dominio.

---

## 💡 Posibles Mejoras Futuras

A continuación, se describen algunas mejoras técnicas que se podrían implementar para escalar o robustecer el sistema:

### 1. 🖥️ Interfaz Gráfica (GUI) o Web

- Crear una interfaz **Swing o JavaFX** para el manejo visual de los miembros.
- Alternativamente, migrar a una **aplicación web** usando Servlets, JSP o frameworks como Spring Boot + Thymeleaf/React.

### 2. ✏️ Funcionalidad de Actualización (UPDATE)

- Agregar métodos en `MiembroUniversitarioDAO` y `UniversidadService` para modificar un registro existente (por ID).
- Incluir validaciones previas a la actualización para asegurar consistencia.

### 3. 🔄 Abstracción DAO

- Crear una interfaz genérica `BaseDAO<T>` con métodos `insertar`, `listar`, `eliminar`, `actualizar`.
- Implementar esta interfaz desde `MiembroUniversitarioDAO`, facilitando pruebas unitarias y reutilización del patrón DAO.

### 4. ✅ Validación de Datos

- Validar entradas del usuario desde consola, GUI o formularios web.
- Asegurar que edades sean valores positivos, nombres no estén vacíos, y el tipo sea válido (`Profesor` o `Estudiante`).

### 5. 🧪 Pruebas Unitarias

- Añadir pruebas usando **JUnit 5** para la lógica de `UniversidadService`.
- Simular operaciones de base de datos con **H2 en memoria** para pruebas de integración.

### 6. 📁 Persistencia avanzada

- Añadir soporte para relaciones 1:N, por ejemplo: un profesor con múltiples cursos.
- Incluir más entidades (Curso, Aula, Horario) y relaciones entre ellas.

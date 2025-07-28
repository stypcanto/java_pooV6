import Servicio.UniversidadService;

public class Main {
    public static void main(String[] args) {
        UniversidadService service = new UniversidadService();

/*
        // Profesores
        service.registrarMiembro("Dr. Carlos Pérez", 45, "Profesor", "Matemática");
        service.registrarMiembro("Dra. Ana Gómez", 50, "Profesor", "Biología");
        service.registrarMiembro("Mg. Luis Torres", 39, "Profesor", "Física");
        service.registrarMiembro("Ing. Sandra Díaz", 42, "Profesor", "Sistemas");
        service.registrarMiembro("Dr. Jorge Herrera", 47, "Profesor", "Historia");

        // Estudiantes
        service.registrarMiembro("Laura Torres", 22, "Estudiante", "Ingeniería de Sistemas");
        service.registrarMiembro("Pedro Rojas", 20, "Estudiante", "Arquitectura");
        service.registrarMiembro("Camila Fernández", 21, "Estudiante", "Psicología");
        service.registrarMiembro("José Martínez", 23, "Estudiante", "Administración");
        service.registrarMiembro("Lucía Castro", 19, "Estudiante", "Enfermería");

        // Más profesores
        service.registrarMiembro("Dra. Beatriz Lozano", 55, "Profesor", "Química");
        service.registrarMiembro("Ing. Marcos Luján", 41, "Profesor", "Electrónica");

        // Más estudiantes
        service.registrarMiembro("Andrés Mejía", 24, "Estudiante", "Derecho");
        service.registrarMiembro("Gabriela Chávez", 20, "Estudiante", "Contabilidad");
        service.registrarMiembro("Fernando Paredes", 22, "Estudiante", "Medicina");

        // Mostrar miembros registrados
        service.mostrarMiembros();
*/

        // Luego llamas al método para eliminar
        System.out.println("\n🗑️ Eliminando miembro con ID 5 correspondiente a Ing. sandra Diaz");
        service.eliminarMiembroPorId(5);

        // Mostrar para confirmar
        System.out.println("\n📋 Lista de miembros actualizada:");
        service.mostrarMiembros();


     /*
        // 🔁 MOSTRAR NUEVAMENTE PARA CONFIRMAR
        System.out.println("\n📋 Lista de miembros actualizada:");
        service.mostrarMiembros();

        */

    }
}

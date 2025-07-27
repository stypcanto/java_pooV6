import modelo.Estudiante;
import modelo.Profesor;
import modelo.MiembroUniversitario;
import Servicio.UniversidadService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Creamos una lista con miembros de diferentes tipos
        List<MiembroUniversitario> miembros = new ArrayList<>();
        miembros.add(new Estudiante("Ana", 20, "Ingeniería de Sistemas"));
        miembros.add(new Estudiante("Carlos", 21, "Medicina"));
        miembros.add(new Profesor("Dra. Martínez", 45, "Biología"));
        miembros.add(new Profesor("Dr. González", 52, "Matemáticas"));

        // Creamos el servicio que se encargará de operar sobre los miembros
        UniversidadService universidadService = new UniversidadService();

        // Ejecutamos la lógica usando polimorfismo e interfaces
        universidadService.procesarMiembros(miembros);
    }
}

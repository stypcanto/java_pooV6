package Servicio;

import interfaces.Estudiable;
import interfaces.Enseñable;
import modelo.MiembroUniversitario;

import java.util.List;

public class UniversidadService {
    public void procesarMiembros(List<MiembroUniversitario> miembros) {
        for (MiembroUniversitario m : miembros) {
            m.saludar();

            if (m instanceof Estudiable) {
                ((Estudiable) m).estudiar();
            }

            if (m instanceof Enseñable) {
                ((Enseñable) m).dictarClase();
            }

            System.out.println("---------------------");
        }
    }
}

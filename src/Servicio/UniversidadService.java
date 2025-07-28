package Servicio;

import dao.MiembroUniversitarioDAO;
import modelo.MiembroUniversitario;

import java.util.List;

public class UniversidadService {

    private MiembroUniversitarioDAO miembroDAO;

    public UniversidadService() {
        this.miembroDAO = new MiembroUniversitarioDAO();
    }

    // Registrar nuevo miembro
    public void registrarMiembro(String nombre, int edad, String tipo, String carreraOCurso) {
        MiembroUniversitario nuevo = new MiembroUniversitario();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setTipo(tipo);
        nuevo.setCarreraOCurso(carreraOCurso);

        miembroDAO.insertar(nuevo);
    }

    // Mostrar todos los miembros
    public void mostrarMiembros() {
        List<MiembroUniversitario> miembros = miembroDAO.obtenerTodos();
        System.out.println("📋 Lista de miembros:");
        for (MiembroUniversitario m : miembros) {
            System.out.println("- ID: " + m.getId() +
                    ", Nombre: " + m.getNombre() +
                    ", Edad: " + m.getEdad() +
                    ", Tipo: " + m.getTipo() +
                    ", Carrera/Curso: " + m.getCarreraOCurso());
        }
    }

    // Eliminar miembro por ID
    public void eliminarMiembroPorId(int id) {
        miembroDAO.eliminarPorId(id);
    }
}

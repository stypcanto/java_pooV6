package dao;

import db.ConexionBD;
import modelo.MiembroUniversitario;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MiembroUniversitarioDAO {

    // Insertar un nuevo miembro
    public void insertar(MiembroUniversitario miembro) {
        String sql = "INSERT INTO miembro_universitario (nombre, edad, tipo, carrera_o_curso) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, miembro.getNombre());
            stmt.setInt(2, miembro.getEdad());
            stmt.setString(3, miembro.getTipo());
            stmt.setString(4, miembro.getCarreraOCurso());

            stmt.executeUpdate();
            System.out.println("✅ Miembro insertado correctamente.");

        } catch (SQLException e) {
            System.out.println("❌ Error al insertar miembro: " + e.getMessage());
        }
    }

    // Obtener todos los miembros
    public List<MiembroUniversitario> obtenerTodos() {
        List<MiembroUniversitario> lista = new ArrayList<>();
        String sql = "SELECT * FROM miembro_universitario";

        try (Connection conn = ConexionBD.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                MiembroUniversitario m = new MiembroUniversitario();
                m.setId(rs.getInt("id"));
                m.setNombre(rs.getString("nombre"));
                m.setEdad(rs.getInt("edad"));
                m.setTipo(rs.getString("tipo"));
                m.setCarreraOCurso(rs.getString("carrera_o_curso"));

                lista.add(m);
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al obtener miembros: " + e.getMessage());
        }

        return lista;
    }

    // (Opcional) Eliminar por ID
    public void eliminarPorId(int id) {
        String sql = "DELETE FROM miembro_universitario WHERE id = ?";

        try (Connection conn = ConexionBD.obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int filas = stmt.executeUpdate();

            if (filas > 0) {
                System.out.println("✅ Miembro eliminado con ID: " + id);
            } else {
                System.out.println("⚠️ No se encontró miembro con ID: " + id);
            }

        } catch (SQLException e) {
            System.out.println("❌ Error al eliminar miembro: " + e.getMessage());
        }
    }
}

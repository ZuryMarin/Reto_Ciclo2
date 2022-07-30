/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsJdbc;
import Clases.Elecciones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.LinkedList;

/**
 *
 * @author Zury
 */
public class Modelo_Elecciones {

    ClsJdbc jdbc;

    public Modelo_Elecciones() {
        jdbc = new ClsJdbc();
        jdbc.CrearConexion();
    }

    public boolean crearEleccion(Elecciones eleccion) throws SQLException {
        boolean fueAgregado = false;
        try {
            String sql = "insert into elecciones(descripcion, fechaInicio, fechaFinal, estado) values(?,?,?,?)";

            PreparedStatement stmt = this.jdbc.conexion.prepareStatement(sql);
            stmt.setString(1, eleccion.getDescripcion());
            stmt.setString(2, eleccion.getFecha_Inicio());
            stmt.setString(3, eleccion.getFecha_Final());
            stmt.setString(4, eleccion.getEstado_Eleccion());

            int cantidad = stmt.executeUpdate();
            fueAgregado = (cantidad > 0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la base de datos " + e);
        } finally {
            this.jdbc.conexion.close();
        }
        return fueAgregado;
    }

    public boolean eliminarEleccion(String descripcion) throws SQLException {
        boolean fueEliminado = false;

        try {
            String sql = "delete from elecciones where descripcion = ?";
            PreparedStatement stmt = this.jdbc.conexion.prepareStatement(sql);
            stmt.setString(1, descripcion);

            int cantidad = stmt.executeUpdate();
            fueEliminado = (cantidad > 0);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse con la base de datos " + e);
        } finally {
            this.jdbc.conexion.close();
        }
        return fueEliminado;
    }

    public LinkedList<Elecciones> obtenerElecciones() {
        try {

            LinkedList<Elecciones> listaElecciones = new LinkedList<>();

            String sql = "SELECT * FROM elecciones";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                int id_Eleccion = resultados.getInt("id_Eleccion");
                int id_Ganador = resultados.getInt("id_Ganador");
                String descripcion = resultados.getString("descripcion");
                String fechaInicio = resultados.getString("fechaInicio");
                String fechaFinal = resultados.getString("fechaFinal");
                String estado = resultados.getString("estado");

                Elecciones elec = new Elecciones(id_Eleccion, id_Ganador, descripcion, fechaInicio, fechaFinal, estado);

                listaElecciones.add(elec);
            }
            return listaElecciones;
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
            return null;
        }
    }
}

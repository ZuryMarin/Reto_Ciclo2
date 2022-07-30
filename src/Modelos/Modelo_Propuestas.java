/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsJdbc;
import Clases.Candidatos;
import Clases.Propuestas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Zury
 */
public class Modelo_Propuestas {
    
    ClsJdbc jdbc;

    public Modelo_Propuestas() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }
    
    public boolean CrearPropuesta(Propuestas propuesta, Candidatos candidato) throws SQLException{
        boolean fueAgregado = false;
        
        try {
            String sql = "insert into propuestas (id_Candidato, sector, descripcion, fecha) values (?,?,?,?)";

            PreparedStatement stmt = this.jdbc.conexion.prepareStatement(sql);
            stmt.setInt(1, candidato.getId_Candidato());
            stmt.setString(2, propuesta.getSector());
            stmt.setString(3, propuesta.getDescripcion());
            stmt.setString(4, propuesta.getFecha());
            
            int cantidad = stmt.executeUpdate();
            fueAgregado = (cantidad > 0);
            
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos " + e.getMessage());
        }finally {
            this.jdbc.conexion.close();
        }
        
        return fueAgregado;
    }
    
    public LinkedList<Propuestas> listPropuestas() throws SQLException{
        try {
            LinkedList<Propuestas> listapropuestas = new LinkedList<>();

            String sql = "SELECT p.id_Propuesta, c.nombre, p.sector, p.descripcion, p.fecha FROM propuestas p left join candidato c on p.id_Candidato = c.id_Candidato";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                int id_propuesta = resultados.getInt("id_Propuesta");
                String Candidato = resultados.getString("nombre");
                String sector = resultados.getString("sector");
                String descripcion = resultados.getString("descripcion");
                String fecha = resultados.getString("fecha");

                Propuestas candi = new Propuestas(id_propuesta, Candidato, sector, descripcion, fecha);
                listapropuestas.add(candi);
            }
            return listapropuestas;

            }catch (Exception e) {
            System.out.println("Error al conectar con la base de datos " + e.getMessage());
        }finally{
            
        }

            return null;
    }
    
    public boolean eliminarPropuesta(int id_propuesta) throws SQLException {
        boolean fueEliminado = false;

        try {
            String sql = "delete from propuestas where id_Propuesta = ?";
            PreparedStatement stmt = this.jdbc.conexion.prepareStatement(sql);
            stmt.setInt(1, id_propuesta);
            
            int cantidad = stmt.executeUpdate();
            fueEliminado = (cantidad > 0);

        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos " + e.getMessage());
        } finally {
            this.jdbc.conexion.close();
        }

        return fueEliminado;
    }
    
    
    
}

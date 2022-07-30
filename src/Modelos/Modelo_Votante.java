/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import Clases.Votantes;
import Clases.ClsJdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Zury
 */
public class Modelo_Votante {
    
    ClsJdbc jdbc;

    public Modelo_Votante() {
        
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }

    public boolean crearVotante(Votantes votante) throws SQLException {
        boolean fueAgregado = false;
        try {
            String sql = "insert into votante (numeroDocumento, nombre, telefono, correo, direccion) values (?,?,?,?,?)";

            PreparedStatement stmt = this.jdbc.conexion.prepareStatement(sql);
            stmt.setString(1, votante.getNumeroDocumento());
            stmt.setString(2, votante.getNombre());
            stmt.setString(3, votante.getTelefono());
            stmt.setString(4, votante.getCorreo());
            stmt.setString(5, votante.getDireccion());
           
            int cantidad = stmt.executeUpdate();
            fueAgregado = (cantidad > 0);

        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos " + e.getMessage());
        } finally {
            this.jdbc.conexion.close();
        }
        return fueAgregado;
    }

    public boolean actuarlizarVotante(Votantes votante) throws SQLException {
        boolean fueAgregado = false;

        try {
            String sql = "update votante set nombre = ? ,telefono = ? ,correo = ? ,Direccion = ? where numeroDocumento = ?";
            PreparedStatement stmt = this.jdbc.conexion.prepareStatement(sql);
            stmt.setString(1, votante.getNombre());
            stmt.setString(2, votante.getTelefono());
            stmt.setString(3, votante.getCorreo());
            stmt.setString(4, votante.getDireccion());
            stmt.setString(5, votante.getNumeroDocumento());

            int cantidad = stmt.executeUpdate();
            fueAgregado = (cantidad > 0);

        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos " + e.getMessage());
        } finally {
            this.jdbc.conexion.close();
        }

        return fueAgregado;
    }

    public LinkedList<Votantes> cargarCandidato(Votantes votante) throws SQLException {

        try {

            LinkedList<Votantes> listaVotante = new LinkedList<>();

            String sql = "SELECT * FROM votante";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                String numeroDocumento = resultados.getString("id_Votante");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");
                String direccion = resultados.getString("direccion");

                Votantes candi = new Votantes(0, numeroDocumento, nombre, telefono, correo, direccion);
                listaVotante.add(candi);
            }
            return listaVotante;

            }catch (Exception e) {
            System.out.println("Error al conectar con la base de datos " + e.getMessage());
        }finally{
            this.jdbc.conexion.close();
        }

            return null;
        }
    
    

    public boolean eliminarVotante(String numeroDoc) throws SQLException {
        boolean fueEliminado = false;

        try {
            String sql = "delete from votante where numeroDocumento = ?";
            PreparedStatement stmt = this.jdbc.conexion.prepareStatement(sql);
            stmt.setString(1, numeroDoc);
            
            int cantidad = stmt.executeUpdate();
            fueEliminado = (cantidad > 0);

        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos " + e.getMessage());
        } finally {
            this.jdbc.conexion.close();
        }

        return fueEliminado;
    }
    
    public LinkedList<Votantes> ObtenerVotantes() {

        try {

            LinkedList<Votantes> listaVotante = new LinkedList<>();

            String sql = "SELECT * FROM Votante";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                int id_Votante = resultados.getInt("Id_Votante");
                String numeroDocumento = resultados.getString("numeroDocumento");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");
                String direccion = resultados.getString("direccion");
                
              

                Votantes candi = new Votantes(id_Votante, numeroDocumento, nombre, telefono, correo, direccion);

                listaVotante.add(candi);

            }

            return listaVotante;

        } catch (Exception e) {

            System.out.println("error" + e.getMessage());
            return null;
        }

    }

}


    


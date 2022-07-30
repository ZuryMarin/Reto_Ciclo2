/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.Candidatos;
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
public class Modelo_Candidato {

    ClsJdbc jdbc;

    public Modelo_Candidato() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }

    public boolean crearCandidato(Candidatos candidato) throws SQLException {
        boolean fueAgregado = false;
        try {
            String sql = "insert into candidato (numeroDocumento, nombre, telefono, correo, PartidoPolit, Ciudad, Descripcion, nombre_Eleccion) values (?,?,?,?,?,?,?,?)";

            PreparedStatement stmt = this.jdbc.conexion.prepareStatement(sql);
            stmt.setString(1, candidato.getNumeroDocumento());
            stmt.setString(2, candidato.getNombre());
            stmt.setString(3, candidato.getTelefono());
            stmt.setString(4, candidato.getCorreo());
            stmt.setString(5, candidato.getPartidoPolit());
            stmt.setString(6, candidato.getCiudad());
            stmt.setString(7, candidato.getDescripcion());
            stmt.setString(8, candidato.getNombre_Eleccion());

            int cantidad = stmt.executeUpdate();
            fueAgregado = (cantidad > 0);

        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos " + e.getMessage());
        } finally {
            this.jdbc.conexion.close();
        }
        return fueAgregado;
    }

    public boolean actuarlizarCandidato(Candidatos candidato) throws SQLException {
        boolean fueAgregado = false;

        try {
            String sql = "update candidato set nombre = ? ,telefono = ? ,correo = ? ,PartidoPolit = ? ,Ciudad = ? ,Descripcion = ? where numeroDocumento = ?";
            PreparedStatement stmt = this.jdbc.conexion.prepareStatement(sql);
            
            stmt.setString(1, candidato.getNombre());
            stmt.setString(2, candidato.getTelefono());
            stmt.setString(3, candidato.getCorreo());
            stmt.setString(4, candidato.getPartidoPolit());
            stmt.setString(5, candidato.getCiudad());
            stmt.setString(6, candidato.getDescripcion());
            stmt.setString(7, candidato.getNumeroDocumento());

            int cantidad = stmt.executeUpdate();
            fueAgregado = (cantidad > 0);

        } catch (Exception e) {
            System.out.println("Error al conectar con la base de datos " + e.getMessage());
        } finally {
            this.jdbc.conexion.close();
        }

        return fueAgregado;
    }

    public LinkedList<Candidatos> cargarCandidato(Candidatos candidato) throws SQLException {

        try {

            LinkedList<Candidatos> listaCandidatos = new LinkedList<>();

            String sql = "SELECT * FROM tbl_candidatos";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                String partidoPolitico = resultados.getString("partido_politico");
                String descripcion = resultados.getString("descripcion");
                String numeroDocumento = resultados.getString("id_candidato");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");

                Candidatos candi = new Candidatos(0, numeroDocumento, nombre, telefono, correo, partidoPolitico, correo, descripcion);
                listaCandidatos.add(candi);
            }
            return listaCandidatos;

            }catch (Exception e) {
            System.out.println("Error al conectar con la base de datos " + e.getMessage());
        }finally{
            this.jdbc.conexion.close();
        }

            return null;
        }
    
    

    public boolean eliminarCandidato(String numeroDoc) throws SQLException {
        boolean fueEliminado = false;

        try {
            String sql = "delete from candidato where numeroDocumento = ?";
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
    
    public LinkedList<Candidatos> ObtenerCandidatos() {

        try {

            LinkedList<Candidatos> listaCandidatos = new LinkedList<>();

            String sql = "SELECT * FROM candidato";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {

                int id_Candidato = resultados.getInt("Id_Candidato");
                String numeroDocumento = resultados.getString("numeroDocumento");
                String nombre = resultados.getString("nombre");
                String telefono = resultados.getString("telefono");
                String correo = resultados.getString("correo");
                String PartidoPolit = resultados.getString("PartidoPolit");
                String ciudad = resultados.getString("ciudad");
                String Descripcion = resultados.getString("Descripcion");

                Candidatos candi = new Candidatos(id_Candidato, numeroDocumento, nombre, telefono, correo, PartidoPolit, ciudad, Descripcion);

                listaCandidatos.add(candi);

            }

            return listaCandidatos;

        } catch (Exception e) {

            System.out.println("error" + e.getMessage());
            return null;
        }

    }

}


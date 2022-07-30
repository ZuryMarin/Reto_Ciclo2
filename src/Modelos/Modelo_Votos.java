/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.Candidatos;
import Clases.ClsJdbc;
import Clases.ClsVotos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Zury
 */
public class Modelo_Votos {

    ClsJdbc jdbc;
    public Modelo_Votos() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }
    
    public boolean agregarVoto(ClsVotos voto) throws SQLException{
        boolean fueAgregado = false;
        try {
            String sql = "insert into votos values(?,?)";

            PreparedStatement stmt = this.jdbc.conexion.prepareStatement(sql);
            stmt.setString(1, voto.getCandidato());
            stmt.setString(2, voto.getDocumentoVotante());
            
            int cantidad = stmt.executeUpdate();
            fueAgregado = (cantidad > 0);
            
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos " + e.getMessage());
        } finally {
            this.jdbc.conexion.close();
        }
        
        return fueAgregado;
    }
    
    public LinkedList<ClsVotos> listarVotos(){
        
        try {
            LinkedList<ClsVotos> ListaVotos = new LinkedList<>();
            String sql = "select * from votos ";
            PreparedStatement stmt = this.jdbc.conexion.prepareStatement(sql);
            
            ResultSet resultados = stmt.executeQuery();

            while (resultados.next()) {

                String candidato = resultados.getString("candidato");
                String documentoVotante = resultados.getString("documentoVotante");

                ClsVotos v = new ClsVotos(candidato, documentoVotante);
                ListaVotos.add(v);
            }
            return ListaVotos;
            
        } catch (Exception e) {
            System.out.println("Error al conectar a la base de datos " + e.getMessage());
        }
        return null;
    }
    
}

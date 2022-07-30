/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import Clases.Candidatos;
import Clases.Propuestas;
import Modelos.Modelo_Propuestas;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Zury
 */
public class CtlPropuestas {
    
    Modelo_Propuestas modelo;

    public CtlPropuestas() {
        this.modelo = new Modelo_Propuestas();
    }
    
    public boolean AgregarPropuesta(Propuestas propuesta, Candidatos candidato) throws SQLException{
        return this.modelo.CrearPropuesta(propuesta, candidato);
    }
    
    public LinkedList<Propuestas> obtenerPropuestas() throws SQLException{
        return this.modelo.listPropuestas();
    }
    
    public boolean EliminarPropuesta(int id_propuesta) throws SQLException{
        return this.modelo.eliminarPropuesta(id_propuesta);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import Clases.Votantes;
import Modelos.Modelo_Votante;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Zury
 */
public class CtlVotante {
    
    Modelo_Votante modeloC;

    public CtlVotante() {
        modeloC = new Modelo_Votante();
    }
    
    public boolean AgregarVotantes(Votantes votante) throws SQLException{
        return this.modeloC.crearVotante(votante);
    }
    
    public LinkedList<Votantes>ObtenerVotantes(){
        return this.modeloC.ObtenerVotantes();
    }
    
    public boolean EliminarVotantes(String numeroDoc) throws SQLException{
        return this.modeloC.eliminarVotante(numeroDoc);
    }
    
    public boolean ActualizarVotante(Votantes votante) throws SQLException{
        return this.modeloC.actuarlizarVotante(votante);
    }
    
    
}

    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.Candidatos;
import Modelos.Modelo_Candidato;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Zury
 */
public class CtlCandidato {
    
    Modelo_Candidato modeloC;

    public CtlCandidato() {
        modeloC = new Modelo_Candidato();
    }
    
    public boolean AgregarCandidato(Candidatos candidato) throws SQLException{
        return this.modeloC.crearCandidato(candidato);
    }
    
    public LinkedList<Candidatos>ObtenerCandidatos(){
        return this.modeloC.ObtenerCandidatos();
    }
    
    public boolean EliminarCandidato(String numeroDoc) throws SQLException{
        return this.modeloC.eliminarCandidato(numeroDoc);
    }
    
    public boolean ActualizarCandidato(Candidatos candidato) throws SQLException{
        return this.modeloC.actuarlizarCandidato(candidato);
    }
}

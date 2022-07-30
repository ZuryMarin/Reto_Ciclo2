/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsVotos;
import Modelos.Modelo_Votos;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Zury
 */
public class CtlVotos {

    Modelo_Votos modelo;
    public CtlVotos() {
        modelo = new Modelo_Votos();
    }
    
    public boolean AgregarVotos(ClsVotos votos) throws SQLException{
        return this.modelo.agregarVoto(votos);
    }
    
    public LinkedList<ClsVotos> ListaVotos(){
        return this.modelo.listarVotos();
    }
    
}

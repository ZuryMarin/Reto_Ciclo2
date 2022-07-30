/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import Modelos.Modelo_Elecciones;
import Clases.Elecciones;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Zury
 */

public class CtlElecciones {
    
    Modelo_Elecciones modeloE;

    public CtlElecciones() {
        modeloE = new Modelo_Elecciones();
    }
    
    public boolean CrearEleccion(Elecciones eleccion) throws SQLException{
        return this.modeloE.crearEleccion(eleccion);
    }
    
    public boolean EliminarEleccion(String descripcion) throws SQLException{
        return this.modeloE.eliminarEleccion(descripcion);
    }
    
    public LinkedList<Elecciones> ObtenerElecciones(){
        return this.modeloE.obtenerElecciones();
    }
    
    
    
}

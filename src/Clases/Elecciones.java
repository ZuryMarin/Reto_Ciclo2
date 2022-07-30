/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Zury
 */
public class Elecciones {
    
    private int id_Eleccion;
    private int id_Ganador;
    private String Descripcion;
    private String Fecha_Inicio;
    private String Fecha_Final;
    private String Estado_Eleccion;

    public Elecciones() {
    }

    public Elecciones(int id_Eleccion, int id_Ganador, String Descripcion, String Fecha_Inicio, String Fecha_Final, String Estado_Eleccion) {
        this.id_Eleccion = id_Eleccion;
        this.id_Ganador = id_Ganador;
        this.Descripcion = Descripcion;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Fecha_Final = Fecha_Final;
        this.Estado_Eleccion = Estado_Eleccion;
    }
     
    
    
    public int getId_Eleccion() {
        return id_Eleccion;
    }

    public void setId_Eleccion(int id_Eleccion) {
        this.id_Eleccion = id_Eleccion;
    }

    public int getId_Ganador() {
        return id_Ganador;
    }

    public void setId_Ganador(int id_Ganador) {
        this.id_Ganador = id_Ganador;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(String Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    public String getFecha_Final() {
        return Fecha_Final;
    }

    public void setFecha_Final(String Fecha_Final) {
        this.Fecha_Final = Fecha_Final;
    }

    public String getEstado_Eleccion() {
        return Estado_Eleccion;
    }

    public void setEstado_Eleccion(String Estado_Eleccion) {
        this.Estado_Eleccion = Estado_Eleccion;
    }

    @Override
    public String toString() {
        return "Elecciones{" + "id_Eleccion=" + id_Eleccion + ", id_Ganador=" + id_Ganador + ", Descripcion=" + Descripcion + ", Fecha_Inicio=" + Fecha_Inicio + ", Fecha_Final=" + Fecha_Final + ", Estado_Eleccion=" + Estado_Eleccion + '}';
    }
    
    
            
}

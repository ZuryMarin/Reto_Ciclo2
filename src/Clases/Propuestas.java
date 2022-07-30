/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Zury
 */
public class Propuestas {
    
    private int idPropuesta;
    private int id_Candidato;
    private String Candidato;
    private String sector;
    private String descripcion;
    private String fecha;

    public Propuestas() {
    }
    
    
    
     public Propuestas(String sector, int idCandidato, String descripcion) {
        this.id_Candidato = idCandidato;
        this.sector = sector;
        this.descripcion = descripcion;

    }
     public Propuestas(int idPropuesta, int idCandidato, String sector, String descripcion, String fecha) {
        this.id_Candidato = idCandidato;
        this.idPropuesta = idPropuesta;
        this.sector = sector;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Propuestas(int id_propuesta, String Candidato, String sector, String descripcion, String fecha) {
        this.idPropuesta = id_propuesta;
        this.Candidato = Candidato;
        this.sector = sector;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public String getCandidato() {
        return Candidato;
    }

    public void setCandidato(String Candidato) {
        this.Candidato = Candidato;
    }

    public int getIdPropuesta() {
        return idPropuesta;
    }

    public void setIdPropuesta(int idPropuesta) {
        this.idPropuesta = idPropuesta;
    }
    
    public int getId_Candidato() {
        return id_Candidato;
    }

    public void setId_Candidato(int id_Candidato) {
        this.id_Candidato = id_Candidato;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

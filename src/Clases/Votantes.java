/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.LinkedList;

/**
 *
 * @author Zury
 */
public class Votantes{
    
    private int id_Votante;
    private String numeroDocumento;
    private String nombre;
    private String telefono;
    private String correo;
    private String Direccion;
    private LinkedList<String> Votantes;

    public Votantes() {
    }

    public Votantes(int id_Votante, String numeroDocumento, String nombre, String telefono, String correo, String Direccion) {
        this.id_Votante = id_Votante;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.Direccion = Direccion;
    }

    public int getId_Votante() {
        return id_Votante;
    }

    public void setId_Votante(int id_Votante) {
        this.id_Votante = id_Votante;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public LinkedList<String> getVotantes() {
        return Votantes;
    }

    public void setVotantes(LinkedList<String> Votantes) {
        this.Votantes = Votantes;
    }

    
    
    
}

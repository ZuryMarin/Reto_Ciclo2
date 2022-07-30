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
public class Candidatos {

    private int id_Candidato;
    private int id_Eleccion;
    private String numeroDocumento;
    private String nombre;
    private String telefono;
    private String correo;
    private String PartidoPolit;
    private String Ciudad;
    private String Descripcion;
    private String Nombre_Eleccion;

    public String getNombre_Eleccion() {
        return Nombre_Eleccion;
    }

    public void setNombre_Eleccion(String Nombre_Eleccion) {
        this.Nombre_Eleccion = Nombre_Eleccion;
    }
    private LinkedList<String> propuestas;

    public Candidatos() {
    }
    
    public Candidatos(int id_Candidato,int id_Eleccion, String numeroDocumento, String nombre, String telefono, String correo, String PartidoPolit, String Ciudad, String Descripcion) {
        this.id_Candidato = id_Candidato;
        this.id_Eleccion = id_Eleccion;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.PartidoPolit = PartidoPolit;
        this.Ciudad = Ciudad;
        this.Descripcion = Descripcion;
    }

    public Candidatos(int id_Candidato, String numeroDocumento, String nombre, String telefono, String correo, String PartidoPolit, String Ciudad, String Descripcion) {
        this.id_Candidato = id_Candidato;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.PartidoPolit = PartidoPolit;
        this.Ciudad = Ciudad;
        this.Descripcion = Descripcion;
    }

    public int getId_Candidato() {
        return id_Candidato;
    }

    public void setId_Candidato(int id_Candidato) {
        this.id_Candidato = id_Candidato;
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

    public String getPartidoPolit() {
        return PartidoPolit;
    }

    public void setPartidoPolit(String PartidoPolit) {
        this.PartidoPolit = PartidoPolit;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public LinkedList<String> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(LinkedList<String> propuestas) {
        this.propuestas = propuestas;
    }

    public int getId_Eleccion() {
        return id_Eleccion;
    }

    public void setId_Eleccion(int id_Eleccion) {
        this.id_Eleccion = id_Eleccion;
    }
    
    

    
    
    

}
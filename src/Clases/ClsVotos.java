/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Zury
 */
public class ClsVotos {
    String candidato;
    String documentoVotante;

    public ClsVotos(String candidato, String documentoVotante) {
        this.candidato = candidato;
        this.documentoVotante = documentoVotante;
    }

    public ClsVotos() {
    }

    public String getCandidato() {
        return candidato;
    }

    public void setCandidato(String candidato) {
        this.candidato = candidato;
    }

    public String getDocumentoVotante() {
        return documentoVotante;
    }

    public void setDocumentoVotante(String documentoVotante) {
        this.documentoVotante = documentoVotante;
    }
    
    
}

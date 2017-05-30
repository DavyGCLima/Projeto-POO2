/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author reida
 */
public class Advogado extends PessoaFisica{
    private String oab;
    private Processo[] processos;
    private usuario usuario;

    public Advogado() {
    }

    public Advogado(String oab, Processo[] processos, usuario usuario) {
        this.oab = oab;
        this.processos = processos;
        this.usuario = usuario;
    }

    public String getOab() {
        return oab;
    }

    public Processo[] getProcessos() {
        return processos;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public void setProcessos(Processo[] processos) {
        this.processos = processos;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }
    
    
}

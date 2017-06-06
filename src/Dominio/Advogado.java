/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author reida
 */
public class Advogado {
    private String oab;
    private ArrayList<Processo> processos;
    private usuario usuario;
    private PessoaFisica pessoaFisica;

    public Advogado() {
    }

    public Advogado(String oab, ArrayList<Processo> processos, usuario usuario, PessoaFisica pessoaFisica) {
        this.oab = oab;
        this.processos = processos;
        this.usuario = usuario;
        this.pessoaFisica = pessoaFisica;
    }

    public String getOab() {
        return oab;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public void setUsuario(usuario usuario) {
        this.usuario = usuario;
    }
    
    
}

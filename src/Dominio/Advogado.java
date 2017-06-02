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
public class Advogado extends PessoaFisica {
    private PessoaFisica pessoa;
    private String oab;
    private ArrayList<Processo> processos;
    private usuario usuario;

    public Advogado() {
    }

    public Advogado(PessoaFisica pessoa, String oab, usuario usuario, int cpf, Date dataNasc, String estadoCivil, String naturalidade, String nacionaldiade, String nome, int numero, String email, String site, String endereco, ArrayList<Processo> processos) {
        super(cpf, dataNasc, estadoCivil, naturalidade, nacionaldiade, nome, numero, email, site, endereco, processos);
        this.pessoa = pessoa;
        this.oab = oab;
        this.processos = processos;
        this.usuario = usuario;
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

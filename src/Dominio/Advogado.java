/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author reida
 */
public class Advogado extends PessoaFisica{
    private String oab;
    private ArrayList<Processo> processos;
    private usuario usuario;

    public Advogado() {
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

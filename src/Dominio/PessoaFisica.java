/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Date;

/**
 *
 * @author reida
 */
public class PessoaFisica extends Pessoa {
    private int cpf;
    private Date dataNasc;
    private String estadoCivil;
    private String naturalidade;
    private String nacionaldiade;

    public PessoaFisica() {
    }

    public int getCpf() {
        return cpf;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public String getNacionaldiade() {
        return nacionaldiade;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public void setNacionaldiade(String nacionaldiade) {
        this.nacionaldiade = nacionaldiade;
    }
    
    
}

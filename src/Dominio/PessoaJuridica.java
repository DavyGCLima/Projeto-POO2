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
public class PessoaJuridica extends Pessoa {
    private int cnpj;
    private String razaoSoc;
    private String inscricaoEstadual;
    private String inscricaoMunicipal;

    public PessoaJuridica() {
    }


    public int getCnpj() {
        return cnpj;
    }

    public String getRazaoSoc() {
        return razaoSoc;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setRazaoSoc(String razaoSoc) {
        this.razaoSoc = razaoSoc;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }
    
    
}

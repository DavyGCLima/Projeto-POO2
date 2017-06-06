/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Collection;


/**
 *
 * @author reida
 */
public abstract class Pessoa {
    private String nome;
    private int numero;
    private String email;
    private String site;
    private String endereco;
    private Collection<Processo> processos;

    public Pessoa(String nome, int numero, String email, String site, String endereco, Collection<Processo> processos) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.site = site;
        this.endereco = endereco;
        this.processos = processos;
    }

    public Pessoa() {
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }

    public String getSite() {
        return site;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

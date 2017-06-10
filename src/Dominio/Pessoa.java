/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Collection;
import javax.persistence.*;

/**
 *
 * @author reida
 */
@MappedSuperclass
public abstract class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="idPessoa")
    private int idPessoa;
    
    @Column(insertable = true, updatable = true, length = 45, nullable = true)
    private String nome;
    
    @Column(insertable = true, updatable = true, nullable = true)
    private int numero;
    
    @Column(insertable = true, updatable = true, length = 45, nullable = true)
    private String email;
    
    @Column(insertable = true, updatable = true, length = 45, nullable = true)
    private String site;
    
    @Column(insertable = true, updatable = true, length = 45, nullable = true)
    private String endereco;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Cliente", schema = "ProjectPOO2", joinColumns = @JoinColumn(name = "idPessoa"),
            inverseJoinColumns = @JoinColumn(name = "idProcesso"))
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

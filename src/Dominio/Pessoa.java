/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Collection;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


/**
 *
 * @author reida
 */
@MappedSuperclass
public abstract class Pessoa {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPessoa;
 
    @Column(nullable = false, insertable = true, updatable = true, length = 45)
    private String nome;
    
    @Column(nullable = false, insertable = true, updatable = true)
    private int numero;
    
    @Column(nullable = false, insertable = true, updatable = true, length = 45)
    private String email;
    
    @Column(nullable = false, insertable = true, updatable = true, length = 45)
    private String site;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idEndereco", insertable = true, updatable = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Endereco endereco;
    
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "cliente")
//    @JoinTable(name = "Cliente", schema = "ProjectPOO2",
//            joinColumns ={@JoinColumn(name = "idPessoa")},
//            inverseJoinColumns = {@JoinColumn(name = "idProcesso")})
    private Collection<Processo> processos;

    public Pessoa(String nome, int numero, String email, String site, Endereco endereco, Collection<Processo> processos) {
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.site = site;
        this.endereco = endereco;
        this.processos = processos;
    }

    public Pessoa(String nome, int numero, String email, String site, Endereco endereco) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.numero = numero;
        this.email = email;
        this.site = site;
        this.endereco = endereco;
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

    public Endereco getEndereco() {
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

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}

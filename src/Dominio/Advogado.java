/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author reida
 */
@Entity @Table(schema = "ProjectPOO2")
public class Advogado {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="idAdvogado")
    private int id;
    @Column(unique = true ,nullable = false, updatable = true, insertable = true, length = 45)
    private String oab;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Cliente", schema = "ProjectPOO2", joinColumns@JoinColumn(name = "idAdvogado"),
        inverseJoinColumns = @JoinColumn(name = "idProcesso"))
    private Collection<Processo> processos;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "idAdvogado", insertable = true, updatable = true, unique = true, nuable = false)
    @Fetch(FetchMode.JOIN)
    private Usuario usuario;
    
    private PessoaFisica pessoaFisica;

    public Advogado() {
    }

    public Advogado(String oab, Collection<Processo> processos, Usuario usuario, PessoaFisica pessoaFisica) {
        this.oab = oab;
        this.processos = processos;
        this.usuario = usuario;
        this.pessoaFisica = pessoaFisica;
    }

    public String getOab() {
        return oab;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}

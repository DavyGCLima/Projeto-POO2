/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Collection;
import java.util.Date;
import javax.persistence.*;
/**
 *
 * @author reida
 */
@Entity
@Table(schema = "ProjectPOO2")
public class Advogado{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idAdvogado")
    private int id;
    @OneToOne @JoinColumn(name="idPessoaFisicia")
    private PessoaFisica pessoa;
    @Column(nullable = false, insertable = true, updatable = true)
    private String oab;
    @ManyToMany(fetch = FetchType.EAGER)
     @JoinTable(name = "ParticipaAdvogado", schema = "ProjectPOO2",
            joinColumns = @JoinColumn(name = "idAdvogado"), 
            inverseJoinColumns = @JoinColumn(name = "idProcesso"))
    private Collection<Processo> processos;
    @OneToOne @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Advogado() {
    }

    public Advogado(PessoaFisica pessoa, String oab, Usuario usuario, int cpf, 
            Date dataNasc, String estadoCivil, String naturalidade, String nacionaldiade, 
            String nome, int numero, String email, String site, String endereco,
            Collection<Processo> processos) {
        this.pessoa = pessoa;
        this.oab = oab;
        this.processos = processos;
        this.usuario = usuario;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}

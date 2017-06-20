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
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PessoaFisica extends Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idPessoaFisica", nullable = false)
    private int id;
    @Column(nullable = false)
    private int cpf;
    @Column(nullable = false)
    private Date dataNasc;
    @Column(nullable = false, insertable = true, updatable = true, length = 45)
    private String estadoCivil;
    @Column(nullable = false, insertable = true, updatable = true, length = 45)
    private String naturalidade;
    @Column(nullable = false, insertable = true, updatable = true, length = 45)
    private String nacionaldiade;

    public PessoaFisica(int cpf, Date dataNasc, String estadoCivil, String naturalidade, 
            String nacionaldiade, String nome, int numero, String email, String site, 
            String endereco, Collection<Processo> processos) {
        super(nome, numero, email, site, endereco, processos);
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.estadoCivil = estadoCivil;
        this.naturalidade = naturalidade;
        this.nacionaldiade = nacionaldiade;
    }    

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
/**
 *
 * @author reida
 */
@Entity
@Table(name = "Processo")
public class Processo implements Serializable {
    @Column(nullable = false, updatable = true, insertable = true, length = 45)
    private String Titulo;
    
    @Column(nullable = false, updatable = true, insertable = true, length = 45)
    private String Pasta;
    
    @Column(nullable = false, updatable = true, insertable = true)
    private int numero;
    
    @Column(nullable = false, updatable = true, insertable = true, length = 45)
    private String justiça;
    
    @Column(nullable = false, updatable = true, insertable = true, length = 45)
    private String instancia;
    
    @Column(nullable = false, updatable = true, insertable = true, length = 45)
    private String orgao;
    
    @Column(nullable = false, updatable = true, insertable = true)
    private double valorProcesso;
    
    @Column(nullable = false, updatable = true, insertable = true, length = 45)
    private String descricao;
    
    @Column(nullable = false, updatable = true, insertable = true, length = 45)
    private String acao;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "ParticipaAdvogado", schema = "ProjectPOO2",
            joinColumns = @JoinColumn(name = "idProcesso"), 
            inverseJoinColumns = @JoinColumn(name = "idAdvogado"))
    private Collection<Advogado> advogados;
    
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Cliente", schema = "ProjectPOO2",
            joinColumns = @JoinColumn(name = "idProcesso"), 
            inverseJoinColumns = @JoinColumn(name = "idPessoa"))
    private Collection<PessoaFisica> cliente;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idEstado")
    @Fetch(FetchMode.JOIN)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private EstadoProcesso estadoProcesso;
    
    @OneToMany(mappedBy = "processo", fetch = FetchType.LAZY)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Collection<Audiencia> audiencias;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPagamento", insertable = true, updatable = true, nullable = false)
    private Pagamento pagamento;
    
    @Id
    @Column(name = "idProcesso", nullable = false)
    private int idProcesso;

    public Processo() {
    }

    public Processo(String Titulo, String Pasta, int numero, String justiça, 
            String instancia, String orgao, double valorProcesso, String descricao, 
            String acao, Collection<Advogado> advogados, Collection<PessoaFisica> cliente, 
            EstadoProcesso estadoProcesso, Collection<Audiencia> audiencias, 
            Pagamento pagamento, int idProcesso) {
        this.Titulo = Titulo;
        this.Pasta = Pasta;
        this.numero = numero;
        this.justiça = justiça;
        this.instancia = instancia;
        this.orgao = orgao;
        this.valorProcesso = valorProcesso;
        this.descricao = descricao;
        this.acao = acao;
        this.advogados = advogados;
        this.cliente = cliente;
        this.estadoProcesso = estadoProcesso;
        this.audiencias = audiencias;
        this.pagamento = pagamento;
        this.idProcesso = idProcesso;
    }

  
    
    
    
    public String getTitulo() {
        return Titulo;
    }

    public String getPasta() {
        return Pasta;
    }

    public int getNumero() {
        return numero;
    }

    public String getJustiça() {
        return justiça;
    }

    public String getInstancia() {
        return instancia;
    }

    public String getOrgao() {
        return orgao;
    }

    public double getValorProcesso() {
        return valorProcesso;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAcao() {
        return acao;
    }

    public EstadoProcesso getEstadoProcesso() {
        return estadoProcesso;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setPasta(String Pasta) {
        this.Pasta = Pasta;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setJustiça(String justiça) {
        this.justiça = justiça;
    }

    public void setInstancia(String instancia) {
        this.instancia = instancia;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public void setValorProcesso(double valorProcesso) {
        this.valorProcesso = valorProcesso;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }
    public void setEstadoProcesso(EstadoProcesso estadoProcesso) {
        this.estadoProcesso = estadoProcesso;
    }
    
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public int getidProcesso() {
        return idProcesso;
    }

    public void setidProcesso(int idProcesso) {
        this.idProcesso = idProcesso;
    }

       
}

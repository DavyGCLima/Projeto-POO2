/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author reida
 */
@Entity
@Table(schema = "ProjectPOO2")
public class Processo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="idProcesso")
    private int idProcesso;
    @Column(unique = true, nullable = false, insertable = true, updatable = true, length = 45)
    private String Titulo;
    @Column(unique = true, nullable = false, insertable = true, updatable = true, length = 45)
    private String Pasta;
    @Column(unique = true, nullable = false, insertable = true, updatable = true)
    private int numero;
    @Column(unique = true, nullable = false, insertable = true, updatable = true, length = 45)
    private String justiça;
    @Column(unique = true, nullable = false, insertable = true, updatable = true, length = 45)
    private String instancia;
    @Column(unique = true, nullable = false, insertable = true, updatable = true, length = 45)
    private String orgao;
    @Column(unique = true, nullable = false, insertable = true, updatable = true)
    private double valorProcesso;
    @Column(unique = true, nullable = false, insertable = true, updatable = true, length = 45)
    private String descricao;
    @Column(unique = true, nullable = false, insertable = true, updatable = true, length = 45)
    private String acao;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="Responsabiliza", schema = "ProjectPOO2", joinColumns = @JoinColumn(name = "idProcesso"),
            inverseJoinColumns = @JoinColumn(name = "idAdvogado"))
    private ArrayList<Advogado> advogados;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "Cliente", schema = "ProjectPOO2", joinColumns = @JoinColumn(name = "idProcesso"),
            inverseJoinColumns = @JoinColumn(name = "idPessoa"))
    private ArrayList<Pessoa> cliente;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEstadoProcesso", insertable = true, updatable = true, unique = true)
    @Fetch(FetchMode.JOIN)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private EstadoProcesso estadoProcesso;
    @OneToMany(mappedBy = "processo", fetch = FetchType.LAZY)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private ArrayList<Audciencia> audiencias;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPagamento", insertable = true, updatable = true, nullable = false)
    @Fetch(FetchMode.JOIN)
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private Pagamento pagamento;

    public Processo() {
    }

    public Processo(String Titulo, String Pasta, int numero, String justiça, String instancia, String orgao, double valorProcesso, String descricao, String acao, ArrayList<Advogado> advogados, ArrayList<Pessoa> cliente, EstadoProcesso estadoProcesso, ArrayList<Audciencia> audiencias, Pagamento pagamento) {
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

       
}

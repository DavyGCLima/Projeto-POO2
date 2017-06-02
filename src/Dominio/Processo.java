/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author reida
 */
public class Processo {
    private String Titulo;
    private String Pasta;
    private int numero;
    private String justiça;
    private String instancia;
    private String orgao;
    private double valorProcesso;
    private String descricao;
    private String acao;
    private ArrayList<Advogado> advogados;
    private ArrayList<Pessoa> cliente;
    private EstadoProcesso estadoProcesso;
    private ArrayList<Audciencia> audiencias;
    private Pagamento pagamento;

    public Processo() {
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

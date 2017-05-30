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

    public Processo() {
    }

    public Processo(String Titulo, String Pasta, int numero, String justiça, String instancia, String orgao, double valorProcesso, String descricao, String acao) {
        this.Titulo = Titulo;
        this.Pasta = Pasta;
        this.numero = numero;
        this.justiça = justiça;
        this.instancia = instancia;
        this.orgao = orgao;
        this.valorProcesso = valorProcesso;
        this.descricao = descricao;
        this.acao = acao;
    }
    
    
}

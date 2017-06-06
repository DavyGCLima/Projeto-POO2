/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Collection;
import java.util.Date;

/**
 *
 * @author reida
 */
public class Pagamento {
    private Date dataPagamento;
    private double valorTotal;
    private Collection<Processo> processos;

    public Pagamento() {
    }

    public Pagamento(Date dataPagamento, double valorTotal, Collection<Processo> processos) {
        this.dataPagamento = dataPagamento;
        this.valorTotal = valorTotal;
        this.processos = processos;
    }
    
    public Date getDataPagamento() {
        return dataPagamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }


    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

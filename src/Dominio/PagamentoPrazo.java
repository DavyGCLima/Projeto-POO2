/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Date;

/**
 *
 * @author reida
 */
public class PagamentoPrazo extends Pagamento {
    private double valorParc;
    private String modoPagamento;
    private Parcela[] parcelas;

    public PagamentoPrazo() {
    }

    public PagamentoPrazo(double valorParc, String modoPagamento, Parcela[] parcelas, Date dataPagamento, double valorTotal, Processo[] processos) {
        super(dataPagamento, valorTotal, processos);
        this.valorParc = valorParc;
        this.modoPagamento = modoPagamento;
        this.parcelas = parcelas;
    }

    public double getValorParc() {
        return valorParc;
    }

    public String getModoPagamento() {
        return modoPagamento;
    }

    public Parcela[] getParcelas() {
        return parcelas;
    }

    public void setValorParc(double valorParc) {
        this.valorParc = valorParc;
    }

    public void setModoPagamento(String modoPagamento) {
        this.modoPagamento = modoPagamento;
    }

    public void setParcelas(Parcela[] parcelas) {
        this.parcelas = parcelas;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author reida
 */
public class PagamentoPrazo extends Pagamento {
    private double valorParc;
    private String modoPagamento;
    private ArrayList<Parcela> parcelas;

    public PagamentoPrazo() {
    }


    public double getValorParc() {
        return valorParc;
    }

    public String getModoPagamento() {
        return modoPagamento;
    }

    public void setValorParc(double valorParc) {
        this.valorParc = valorParc;
    }

    public void setModoPagamento(String modoPagamento) {
        this.modoPagamento = modoPagamento;
    }
}

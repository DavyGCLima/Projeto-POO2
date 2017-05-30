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
public class Parcela {
    private double valor;
    private Date data;
    private boolean pago;

    public Parcela() {
    }

    public Parcela(double valor, Date data, boolean pago) {
        this.valor = valor;
        this.data = data;
        this.pago = pago;
    }

    public double getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }

    public boolean isPago() {
        return pago;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    
    
}

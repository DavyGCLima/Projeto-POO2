/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author reida
 */
@Entity @Table(schema = "Project POO2")
public class Parcela implements Serializable {
    
    @Column(nullable = false)
    private double valor;
    
    @Column(nullable = false)
    private Date data;
    
    @Column(nullable = false)
    private boolean pago;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPagamento", insertable = true, updatable = true, nullable = false)
    @Fetch(FetchMode.JOIN)  @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private PagamentoPrazo pagamentoPrazo;
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int idParcela;

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

    public int getIdParcela() {
        return idParcela;
    }

    public void setIdParcela(int idParcela) {
        this.idParcela = idParcela;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;
/**
 *
 * @author reida
 */
@Entity
@Table(schema = "ProjectPOO2")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pagamento implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPagamento;
    
    @Column(nullable = false)
    private Date dataPagamento;
    
    @Column(nullable = false)
    private double valorTotal;
    
    @OneToMany(mappedBy = "pagamento", fetch = FetchType.EAGER)
    private Collection<Processo> processos;

    public Pagamento() {
    }

    public Pagamento(int idPagamento, Date dataPagamento, double valorTotal, Collection<Processo> processos) {
        this.idPagamento = idPagamento;
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

    public int getIdPagamento() {
        return idPagamento;
    }

    public Collection<Processo> getProcessos() {
        return processos;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public void setProcessos(Collection<Processo> processos) {
        this.processos = processos;
    }


    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

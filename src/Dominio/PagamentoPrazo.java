/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author reida
 */
@Entity @Table(schema = "ProjectPOO2")
@PrimaryKeyJoinColumn(name = "idPagamento")
public class PagamentoPrazo extends Pagamento {
    @Column(nullable = false)
    private double valorParc;
    
    @Column(length = 45, nullable = false)
    private String modoPagamento;
    
    @OneToMany(mappedBy = "pagamentoPrazo", fetch = FetchType.EAGER)
    private Collection<Parcela> parcelas;
    
    public PagamentoPrazo() {
    }

    public PagamentoPrazo(double valorParc, String modoPagamento, Collection<Parcela> parcelas, int idPagamento, Date dataPagamento, double valorTotal, Collection<Processo> processos) {
        super(idPagamento, dataPagamento, valorTotal, processos);
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

    public void setValorParc(double valorParc) {
        this.valorParc = valorParc;
    }

    public void setModoPagamento(String modoPagamento) {
        this.modoPagamento = modoPagamento;
    }
}

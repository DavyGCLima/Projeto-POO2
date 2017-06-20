package newpackage;
// Generated 19/06/2017 16:21:07 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Parcela generated by hbm2java
 */
public class Parcela  implements java.io.Serializable {


     private Integer idParcela;
     private Pagamentoprazo pagamentoprazo;
     private float valor;
     private Date dataParcela;
     private byte pago;
     private int pagamentoPrazoIdPagamentoPrazo;

    public Parcela() {
    }

    public Parcela(Pagamentoprazo pagamentoprazo, float valor, Date dataParcela, byte pago, int pagamentoPrazoIdPagamentoPrazo) {
       this.pagamentoprazo = pagamentoprazo;
       this.valor = valor;
       this.dataParcela = dataParcela;
       this.pago = pago;
       this.pagamentoPrazoIdPagamentoPrazo = pagamentoPrazoIdPagamentoPrazo;
    }
   
    public Integer getIdParcela() {
        return this.idParcela;
    }
    
    public void setIdParcela(Integer idParcela) {
        this.idParcela = idParcela;
    }
    public Pagamentoprazo getPagamentoprazo() {
        return this.pagamentoprazo;
    }
    
    public void setPagamentoprazo(Pagamentoprazo pagamentoprazo) {
        this.pagamentoprazo = pagamentoprazo;
    }
    public float getValor() {
        return this.valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }
    public Date getDataParcela() {
        return this.dataParcela;
    }
    
    public void setDataParcela(Date dataParcela) {
        this.dataParcela = dataParcela;
    }
    public byte getPago() {
        return this.pago;
    }
    
    public void setPago(byte pago) {
        this.pago = pago;
    }
    public int getPagamentoPrazoIdPagamentoPrazo() {
        return this.pagamentoPrazoIdPagamentoPrazo;
    }
    
    public void setPagamentoPrazoIdPagamentoPrazo(int pagamentoPrazoIdPagamentoPrazo) {
        this.pagamentoPrazoIdPagamentoPrazo = pagamentoPrazoIdPagamentoPrazo;
    }




}



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

/**
 *
 * @author reida
 */
@Entity
@Table(schema = "ProjectPOO2")
public class Audiencia implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAudiencia;
    
    @Column(insertable = true, nullable = false, updatable = true)
    private Date data;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idProcesso", insertable = true, updatable = true)
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private Processo processo;

    public Audiencia() {
    }

    public Audiencia(int idAudiencia, Date data, Processo processo) {
        this.idAudiencia = idAudiencia;
        this.data = data;
        this.processo = processo;
    }

    

    public int getId() {
        return idAudiencia;
    }

    public void setId(int id) {
        this.idAudiencia = id;
    }

    public Date getData() {
        return data;
    }

    public Processo getProcesso() {
        return processo;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }
    
    
    
}

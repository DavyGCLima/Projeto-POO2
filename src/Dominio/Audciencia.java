/*

* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author reida
 */
@Entity
@Table(schema = "ProjectPOO2")
public class Audciencia {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(insertable = true, nullable = false, updatable = true)
    private Date data;
    
    private Processo processo;

    public Audciencia(Date data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}

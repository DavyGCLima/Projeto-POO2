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
public class Audciencia {
    private Date data;
    private Processo processo;

    public Audciencia(Date data, Processo processo) {
        this.data = data;
        this.processo = processo;
    }
}

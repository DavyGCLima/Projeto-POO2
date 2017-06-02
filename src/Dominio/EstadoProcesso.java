/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.ArrayList;

/**
 *
 * @author reida
 */
public class EstadoProcesso {
    private String estado;
    private ArrayList<Processo> processos;
    private ArrayList<EstadoProcesso> estadoAnterior;

    public EstadoProcesso() {
    }


    public String getStado() {
        return estado;
    }

    
}

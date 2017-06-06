/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.util.Collection;
/**
 *
 * @author reida
 */
public class EstadoProcesso {
    private String estado;
    private Collection<Processo> processos;
    private Collection<EstadoProcesso> estadoAnterior;

    public EstadoProcesso() {
    }


    public String getStado() {
        return estado;
    }

    public EstadoProcesso(String estado, Collection<Processo> processos, Collection<EstadoProcesso> estadoAnterior) {
        this.estado = estado;
        this.processos = processos;
        this.estadoAnterior = estadoAnterior;
    }

    
    
}

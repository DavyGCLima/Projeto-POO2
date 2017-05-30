/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

/**
 *
 * @author reida
 */
public class EstadoProcesso {
    private String estado;
    private Process[] processos;
    private EstadoProcesso[] estadoAnterior;

    public EstadoProcesso() {
    }

    public EstadoProcesso(String stado, Process[] processos, EstadoProcesso[] estadoAnterior) {
        this.estado = stado;
        this.processos = processos;
        this.estadoAnterior = estadoAnterior;
    }

    public String getStado() {
        return estado;
    }

    public Process[] getProcessos() {
        return processos;
    }

    public EstadoProcesso[] getEstadoAnterior() {
        return estadoAnterior;
    }
    
    
}

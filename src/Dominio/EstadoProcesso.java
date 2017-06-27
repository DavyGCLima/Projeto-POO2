/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.*;
import org.hibernate.annotations.Fetch;


/**
 *
 * @author reida
 */
@Entity @Table(schema = "ProjectPOO2")
public class EstadoProcesso implements Serializable {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEstadoProcesso;
    
    @Column(length = 45, nullable = false)
    private String estado;
    
    @OneToMany(mappedBy = "idProcesso", fetch = FetchType.LAZY)
    private Collection<Processo> processos;
    
//    @ManyToMany(fetch = FetchType.LAZY)
      @OneToMany(fetch = FetchType.EAGER)
      @JoinColumn(name = "EstadoRelacionado")
//    @JoinTable(name = "EstadoRelacionado", schema = "ProjectPOO2",
//            joinColumns = @JoinColumn(name = "idEstadoProcesso"),
//            inverseJoinColumns = @JoinColumn(name = "idEstadoProcesso"))
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

    public String getEstado() {
        return estado;
    }

    public Collection<Processo> getProcessos() {
        return processos;
    }

    public Collection<EstadoProcesso> getEstadoAnterior() {
        return estadoAnterior;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setProcessos(Collection<Processo> processos) {
        this.processos = processos;
    }

    public void setEstadoAnterior(Collection<EstadoProcesso> estadoAnterior) {
        this.estadoAnterior = estadoAnterior;
    }

    
    
}

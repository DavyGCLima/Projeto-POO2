/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciaDeTarefas;


/**
 *
 * @author Davy-san
 */
public class GTPrincipal {

    GerenciaAdvogados gtAdvogados;
    GerenciaAudiencia gtAudiencia;
    GerenciaEstadoProcesso gtEstadoProcesso;
    GerenciaPessoas gtPessoas;
    GerenciaProcesso gtProcesso;
    GerenciaEndereco gtEndereco;
    
    public GTPrincipal() {
        gtAdvogados = new GerenciaAdvogados(this);
        gtAudiencia = new GerenciaAudiencia(this);
        gtEstadoProcesso = new GerenciaEstadoProcesso(this);
        gtEndereco = new GerenciaEndereco(this);
        gtPessoas = new GerenciaPessoas(this);
        gtProcesso = new GerenciaProcesso(this);
    }
    
    public GerenciaAdvogados getGTAdvogados(){
        return gtAdvogados;
    }
    
    public GerenciaAudiencia getGTAudiencia(){
        return gtAudiencia;
    }
   
    public GerenciaEstadoProcesso getGTEstadoProcesso(){
        return gtEstadoProcesso;
    }
    
    public GerenciaPessoas getGTPessoas(){
        return gtPessoas;
    }
    
    public GerenciaProcesso getGTProcesso(){
        return gtProcesso;
    }
    
    public GerenciaEndereco getGTEndereco(){
        return gtEndereco;
    }
}

package newpackage;
// Generated 19/06/2017 16:21:07 by Hibernate Tools 4.3.1



/**
 * Processoadvogado generated by hbm2java
 */
public class Processoadvogado  implements java.io.Serializable {


     private ProcessoadvogadoId id;
     private Processo processo;

    public Processoadvogado() {
    }

    public Processoadvogado(ProcessoadvogadoId id, Processo processo) {
       this.id = id;
       this.processo = processo;
    }
   
    public ProcessoadvogadoId getId() {
        return this.id;
    }
    
    public void setId(ProcessoadvogadoId id) {
        this.id = id;
    }
    public Processo getProcesso() {
        return this.processo;
    }
    
    public void setProcesso(Processo processo) {
        this.processo = processo;
    }




}



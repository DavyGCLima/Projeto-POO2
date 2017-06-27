package Dominio;
// Generated 19/06/2017 16:21:07 by Hibernate Tools 4.3.1


import java.util.Collection;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * Bairro generated by hbm2java
 */
@Entity
@Table(schema = "ProjectPOO2")
public class Bairro  implements java.io.Serializable {

     @Id    
     @GeneratedValue(strategy = GenerationType.AUTO)
     private int idbairro;
     
     @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)    
     @JoinColumn(name = "idCidade", insertable = true, updatable = true)
     @Fetch(FetchMode.JOIN)
     @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
     private Cidade cidade;
     
     @Column(length = 45, nullable = false)
     private String nomeBairro;
     
     @OneToMany(mappedBy = "bairro", fetch = FetchType.LAZY)
     private Collection<Logradouro> logradouros;

    public Bairro() {
    }

	
    public Bairro(Cidade cidade, String nomeBairro) {
        this.cidade = cidade;
        this.nomeBairro = nomeBairro;
    }
    public Bairro(Cidade cidade, String nomeBairro, Set logradouros) {
       this.cidade = cidade;
       this.nomeBairro = nomeBairro;
       this.logradouros = logradouros;
    }
   
    public int getIdbairro() {
        return this.idbairro;
    }
    
    public void setIdbairro(int idbairro) {
        this.idbairro = idbairro;
    }
    public Cidade getCidade() {
        return this.cidade;
    }
    
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    public String getNomeBairro() {
        return this.nomeBairro;
    }
    
    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }

    public Collection<Logradouro> getLogradouros() {
        return logradouros;
    }

    public void setLogradouros(Collection<Logradouro> logradouros) {
        this.logradouros = logradouros;
    }
}


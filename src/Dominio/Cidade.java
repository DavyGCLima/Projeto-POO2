package Dominio;
// Generated 19/06/2017 16:21:07 by Hibernate Tools 4.3.1


import java.util.Collection;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 * Cidade generated by hbm2java
 */
@Entity
@Table(schema = "ProjectPOO2")
public class Cidade  implements java.io.Serializable {

    @Id     
    @GeneratedValue(strategy = GenerationType.AUTO)
     private int idCidade;
    
     @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)    
     @JoinColumn(name = "idUf", insertable = true, updatable = true)
     @Fetch(FetchMode.JOIN)
     @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
     private Uf uf;
     
     @Column(length = 45, nullable = false)
     private String nomeCidade;
     
     @OneToMany(mappedBy = "cidade", fetch = FetchType.LAZY)
     private Collection<Bairro> bairros;

    public Cidade() {
    }

	
    public Cidade(Uf uf, String nomeCidade) {
        this.uf = uf;
        this.nomeCidade = nomeCidade;
    }

    public Cidade(int idCidade, Uf uf, String nomeCidade, Collection<Bairro> bairros) {
        this.idCidade = idCidade;
        this.uf = uf;
        this.nomeCidade = nomeCidade;
        this.bairros = bairros;
    }
  
   
    public int getIdCidade() {
        return this.idCidade;
    }
    
    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }
    public Uf getUf() {
        return this.uf;
    }
    
    public void setUf(Uf uf) {
        this.uf = uf;
    }
    public String getNomeCidade() {
        return this.nomeCidade;
    }
    
    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public Collection<Bairro> getBairros() {
        return bairros;
    }
   
    
    public void setBairros(Set bairros) {
        this.bairros = bairros;
    }




}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;
import javax.persistence.*;
/**
 *
 * @author reida
 */
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUsuario")
    private int idUsuario;    
    @Column(nullable = false, updatable = true, insertable = true, length = 16)
    private String login;    
    @Column(nullable = false, updatable = true, insertable = true, length = 16)
    private String senha;

    public Usuario() {
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return idUsuario;
    }

    public void setId(int id) {
        this.idUsuario = id;
    }
   
    
}

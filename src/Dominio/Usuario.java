/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author reida
 */
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="idProcesso")
    private int idProcesso;
    
    @Column(unique = true, insertable = true, updatable = true, length = 16, nullable = true)
    private String login;
    
    @Column(insertable = true, updatable = true, length = 16, nullable = true)
    private String senha;
    
    @OneToMany()
    public Usuario() {
    }

    public Usuario(int idProcesso, String login, String senha) {
        this.idProcesso = idProcesso;
        this.login = login;
        this.senha = senha;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public int getIdProcesso() {
        return idProcesso;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setIdProcesso(int idProcesso) {
        this.idProcesso = idProcesso;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}

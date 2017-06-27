/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleDeInteracao;

import InterfaceDeUsuario.Pessoas.*;
import javax.swing.JDesktopPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Davy-san
 */
public class ControlePessoas {

    GerenciarPessoas TGerenciarPessoas;
    TCadPessoa TCadPessoas;
    ControlePrincipal ctrl;
    
    public ControlePessoas(ControlePrincipal ctrl) {
        this.ctrl = ctrl;
    }
    
    public void abrirTCadPessoa(JDesktopPane desktopPane,ControlePrincipal ctrl){
        if(TCadPessoas == null || TCadPessoas.isClosed()){
            TCadPessoas = new TCadPessoa("Cadastro de Pessoas", ctrl);
            desktopPane.add(TCadPessoas);
            TCadPessoas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        TCadPessoas.setVisible(true);
        desktopPane.moveToFront(TCadPessoas);
    }
    
    public void abrirTGerenciarPessoas(JDesktopPane desktopPane, ControlePrincipal ctrl){
        if(TGerenciarPessoas == null || TGerenciarPessoas.isClosed()){
            TGerenciarPessoas = new GerenciarPessoas("Gerencia de Pessoas");
            desktopPane.add(TGerenciarPessoas);
            TGerenciarPessoas.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        TGerenciarPessoas.setVisible(true);
        desktopPane.moveToFront(TGerenciarPessoas);
    }
    
    
    
}

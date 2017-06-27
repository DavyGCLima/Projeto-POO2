/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleDeInteracao;

import InterfaceDeUsuario.Processos.*;
import javax.swing.JDesktopPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Davy-san
 */
public class ControleProcessos {

    CadastroProcesso TCadProcesso;
    GerenciarProcesso TGerenciarProcesso;
    ControlePrincipal ctrl;
    public ControleProcessos(ControlePrincipal ctrl) {
        this.ctrl = ctrl;
    }
    
    public void abrirTCadProcesso(JDesktopPane desktopPane, ControlePrincipal ctrl){
        if(TCadProcesso == null || TCadProcesso.isClosed()){
            TCadProcesso = new CadastroProcesso("Cadastro de Processo");
            desktopPane.add(TCadProcesso);
            TCadProcesso.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        TCadProcesso.setVisible(true);
        desktopPane.moveToFront(TCadProcesso);
    }
    
    public void abrirTGerenciaProcesso(JDesktopPane desktopPane, ControlePrincipal ctrl){
        if(TGerenciarProcesso == null || TGerenciarProcesso.isClosed()){
            TGerenciarProcesso = new GerenciarProcesso("Gerencia de Processos");
            desktopPane.add(TGerenciarProcesso);
            TGerenciarProcesso.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        TGerenciarProcesso.setVisible(true);
        desktopPane.moveToFront(TGerenciarProcesso);
    }
}

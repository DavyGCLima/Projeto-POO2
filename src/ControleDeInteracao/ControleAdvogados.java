/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleDeInteracao;

import InterfaceDeUsuario.Advogados.*;
import javax.swing.JDesktopPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author reida
 */
public class ControleAdvogados {

    ControlePrincipal ctrl;
    GerenciarAdvogados TGerenciaAd;
    TCadastrarAdvogados TcadAd;
    public ControleAdvogados(ControlePrincipal ctrl) {
        this.ctrl = ctrl;
    }
    
    public void abrirCadastroAdvogado(JDesktopPane desktopPane, ControlePrincipal ctrl){
        if(TcadAd == null || TcadAd.isClosed()){
            TcadAd = new TCadastrarAdvogados("Cadastro de Advogados");
            desktopPane.add(TcadAd);
            TcadAd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        TcadAd.setVisible(true);
        desktopPane.moveToFront(TcadAd);
    }
    
    public void abrirGerenciarAdvogados(JDesktopPane desktopPane, ControlePrincipal ctrl){
        if(TGerenciaAd == null || TGerenciaAd.isClosed()){
            TGerenciaAd = new GerenciarAdvogados("gerencia de Advogados");
            desktopPane.add(TGerenciaAd);
            TGerenciaAd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
        TGerenciaAd.setVisible(true);
        desktopPane.moveToFront(TGerenciaAd);
    }
}

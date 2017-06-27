/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleDeInteracao;

import java.awt.color.ICC_Profile;
import javax.swing.JOptionPane;

/**
 *
 * @author reida
 */
public class ControleErros {

    ControlePrincipal ctrl;
    public ControleErros(ControlePrincipal ctrl) {
        this.ctrl = ctrl;
    }
    
    public void JanelaIválida(){
        JOptionPane.showMessageDialog(null, "Janela não pode ser instanciada", "Erro Janela", JOptionPane.WARNING_MESSAGE);
    }
}

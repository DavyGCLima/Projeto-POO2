/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleDeInteracao;

import GerenciaDeTarefas.GTPrincipal;
import InterfaceDeUsuario.*;
import javax.swing.JDesktopPane;

/**
 *
 * @author reida
 */
public class ControlePrincipal {
      public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Jprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ControlePrincipal ctrl = new ControlePrincipal();
                //new Jprincipal().setVisible(true);
            }
        });
    }
     
//    TCadPessoa TcadCliente;
//    GerenciarPessoas TgerenPessoas;
//    CadastroProcesso TcadProcesso;
//    GerenciarProcesso TgerenciarProcesso;
//    TCadastrarAdvogados TCadAdvogado;
//    GerenciarAdvogados genreciarAdvogado;
    JDesktopPane desktopPane;
    ControlePessoas CtrlPessoas;
    ControleProcessos CtrlProcessos;
    ControlePagamento CtrlPagamento;
    ControleAdvogados CtrlAdvogados;
    ControleErros CtrlErros;
    GTPrincipal gt;

    public ControlePrincipal(/*JDesktopPane desktopPane*/) {
        Jprincipal jp = new Jprincipal(this);
        jp.setVisible(true);
        desktopPane = jp.getDesktopPane();
        CtrlPessoas = new ControlePessoas(this);
        CtrlProcessos = new ControleProcessos(this);
        CtrlPagamento = new ControlePagamento(this);
        CtrlAdvogados = new ControleAdvogados(this);
        CtrlErros = new ControleErros(this);
        gt = new GTPrincipal();
        //this.desktopPane = desktopPane;
    }
    public void AbrirCadastroDePEssoas(){
        CtrlPessoas.abrirTCadPessoa(desktopPane, this);
    }
    
    public void AbrirGerenciaDePessoas(){
        CtrlPessoas.abrirTGerenciarPessoas(desktopPane, this);
    }
     
    public void AbrirGerenciaProcesso(){
        CtrlProcessos.abrirTGerenciaProcesso(desktopPane, this);
    }
    
    public void AbrirCadastroProcesso(){
        CtrlProcessos.abrirTCadProcesso(desktopPane, this);
    }
    
    public void AbrirCadastroAdvogado(){
        CtrlAdvogados.abrirCadastroAdvogado(desktopPane, this);
    }
    
    public void AbriGerenciaAdvogados(){
        CtrlAdvogados.abrirGerenciarAdvogados(desktopPane, this);
    }
    
   public ControlePessoas getControlePssoas(){
       return CtrlPessoas;
   }
   
   public ControleAdvogados getControleAdvogados(){
       return CtrlAdvogados;
   }
   
   public ControleProcessos getControleProcessos(){
       return CtrlProcessos;
   }
   
   public ControlePagamento getControlePagamento(){
       return CtrlPagamento;
   }
   
   public ControleErros getControleErros(){
       return CtrlErros;
   }
   
   public GTPrincipal getGTPrincipal(){
       return gt;
   }
}

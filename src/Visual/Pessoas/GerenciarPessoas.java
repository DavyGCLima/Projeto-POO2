/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual.Pessoas;

import Visual.Jprincipal;
import javax.swing.JOptionPane;

/**
 *
 * @author Davy-san
 */
public class GerenciarPessoas extends javax.swing.JInternalFrame {
    AlterarPessoasFisica pessoaFisica;
    AlterarPessoaJuridica pessoaJuridica;
    /**
     * Creates new form ExcluirPessoa
     */
    public GerenciarPessoas(String titulo,Jprincipal janelaP) {
         super(titulo, true, true, true, true);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        buttonGroupTipoPessoa = new javax.swing.ButtonGroup();
        jpConsulta = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jpTipoPessoa = new javax.swing.JPanel();
        rbtnFisica = new javax.swing.JRadioButton();
        rbtnJuridica = new javax.swing.JRadioButton();
        jpAlterar = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        jpConsulta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpConsulta.setDoubleBuffered(false);

        lblNome.setText("Nome");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jpTipoPessoa.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Pessoa"));

        buttonGroupTipoPessoa.add(rbtnFisica);
        rbtnFisica.setText("Fisica");

        buttonGroupTipoPessoa.add(rbtnJuridica);
        rbtnJuridica.setText("Juridica");

        javax.swing.GroupLayout jpTipoPessoaLayout = new javax.swing.GroupLayout(jpTipoPessoa);
        jpTipoPessoa.setLayout(jpTipoPessoaLayout);
        jpTipoPessoaLayout.setHorizontalGroup(
            jpTipoPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTipoPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtnFisica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtnJuridica))
        );
        jpTipoPessoaLayout.setVerticalGroup(
            jpTipoPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTipoPessoaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpTipoPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnFisica)
                    .addComponent(rbtnJuridica)))
        );

        jpAlterar.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jpConsultaLayout = new javax.swing.GroupLayout(jpConsulta);
        jpConsulta.setLayout(jpConsultaLayout);
        jpConsultaLayout.setHorizontalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultar)
                .addGap(28, 28, 28)
                .addComponent(jpTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(384, Short.MAX_VALUE))
            .addComponent(jpAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpConsultaLayout.setVerticalGroup(
            jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultaLayout.createSequentialGroup()
                .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpConsultaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jpConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConsultar)))
                    .addComponent(jpTipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jpAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        if(rbtnFisica.isSelected()){
            jpAlterar.removeAll();
            pessoaFisica = new AlterarPessoasFisica();
            jpAlterar.add(pessoaFisica);
        }
        else if (rbtnJuridica.isSelected()){
            jpAlterar.removeAll();
            pessoaJuridica = new AlterarPessoaJuridica();
            jpAlterar.add(pessoaJuridica);
        }
        else{
            JOptionPane.showMessageDialog(null, "Selecione um tipo de pessoa!", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.ButtonGroup buttonGroupTipoPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpAlterar;
    private javax.swing.JPanel jpConsulta;
    private javax.swing.JPanel jpTipoPessoa;
    private javax.swing.JLabel lblNome;
    private javax.swing.JRadioButton rbtnFisica;
    private javax.swing.JRadioButton rbtnJuridica;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

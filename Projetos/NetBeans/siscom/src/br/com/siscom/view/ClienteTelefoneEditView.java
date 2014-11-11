/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siscom.view;

import br.com.siscom.bean.Telefone;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author cesar
 */
public class ClienteTelefoneEditView extends javax.swing.JDialog {

    /**
     * Creates new form ClienteTelefoneEditView
     * @param parent
     * @param modal
     */
    public ClienteTelefoneEditView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        pnlDadosTelefone = new javax.swing.JPanel();
        lblTelefoneNumero = new javax.swing.JLabel();
        txtTelefoneNumero = new javax.swing.JTextField();
        lblTelefoneTipo = new javax.swing.JLabel();
        txtTelefoneTipo = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnCancelarTelefone = new javax.swing.JButton();
        btnConfirmarTelefone = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlDadosTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Telefone do Cliente"));

        lblTelefoneNumero.setText("Numero:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.numero}"), txtTelefoneNumero, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblTelefoneTipo.setText("Tipo:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.tipo}"), txtTelefoneTipo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout pnlDadosTelefoneLayout = new javax.swing.GroupLayout(pnlDadosTelefone);
        pnlDadosTelefone.setLayout(pnlDadosTelefoneLayout);
        pnlDadosTelefoneLayout.setHorizontalGroup(
            pnlDadosTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefoneNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefoneTipo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTelefoneNumero)
                    .addComponent(txtTelefoneTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDadosTelefoneLayout.setVerticalGroup(
            pnlDadosTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosTelefoneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneNumero)
                    .addComponent(txtTelefoneNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosTelefoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefoneTipo)
                    .addComponent(txtTelefoneTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        btnCancelarTelefone.setText("Cancelar Allterações");
        btnCancelarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarTelefoneActionPerformed(evt);
            }
        });

        btnConfirmarTelefone.setText("Confirmar Allterações");
        btnConfirmarTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConfirmarTelefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarTelefone)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarTelefone)
                    .addComponent(btnConfirmarTelefone))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDadosTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDadosTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarTelefoneActionPerformed
        setConfirmaTelefone(true);
        setVisible(false);
    }//GEN-LAST:event_btnConfirmarTelefoneActionPerformed

    private void btnCancelarTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarTelefoneActionPerformed
        setConfirmaTelefone(false);
        setVisible(false);
    }//GEN-LAST:event_btnCancelarTelefoneActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteTelefoneEditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ClienteTelefoneEditView dialog = new ClienteTelefoneEditView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        //System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    private Telefone registroAtual;

    /**
     * Get the value of registroAtual
     *
     * @return the value of registroAtual
     */
    public Telefone getRegistroAtual() {
        return registroAtual;
    }

    /**
     * Set the value of registroAtual
     *
     * @param registroAtual new value of registroAtual
     */
    public void setRegistroAtual(Telefone registroAtual) {
        Telefone oldRegistro = this.registroAtual;
        this.registroAtual = registroAtual;
        CHANGE_SUPPORT.firePropertyChange("registroAtual", oldRegistro, registroAtual);
    }

    private transient final PropertyChangeSupport CHANGE_SUPPORT = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        CHANGE_SUPPORT.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        CHANGE_SUPPORT.removePropertyChangeListener(listener);
    }

    private boolean confirmaTelefone;

    /**
     * Get the value of confirmaTelefone
     *
     * @return the value of confirmaTelefone
     */
    public boolean isConfirmaTelefone() {
        return confirmaTelefone;
    }

    /**
     * Set the value of confirmaTelefone
     *
     * @param confirmaTelefone new value of confirmaTelefone
     */
    public void setConfirmaTelefone(boolean confirmaTelefone) {
        this.confirmaTelefone = confirmaTelefone;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarTelefone;
    private javax.swing.JButton btnConfirmarTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTelefoneNumero;
    private javax.swing.JLabel lblTelefoneTipo;
    private javax.swing.JPanel pnlDadosTelefone;
    private javax.swing.JTextField txtTelefoneNumero;
    private javax.swing.JTextField txtTelefoneTipo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

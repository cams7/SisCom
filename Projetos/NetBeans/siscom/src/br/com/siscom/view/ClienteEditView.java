/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siscom.view;

import br.com.siscom.bean.Cliente;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author cesar
 */
public class ClienteEditView extends javax.swing.JDialog {

    /**
     * Creates new form ClienteEditView
     *
     * @param parent
     * @param modal
     */
    public ClienteEditView(java.awt.Frame parent, boolean modal) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlDadosCliente = new javax.swing.JPanel();
        lblClienteNome = new javax.swing.JLabel();
        txtClienteNome = new javax.swing.JTextField();
        lblClienteCPF = new javax.swing.JLabel();
        lblClienteEmail = new javax.swing.JLabel();
        txtClienteCPF = new javax.swing.JTextField();
        txtClienteEmail = new javax.swing.JTextField();
        lblClienteProfissao = new javax.swing.JLabel();
        txtClienteProfissao = new javax.swing.JTextField();
        lblClienteCNPJ = new javax.swing.JLabel();
        txtClienteCNPJ = new javax.swing.JTextField();
        lblClienteRG = new javax.swing.JLabel();
        txtClienteRG = new javax.swing.JTextField();
        lblClienteOrgaoExpedidor = new javax.swing.JLabel();
        lblClienteTipo = new javax.swing.JLabel();
        txtClienteTipo = new javax.swing.JTextField();
        lblClienteDesde = new javax.swing.JLabel();
        txtClienteDesde = new javax.swing.JTextField();
        lblClienteEmpresa = new javax.swing.JLabel();
        txtClienteEmpresa = new javax.swing.JTextField();
        lblClienteFoneEmpresa = new javax.swing.JLabel();
        txtClienteFoneEmpresa = new javax.swing.JTextField();
        txtClienteOrgaoExpedidor = new javax.swing.JTextField();
        lblClienteRenda = new javax.swing.JLabel();
        txtClienteRenda = new javax.swing.JTextField();
        lblClienteReferencia = new javax.swing.JLabel();
        txtClienteReferencia = new javax.swing.JTextField();
        lblClienteFoneReferencia = new javax.swing.JLabel();
        txtClienteFoneReferencia = new javax.swing.JTextField();
        lblClienteDataNascimento = new javax.swing.JLabel();
        txtClienteDataNascimento = new javax.swing.JTextField();
        btnCancelarCliente = new javax.swing.JButton();
        btnConfirmarCliente = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editando Informações do Cliente");

        pnlDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Cliente"));

        lblClienteNome.setText("Cliente:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.nome}"), txtClienteNome, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblClienteCPF.setText("CPF:");

        lblClienteEmail.setText("E-mail:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.cpf}"), txtClienteCPF, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.email}"), txtClienteEmail, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblClienteProfissao.setText("Profissão:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.profissao}"), txtClienteProfissao, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblClienteCNPJ.setText("CNPJ:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.cnpj}"), txtClienteCNPJ, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblClienteRG.setText("RG:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.rg}"), txtClienteRG, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblClienteOrgaoExpedidor.setText("Órgão expedidor:");

        lblClienteTipo.setText("Tipo:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.tipo}"), txtClienteTipo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblClienteDesde.setText("Desde de:");

        txtClienteDesde.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.desde}"), txtClienteDesde, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblClienteEmpresa.setText("Empresa:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.empresa}"), txtClienteEmpresa, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblClienteFoneEmpresa.setText("Telefone da empresa:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.foneEmpresa}"), txtClienteFoneEmpresa, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.orgaoRg}"), txtClienteOrgaoExpedidor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblClienteRenda.setText("Renda:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.renda}"), txtClienteRenda, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblClienteReferencia.setText("Referência:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.referencia}"), txtClienteReferencia, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblClienteFoneReferencia.setText("Telefone do(a) referência");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.foneReferencia}"), txtClienteFoneReferencia, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        lblClienteDataNascimento.setText("Data de nascimento:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${registroAtual.nascimento}"), txtClienteDataNascimento, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout pnlDadosClienteLayout = new javax.swing.GroupLayout(pnlDadosCliente);
        pnlDadosCliente.setLayout(pnlDadosClienteLayout);
        pnlDadosClienteLayout.setHorizontalGroup(
            pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosClienteLayout.createSequentialGroup()
                        .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblClienteNome, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblClienteEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblClienteDataNascimento, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblClienteCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblClienteProfissao, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblClienteEmpresa, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblClienteReferencia, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                                        .addComponent(txtClienteReferencia)
                                        .addGap(18, 18, 18))
                                    .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                                        .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtClienteCPF)
                                            .addComponent(txtClienteDataNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                                        .addGap(4, 4, 4)
                                        .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblClienteTipo, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblClienteRG, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                                                .addComponent(txtClienteRG, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                                                .addComponent(txtClienteTipo)
                                                .addGap(18, 18, 18))))))
                            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtClienteEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtClienteProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                        .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClienteRenda, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblClienteDesde, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblClienteOrgaoExpedidor, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblClienteCNPJ, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblClienteFoneEmpresa, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblClienteFoneReferencia, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClienteDesde)
                            .addComponent(txtClienteCNPJ)
                            .addComponent(txtClienteFoneEmpresa)
                            .addComponent(txtClienteFoneReferencia)
                            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtClienteRenda, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClienteOrgaoExpedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 19, Short.MAX_VALUE)))
                        .addGap(1, 1, 1))
                    .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(txtClienteNome)))
                .addGap(2, 2, 2))
        );
        pnlDadosClienteLayout.setVerticalGroup(
            pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteNome)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteEmail)
                    .addComponent(txtClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteRenda)
                    .addComponent(txtClienteRenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteDesde)
                    .addComponent(txtClienteDesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteDataNascimento)
                    .addComponent(txtClienteDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteTipo)
                    .addComponent(txtClienteTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteCPF)
                    .addComponent(txtClienteCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteRG)
                    .addComponent(txtClienteRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteOrgaoExpedidor)
                    .addComponent(txtClienteOrgaoExpedidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClienteCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteProfissao)
                    .addComponent(lblClienteCNPJ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteEmpresa)
                    .addComponent(txtClienteEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteFoneEmpresa)
                    .addComponent(txtClienteFoneEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteReferencia)
                    .addComponent(txtClienteReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClienteFoneReferencia)
                    .addComponent(txtClienteFoneReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelarCliente.setText("Cancelar Allterações");
        btnCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarClienteActionPerformed(evt);
            }
        });

        btnConfirmarCliente.setText("Confirmar Allterações");
        btnConfirmarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConfirmarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarCliente)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCliente)
                    .addComponent(btnConfirmarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarClienteActionPerformed
        setConfirmaCliente(true);
        setVisible(false);
    }//GEN-LAST:event_btnConfirmarClienteActionPerformed

    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        setConfirmaCliente(false);
        setVisible(false);
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteEditView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                ClienteEditView dialog = new ClienteEditView(new javax.swing.JFrame(), true);
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

    private Cliente registroAtual;

    /**
     * Get the value of registroAtual
     *
     * @return the value of registroAtual
     */
    public Cliente getRegistroAtual() {
        return registroAtual;
    }

    /**
     * Set the value of registroAtual
     *
     * @param registroAtual new value of registroAtual
     */
    public void setRegistroAtual(Cliente registroAtual) {
        Cliente oldRegistro = this.registroAtual;
        this.registroAtual = registroAtual;
        CHANGE_SUPPORT.firePropertyChange("registroAtual", oldRegistro, registroAtual);
    }

    private final PropertyChangeSupport CHANGE_SUPPORT = new PropertyChangeSupport(this);

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
    private boolean confirmaCliente;

    /**
     * Get the value of confirmaCliente
     *
     * @return the value of confirmaCliente
     */
    public boolean isConfirmaCliente() {
        return confirmaCliente;
    }

    /**
     * Set the value of confirmaCliente
     *
     * @param confirmaCliente new value of confirmaCliente
     */
    public void setConfirmaCliente(boolean confirmaCliente) {
        this.confirmaCliente = confirmaCliente;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnConfirmarCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblClienteCNPJ;
    private javax.swing.JLabel lblClienteCPF;
    private javax.swing.JLabel lblClienteDataNascimento;
    private javax.swing.JLabel lblClienteDesde;
    private javax.swing.JLabel lblClienteEmail;
    private javax.swing.JLabel lblClienteEmpresa;
    private javax.swing.JLabel lblClienteFoneEmpresa;
    private javax.swing.JLabel lblClienteFoneReferencia;
    private javax.swing.JLabel lblClienteNome;
    private javax.swing.JLabel lblClienteOrgaoExpedidor;
    private javax.swing.JLabel lblClienteProfissao;
    private javax.swing.JLabel lblClienteRG;
    private javax.swing.JLabel lblClienteReferencia;
    private javax.swing.JLabel lblClienteRenda;
    private javax.swing.JLabel lblClienteTipo;
    private javax.swing.JPanel pnlDadosCliente;
    private javax.swing.JTextField txtClienteCNPJ;
    private javax.swing.JTextField txtClienteCPF;
    private javax.swing.JTextField txtClienteDataNascimento;
    private javax.swing.JTextField txtClienteDesde;
    private javax.swing.JTextField txtClienteEmail;
    private javax.swing.JTextField txtClienteEmpresa;
    private javax.swing.JTextField txtClienteFoneEmpresa;
    private javax.swing.JTextField txtClienteFoneReferencia;
    private javax.swing.JTextField txtClienteNome;
    private javax.swing.JTextField txtClienteOrgaoExpedidor;
    private javax.swing.JTextField txtClienteProfissao;
    private javax.swing.JTextField txtClienteRG;
    private javax.swing.JTextField txtClienteReferencia;
    private javax.swing.JTextField txtClienteRenda;
    private javax.swing.JTextField txtClienteTipo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}

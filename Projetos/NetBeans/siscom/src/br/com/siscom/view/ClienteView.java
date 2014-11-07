/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siscom.view;

import br.com.siscom.bean.Cliente;
import br.com.siscom.bean.Endereco;
import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author cesar
 */
public class ClienteView extends JPanel {

    public ClienteView() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("siscomPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cliente c order by c.id desc");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        pnlListaClientes = new javax.swing.JPanel();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        masterScrollPane1 = new javax.swing.JScrollPane();
        masterTable1 = new javax.swing.JTable();
        btnNovoCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        pnlListaEnderecos = new javax.swing.JPanel();
        detailScrollPane = new javax.swing.JScrollPane();
        detailTable = new javax.swing.JTable();
        btnConfirmarCliente = new javax.swing.JButton();
        btnCancelarCliente = new javax.swing.JButton();
        btnExcluirEndereco = new javax.swing.JButton();
        btnNovoEndereco = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        pnlListaClientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Clientes"));

        masterTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        masterTable.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("E-mail");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("CPF");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rg}"));
        columnBinding.setColumnName("RG");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${orgaoRg}"));
        columnBinding.setColumnName("Órgão expedidor");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cnpj}"));
        columnBinding.setColumnName("CNPJ");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nascimento}"));
        columnBinding.setColumnName("Data de nascimento");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${foneReferencia}"));
        columnBinding.setColumnName("Telefone");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${profissao}"));
        columnBinding.setColumnName("Profissão");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${renda}"));
        columnBinding.setColumnName("Renda");
        columnBinding.setColumnClass(Double.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empresa}"));
        columnBinding.setColumnName("Empresa");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${foneEmpresa}"));
        columnBinding.setColumnName("Tefone da empresa");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${referencia}"));
        columnBinding.setColumnName("Referencia");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setMinWidth(250);
            masterTable.getColumnModel().getColumn(1).setMinWidth(200);
            masterTable.getColumnModel().getColumn(2).setResizable(false);
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(110);
            masterTable.getColumnModel().getColumn(3).setResizable(false);
            masterTable.getColumnModel().getColumn(3).setPreferredWidth(110);
            masterTable.getColumnModel().getColumn(4).setResizable(false);
            masterTable.getColumnModel().getColumn(4).setPreferredWidth(110);
            masterTable.getColumnModel().getColumn(5).setResizable(false);
            masterTable.getColumnModel().getColumn(5).setPreferredWidth(110);
            masterTable.getColumnModel().getColumn(6).setResizable(false);
            masterTable.getColumnModel().getColumn(6).setPreferredWidth(130);
            masterTable.getColumnModel().getColumn(7).setResizable(false);
            masterTable.getColumnModel().getColumn(7).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(8).setMinWidth(150);
            masterTable.getColumnModel().getColumn(9).setResizable(false);
            masterTable.getColumnModel().getColumn(9).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(10).setMinWidth(180);
            masterTable.getColumnModel().getColumn(11).setResizable(false);
            masterTable.getColumnModel().getColumn(11).setPreferredWidth(120);
            masterTable.getColumnModel().getColumn(12).setMinWidth(200);
        }

        masterTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        masterTable1.getTableHeader().setReorderingAllowed(false);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable1);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("Cpf");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rg}"));
        columnBinding.setColumnName("Rg");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${orgaoRg}"));
        columnBinding.setColumnName("Orgao Rg");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cnpj}"));
        columnBinding.setColumnName("Cnpj");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nascimento}"));
        columnBinding.setColumnName("Nascimento");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${foneReferencia}"));
        columnBinding.setColumnName("Fone Referencia");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${profissao}"));
        columnBinding.setColumnName("Profissao");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${renda}"));
        columnBinding.setColumnName("Renda");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${empresa}"));
        columnBinding.setColumnName("Empresa");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${foneEmpresa}"));
        columnBinding.setColumnName("Fone Empresa");
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${referencia}"));
        columnBinding.setColumnName("Referencia");
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane1.setViewportView(masterTable1);
        if (masterTable1.getColumnModel().getColumnCount() > 0) {
            masterTable1.getColumnModel().getColumn(0).setMinWidth(250);
            masterTable1.getColumnModel().getColumn(1).setMinWidth(200);
            masterTable1.getColumnModel().getColumn(2).setResizable(false);
            masterTable1.getColumnModel().getColumn(2).setPreferredWidth(110);
            masterTable1.getColumnModel().getColumn(3).setResizable(false);
            masterTable1.getColumnModel().getColumn(3).setPreferredWidth(110);
            masterTable1.getColumnModel().getColumn(4).setResizable(false);
            masterTable1.getColumnModel().getColumn(4).setPreferredWidth(110);
            masterTable1.getColumnModel().getColumn(5).setResizable(false);
            masterTable1.getColumnModel().getColumn(5).setPreferredWidth(110);
            masterTable1.getColumnModel().getColumn(6).setResizable(false);
            masterTable1.getColumnModel().getColumn(6).setPreferredWidth(130);
            masterTable1.getColumnModel().getColumn(7).setResizable(false);
            masterTable1.getColumnModel().getColumn(7).setPreferredWidth(100);
            masterTable1.getColumnModel().getColumn(8).setMinWidth(150);
            masterTable1.getColumnModel().getColumn(9).setResizable(false);
            masterTable1.getColumnModel().getColumn(9).setPreferredWidth(80);
            masterTable1.getColumnModel().getColumn(10).setMinWidth(180);
            masterTable1.getColumnModel().getColumn(11).setResizable(false);
            masterTable1.getColumnModel().getColumn(11).setPreferredWidth(120);
            masterTable1.getColumnModel().getColumn(12).setMinWidth(200);
        }

        btnNovoCliente.setText("Novo Cliente");
        btnNovoCliente.addActionListener(formListener);

        btnExcluirCliente.setText("Excluir Cliente");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), btnExcluirCliente, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        btnExcluirCliente.addActionListener(formListener);

        btnEditarCliente.setText("Editar Cliente");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), btnEditarCliente, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        btnEditarCliente.addActionListener(formListener);

        javax.swing.GroupLayout pnlListaClientesLayout = new javax.swing.GroupLayout(pnlListaClientes);
        pnlListaClientes.setLayout(pnlListaClientesLayout);
        pnlListaClientesLayout.setHorizontalGroup(
            pnlListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaClientesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirCliente))
                    .addComponent(masterScrollPane))
                .addContainerGap())
        );

        pnlListaClientesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnExcluirCliente, btnNovoCliente});

        pnlListaClientesLayout.setVerticalGroup(
            pnlListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaClientesLayout.createSequentialGroup()
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(pnlListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirCliente)
                    .addComponent(btnNovoCliente)
                    .addComponent(btnEditarCliente))
                .addContainerGap())
        );

        pnlListaEnderecos.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereços do Cliente"));

        detailTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedElement.enderecos}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, eLProperty, detailTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${logradouro}"));
        columnBinding.setColumnName("Logradouro");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bairro}"));
        columnBinding.setColumnName("Bairro");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${complemento}"));
        columnBinding.setColumnName("Complemento");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cep}"));
        columnBinding.setColumnName("Cep");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cidade}"));
        columnBinding.setColumnName("Cidade");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${uf}"));
        columnBinding.setColumnName("Uf");
        columnBinding.setColumnClass(String.class);
        jTableBinding.setSourceUnreadableValue(java.util.Collections.emptyList());
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        detailScrollPane.setViewportView(detailTable);
        if (detailTable.getColumnModel().getColumnCount() > 0) {
            detailTable.getColumnModel().getColumn(0).setMinWidth(350);
            detailTable.getColumnModel().getColumn(1).setMinWidth(300);
            detailTable.getColumnModel().getColumn(2).setMinWidth(200);
            detailTable.getColumnModel().getColumn(3).setMinWidth(110);
            detailTable.getColumnModel().getColumn(4).setMinWidth(250);
            detailTable.getColumnModel().getColumn(5).setResizable(false);
            detailTable.getColumnModel().getColumn(5).setPreferredWidth(30);
        }

        btnConfirmarCliente.setText("Confirmar Allterações");
        btnConfirmarCliente.addActionListener(formListener);

        btnCancelarCliente.setText("Cancelar Allterações");
        btnCancelarCliente.addActionListener(formListener);

        btnExcluirEndereco.setText("Excluir Entereço");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), btnExcluirEndereco, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        btnExcluirEndereco.addActionListener(formListener);

        btnNovoEndereco.setText("Novo Endereço");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), btnNovoEndereco, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        btnNovoEndereco.addActionListener(formListener);

        javax.swing.GroupLayout pnlListaEnderecosLayout = new javax.swing.GroupLayout(pnlListaEnderecos);
        pnlListaEnderecos.setLayout(pnlListaEnderecosLayout);
        pnlListaEnderecosLayout.setHorizontalGroup(
            pnlListaEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaEnderecosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlListaEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListaEnderecosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovoEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmarCliente))
                    .addComponent(detailScrollPane))
                .addContainerGap())
        );

        pnlListaEnderecosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelarCliente, btnConfirmarCliente, btnExcluirEndereco, btnNovoEndereco});

        pnlListaEnderecosLayout.setVerticalGroup(
            pnlListaEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListaEnderecosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlListaEnderecosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmarCliente)
                    .addComponent(btnCancelarCliente)
                    .addComponent(btnExcluirEndereco)
                    .addComponent(btnNovoEndereco))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlListaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlListaEnderecos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlListaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlListaEnderecos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == btnNovoCliente) {
                ClienteView.this.btnNovoClienteActionPerformed(evt);
            }
            else if (evt.getSource() == btnExcluirCliente) {
                ClienteView.this.btnExcluirClienteActionPerformed(evt);
            }
            else if (evt.getSource() == btnConfirmarCliente) {
                ClienteView.this.btnConfirmarClienteActionPerformed(evt);
            }
            else if (evt.getSource() == btnCancelarCliente) {
                ClienteView.this.btnCancelarClienteActionPerformed(evt);
            }
            else if (evt.getSource() == btnExcluirEndereco) {
                ClienteView.this.btnExcluirEnderecoActionPerformed(evt);
            }
            else if (evt.getSource() == btnNovoEndereco) {
                ClienteView.this.btnNovoEnderecoActionPerformed(evt);
            }
            else if (evt.getSource() == btnEditarCliente) {
                ClienteView.this.btnEditarClienteActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents


    private void btnExcluirEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEnderecoActionPerformed
        int index = masterTable.getSelectedRow();
        Cliente cliente = list.get(masterTable.convertRowIndexToModel(index));
        Collection<Endereco> enderecos = cliente.getEnderecos();
        int[] selected = detailTable.getSelectedRows();
        List<Endereco> toRemove = new ArrayList<>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {

            selected[idx] = detailTable.convertRowIndexToModel(selected[idx]);

            int count = 0;
            Iterator<Endereco> iter = enderecos.iterator();
            while (count++ < selected[idx]) {
                iter.next();
            }
            Endereco endereco = iter.next();
            toRemove.add(endereco);
            entityManager.remove(endereco);
        }
        enderecos.removeAll(toRemove);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
    }//GEN-LAST:event_btnExcluirEnderecoActionPerformed

    private void btnNovoEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoEnderecoActionPerformed
        int index = masterTable.getSelectedRow();
        Cliente cliente = list.get(masterTable.convertRowIndexToModel(index));
        Collection<Endereco> enderecos = cliente.getEnderecos();
        if (enderecos == null) {
            enderecos = new LinkedList<>();
            cliente.setEnderecos((List) enderecos);
        }
        Endereco endereco = new Endereco();
        entityManager.persist(endereco);
        endereco.setCliente(cliente);
        enderecos.add(endereco);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
        int row = enderecos.size() - 1;
        detailTable.setRowSelectionInterval(row, row);
        detailTable.scrollRectToVisible(detailTable.getCellRect(row, 0, true));
    }//GEN-LAST:event_btnNovoEnderecoActionPerformed

    @SuppressWarnings("unchecked")
    private void btnCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarClienteActionPerformed
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }//GEN-LAST:event_btnCancelarClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        int[] selected = masterTable.getSelectedRows();
        List<Cliente> toRemove = new ArrayList<>(selected.length);
        for (int idx = 0; idx < selected.length; idx++) {
            Cliente cliente = list.get(masterTable.convertRowIndexToModel(selected[idx]));
            toRemove.add(cliente);
            entityManager.remove(cliente);
        }
        list.removeAll(toRemove);
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed

        Cliente cliente = new Cliente();
        entityManager.persist(cliente);
        list.add(cliente);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));

        ClienteEditView clienteEditView = new ClienteEditView(null, true);
        clienteEditView.setRegistroAtual(cliente);
        clienteEditView.setVisible(true);

        if (clienteEditView.isConfirmaCliente()) {
            btnConfirmarCliente.doClick();
        } else {
            btnCancelarCliente.doClick();
        }
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnConfirmarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarClienteActionPerformed
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            entityManager.getTransaction().begin();
            List<Cliente> merged = new ArrayList<>(list.size());
            for (Cliente cliente : list) {
                merged.add(entityManager.merge(cliente));
            }
            list.clear();
            list.addAll(merged);
        }
    }//GEN-LAST:event_btnConfirmarClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        ClienteEditView clienteEditView = new ClienteEditView(null, true);
        clienteEditView.setRegistroAtual(list.get(masterTable.getSelectedRow()));
        clienteEditView.setVisible(true);

        if (clienteEditView.isConfirmaCliente()) {
            btnConfirmarCliente.doClick();
        } else {
            btnCancelarCliente.doClick();
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCliente;
    private javax.swing.JButton btnConfirmarCliente;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnExcluirEndereco;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnNovoEndereco;
    private javax.swing.JScrollPane detailScrollPane;
    private javax.swing.JTable detailTable;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<br.com.siscom.bean.Cliente> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JScrollPane masterScrollPane1;
    private javax.swing.JTable masterTable;
    private javax.swing.JTable masterTable1;
    private javax.swing.JPanel pnlListaClientes;
    private javax.swing.JPanel pnlListaEnderecos;
    private javax.persistence.Query query;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(final String[] args) {
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
            java.util.logging.Logger.getLogger(ClienteView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.setContentPane(new ClienteView());
                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                if (args.length > 0) {
                    frame.setTitle(args[0]);
                }
            }
        });
    }

}

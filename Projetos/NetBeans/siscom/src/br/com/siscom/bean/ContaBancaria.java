/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siscom.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author cesar
 */
@Entity
@Table(name = "conta_bancaria", catalog = "siscom", schema = "public")
@SequenceGenerator(name = "conta_bancaria_seq", initialValue = 1, allocationSize = 1)
@NamedQueries({
    @NamedQuery(name = "Banco.findAll", query = "SELECT b FROM ContaBancaria b"),
    @NamedQuery(name = "Banco.findById", query = "SELECT b FROM ContaBancaria b WHERE b.id = :id"),
    @NamedQuery(name = "Banco.findByCodigoBanco", query = "SELECT b FROM ContaBancaria b WHERE b.codigoBanco = :codigoBanco"),
    @NamedQuery(name = "Banco.findByNumeroAgencia", query = "SELECT b FROM ContaBancaria b WHERE b.numeroAgencia = :numeroAgencia"),
    @NamedQuery(name = "Banco.findByNumeroConta", query = "SELECT b FROM ContaBancaria b WHERE b.numeroConta = :numeroConta"),
    @NamedQuery(name = "Banco.findByNomeGerente", query = "SELECT b FROM ContaBancaria b WHERE b.nomeGerente = :nomeGerente"),
    @NamedQuery(name = "Banco.findByFoneBanco", query = "SELECT b FROM ContaBancaria b WHERE b.foneBanco = :foneBanco")})
public class ContaBancaria implements Serializable {

//    @Transient
    private final PropertyChangeSupport CHANGE_SUPPORT = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String codigoBanco;

    private Short numeroAgencia;

    private Integer numeroConta;

    private String nomeGerente;

    private String foneBanco;

    public ContaBancaria() {
        super();
    }

    public ContaBancaria(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conta_bancaria_seq")
    @Basic(optional = false)
    @Column(name = "id_conta_bancaria")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        CHANGE_SUPPORT.firePropertyChange("id", oldId, id);
    }

    @Basic(optional = false)
    @Column(name = "cod_banco")
    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        String oldCodigoBanco = this.codigoBanco;
        this.codigoBanco = codigoBanco;
        CHANGE_SUPPORT.firePropertyChange("codigoBanco", oldCodigoBanco, codigoBanco);
    }

    @Basic(optional = false)
    @Column(name = "agencia_banco")
    public Short getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Short numeroAgencia) {
        Short oldNumeroAgencia = this.numeroAgencia;
        this.numeroAgencia = numeroAgencia;
        CHANGE_SUPPORT.firePropertyChange("numeroAgencia", oldNumeroAgencia, numeroAgencia);
    }

    @Basic(optional = false)
    @Column(name = "conta_banco")
    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        Integer oldNumeroConta = this.numeroConta;
        this.numeroConta = numeroConta;
        CHANGE_SUPPORT.firePropertyChange("numeroConta", oldNumeroConta, numeroConta);
    }

    @Column(name = "gerente_banco")
    public String getNomeGerente() {
        return nomeGerente;
    }

    public void setNomeGerente(String nomeGerente) {
        String oldNomeGerente = this.nomeGerente;
        this.nomeGerente = nomeGerente;
        CHANGE_SUPPORT.firePropertyChange("nomeGerente", oldNomeGerente, nomeGerente);
    }

    @Column(name = "fone_banco")
    public String getFoneBanco() {
        return foneBanco;
    }

    public void setFoneBanco(String foneBanco) {
        String oldFoneBanco = this.foneBanco;
        this.foneBanco = foneBanco;
        CHANGE_SUPPORT.firePropertyChange("foneBanco", oldFoneBanco, foneBanco);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContaBancaria)) {
            return false;
        }
        ContaBancaria other = (ContaBancaria) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        CHANGE_SUPPORT.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        CHANGE_SUPPORT.removePropertyChangeListener(listener);
    }

}

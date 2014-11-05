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
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author cesar
 */
@Entity
@Table(name = "conta_bancaria", catalog = "siscom", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Banco.findAll", query = "SELECT b FROM ContaBancaria b"),
    @NamedQuery(name = "Banco.findByCodBanco", query = "SELECT b FROM ContaBancaria b WHERE b.codBanco = :codBanco"),
    @NamedQuery(name = "Banco.findByNomeBanco", query = "SELECT b FROM ContaBancaria b WHERE b.nomeBanco = :nomeBanco"),
    @NamedQuery(name = "Banco.findByAgenciaBanco", query = "SELECT b FROM ContaBancaria b WHERE b.agenciaBanco = :agenciaBanco"),
    @NamedQuery(name = "Banco.findByContaBanco", query = "SELECT b FROM ContaBancaria b WHERE b.contaBanco = :contaBanco"),
    @NamedQuery(name = "Banco.findByGerenteBanco", query = "SELECT b FROM ContaBancaria b WHERE b.gerenteBanco = :gerenteBanco"),
    @NamedQuery(name = "Banco.findByFoneBanco", query = "SELECT b FROM ContaBancaria b WHERE b.foneBanco = :foneBanco")})
public class ContaBancaria implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_conta_bancaria")
    private Integer codBanco;
    @Basic(optional = false)
    @Column(name = "cod_banco")
    private String nomeBanco;
    @Basic(optional = false)
    @Column(name = "agencia_banco")
    private int agenciaBanco;
    @Basic(optional = false)
    @Column(name = "conta_banco")
    private int contaBanco;
    @Column(name = "gerente_banco")
    private String gerenteBanco;
    @Column(name = "fone_banco")
    private String foneBanco;

    public ContaBancaria() {
    }

    public ContaBancaria(Integer codBanco) {
        this.codBanco = codBanco;
    }

    public ContaBancaria(Integer codBanco, String nomeBanco, int agenciaBanco, int contaBanco) {
        this.codBanco = codBanco;
        this.nomeBanco = nomeBanco;
        this.agenciaBanco = agenciaBanco;
        this.contaBanco = contaBanco;
    }

    public Integer getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(Integer codBanco) {
        Integer oldCodBanco = this.codBanco;
        this.codBanco = codBanco;
        changeSupport.firePropertyChange("codBanco", oldCodBanco, codBanco);
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        String oldNomeBanco = this.nomeBanco;
        this.nomeBanco = nomeBanco;
        changeSupport.firePropertyChange("nomeBanco", oldNomeBanco, nomeBanco);
    }

    public int getAgenciaBanco() {
        return agenciaBanco;
    }

    public void setAgenciaBanco(int agenciaBanco) {
        int oldAgenciaBanco = this.agenciaBanco;
        this.agenciaBanco = agenciaBanco;
        changeSupport.firePropertyChange("agenciaBanco", oldAgenciaBanco, agenciaBanco);
    }

    public int getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(int contaBanco) {
        int oldContaBanco = this.contaBanco;
        this.contaBanco = contaBanco;
        changeSupport.firePropertyChange("contaBanco", oldContaBanco, contaBanco);
    }

    public String getGerenteBanco() {
        return gerenteBanco;
    }

    public void setGerenteBanco(String gerenteBanco) {
        String oldGerenteBanco = this.gerenteBanco;
        this.gerenteBanco = gerenteBanco;
        changeSupport.firePropertyChange("gerenteBanco", oldGerenteBanco, gerenteBanco);
    }

    public String getFoneBanco() {
        return foneBanco;
    }

    public void setFoneBanco(String foneBanco) {
        String oldFoneBanco = this.foneBanco;
        this.foneBanco = foneBanco;
        changeSupport.firePropertyChange("foneBanco", oldFoneBanco, foneBanco);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codBanco != null ? codBanco.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ContaBancaria)) {
            return false;
        }
        ContaBancaria other = (ContaBancaria) object;
        if ((this.codBanco == null && other.codBanco != null) || (this.codBanco != null && !this.codBanco.equals(other.codBanco))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[ codBanco=" + codBanco + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}

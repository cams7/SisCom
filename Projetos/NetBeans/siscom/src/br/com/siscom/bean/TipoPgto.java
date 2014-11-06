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
@Table(name = "tipo_pgto", catalog = "siscom", schema = "public")
@NamedQueries({
    @NamedQuery(name = "TipoPgto.findAll", query = "SELECT t FROM TipoPgto t"),
    @NamedQuery(name = "TipoPgto.findById", query = "SELECT t FROM TipoPgto t WHERE t.id = :id"),
    @NamedQuery(name = "TipoPgto.findByDescricao", query = "SELECT t FROM TipoPgto t WHERE t.descricao = :descricao")})
public class TipoPgto implements Serializable {

    @Transient
    private final PropertyChangeSupport CHANGE_SUPPORT = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_tipo_pgto")
    private Short id;

    @Basic(optional = false)
    @Column(name = "descricao_tipo_pgto")
    private String descricao;

    public TipoPgto() {
        super();
    }

    public TipoPgto(Short id) {
        this();

        this.id = id;
    }

    public TipoPgto(Short id, String descricao) {
        this(id);
        this.descricao = descricao;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        Short oldId = this.id;
        this.id = id;
        CHANGE_SUPPORT.firePropertyChange("id", oldId, id);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        CHANGE_SUPPORT.firePropertyChange("descricao", oldDescricao, descricao);
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
        if (!(object instanceof TipoPgto)) {
            return false;
        }
        TipoPgto other = (TipoPgto) object;
        return (this.id != null || other.id == null) && (this.id == null || this.id.equals(other.id));
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[ codTipoPgto=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        CHANGE_SUPPORT.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        CHANGE_SUPPORT.removePropertyChangeListener(listener);
    }

}

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author cesar
 */
@Entity
@Table(name = "cliente_telefone", catalog = "siscom", schema = "public")
@SequenceGenerator(name = "cliente_telefone_seq", initialValue = 1, allocationSize = 1)
//@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Telefone.findAll", query = "SELECT t FROM Telefone t"),
    @NamedQuery(name = "Telefone.findById", query = "SELECT t FROM Telefone t WHERE t.id = :id"),
    @NamedQuery(name = "Telefone.findByNumero", query = "SELECT t FROM Telefone t WHERE t.numero = :numero"),
    @NamedQuery(name = "Telefone.findByTipo", query = "SELECT t FROM Telefone t WHERE t.tipo = :tipo")})
public class Telefone implements Serializable {

//    @Transient
    private final PropertyChangeSupport CHANGE_SUPPORT = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String numero;

    private Character tipo;

    private Cliente cliente;

    public Telefone() {
        super();
    }

    public Telefone(Integer id) {
        this();
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_telefone_seq")
    @Basic(optional = false)
    @Column(name = "cod_telefone")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        CHANGE_SUPPORT.firePropertyChange("id", oldId, id);
    }

    @Basic(optional = false)
    @Column(name = "numero_telefone")
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        String oldNumero = this.numero;
        this.numero = numero;
        CHANGE_SUPPORT.firePropertyChange("numero", oldNumero, numero);
    }

    @Basic(optional = false)
    @Column(name = "tipo_telefone")
    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        Character oldTipo = this.tipo;
        this.tipo = tipo;
        CHANGE_SUPPORT.firePropertyChange("tipo", oldTipo, tipo);
    }

    @JoinColumn(name = "cod_cliente", referencedColumnName = "cod_cliente")
    @ManyToOne(optional = false)
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente oldCliente = this.cliente;
        this.cliente = cliente;
        CHANGE_SUPPORT.firePropertyChange("cliente", oldCliente, cliente);
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
        if (!(object instanceof Telefone)) {
            return false;
        }
        Telefone other = (Telefone) object;
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

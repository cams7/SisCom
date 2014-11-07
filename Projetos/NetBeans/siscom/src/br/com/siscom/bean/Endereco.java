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
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author cesar
 */
@Entity
@Table(name = "cliente_endereco", catalog = "siscom", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Endereco.findAll", query = "SELECT c FROM Endereco c"),
    @NamedQuery(name = "Endereco.findById", query = "SELECT c FROM Endereco c WHERE c.id = :id"),
    @NamedQuery(name = "Endereco.findByLogradouro", query = "SELECT c FROM Endereco c WHERE c.logradouro = :logradouro"),
    @NamedQuery(name = "Endereco.findByComplemento", query = "SELECT c FROM Endereco c WHERE c.complemento = :complemento"),
    @NamedQuery(name = "Endereco.findByCep", query = "SELECT c FROM Endereco c WHERE c.cep = :cep"),
    @NamedQuery(name = "Endereco.findByBairro", query = "SELECT c FROM Endereco c WHERE c.bairro = :bairro"),
    @NamedQuery(name = "Endereco.findByCidade", query = "SELECT c FROM Endereco c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "Endereco.findByUf", query = "SELECT c FROM Endereco c WHERE c.uf = :uf")})
public class Endereco implements Serializable {

    @Transient
    private final PropertyChangeSupport CHANGE_SUPPORT = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_endereco")
    private Integer id;

    @Basic(optional = false)
    @Column(name = "logradouro_endereco")
    private String logradouro;

    @Column(name = "complemento_endereco")
    private String complemento;

    @Column(name = "cep_endereco")
    private String cep;

    @Column(name = "bairro_endereco")
    private String bairro;

    @Basic(optional = false)
    @Column(name = "cidade_endereco")
    private String cidade;

    @Basic(optional = false)
    @Column(name = "uf_endereco")
    private String uf;

    @JoinColumn(name = "cod_cliente", referencedColumnName = "cod_cliente")
    @ManyToOne(optional = false)
    private Cliente cliente;

    public Endereco() {
        super();
    }

    public Endereco(Integer codEndereco) {
        this();
        this.id = codEndereco;
    }

    public Endereco(Integer id, String logradouro, String cidade, String uf) {
        this(id);
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.uf = uf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        CHANGE_SUPPORT.firePropertyChange("id", oldId, id);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        String oldLogradouro = this.logradouro;
        this.logradouro = logradouro;
        CHANGE_SUPPORT.firePropertyChange("logradouro", oldLogradouro, logradouro);
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        String oldComplemento = this.complemento;
        this.complemento = complemento;
        CHANGE_SUPPORT.firePropertyChange("complemento", oldComplemento, complemento);
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        CHANGE_SUPPORT.firePropertyChange("cep", oldCep, cep);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        CHANGE_SUPPORT.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        CHANGE_SUPPORT.firePropertyChange("cidade", oldCidade, cidade);
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        String oldUf = this.uf;
        this.uf = uf;
        CHANGE_SUPPORT.firePropertyChange("uf", oldUf, uf);
    }

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
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
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

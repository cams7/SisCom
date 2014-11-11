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
@Table(name = "fornecedor", catalog = "siscom", schema = "public")
@SequenceGenerator(name = "fornecedor_seq", initialValue = 1, allocationSize = 1)
@NamedQueries({
    @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f"),
    @NamedQuery(name = "Fornecedor.findById", query = "SELECT f FROM Fornecedor f WHERE f.id = :id"),
    @NamedQuery(name = "Fornecedor.findByNome", query = "SELECT f FROM Fornecedor f WHERE f.nome = :nome"),
    @NamedQuery(name = "Fornecedor.findByCpf", query = "SELECT f FROM Fornecedor f WHERE f.cpf = :cpf"),
    @NamedQuery(name = "Fornecedor.findByRg", query = "SELECT f FROM Fornecedor f WHERE f.rg = :rg"),
    @NamedQuery(name = "Fornecedor.findByOrgaoRg", query = "SELECT f FROM Fornecedor f WHERE f.orgaoRg = :orgaoRg"),
    @NamedQuery(name = "Fornecedor.findByCnpj", query = "SELECT f FROM Fornecedor f WHERE f.cnpj = :cnpj"),
    @NamedQuery(name = "Fornecedor.findByTipo", query = "SELECT f FROM Fornecedor f WHERE f.tipo = :tipo"),
    @NamedQuery(name = "Fornecedor.findByLogradouro", query = "SELECT f FROM Fornecedor f WHERE f.logradouro = :logradouro"),
    @NamedQuery(name = "Fornecedor.findByBairro", query = "SELECT f FROM Fornecedor f WHERE f.bairro = :bairro"),
    @NamedQuery(name = "Fornecedor.findByCidade", query = "SELECT f FROM Fornecedor f WHERE f.cidade = :cidade"),
    @NamedQuery(name = "Fornecedor.findByUf", query = "SELECT f FROM Fornecedor f WHERE f.uf = :uf"),
    @NamedQuery(name = "Fornecedor.findByCep", query = "SELECT f FROM Fornecedor f WHERE f.cep = :cep"),
    @NamedQuery(name = "Fornecedor.findByEmail", query = "SELECT f FROM Fornecedor f WHERE f.email = :email"),
    @NamedQuery(name = "Fornecedor.findBySite", query = "SELECT f FROM Fornecedor f WHERE f.site = :site"),
    @NamedQuery(name = "Fornecedor.findByTelefone", query = "SELECT f FROM Fornecedor f WHERE f.telefone = :telefone"),
    @NamedQuery(name = "Fornecedor.findByCelular", query = "SELECT f FROM Fornecedor f WHERE f.celular = :celular"),
    @NamedQuery(name = "Fornecedor.findByFax", query = "SELECT f FROM Fornecedor f WHERE f.fax = :fax"),
    @NamedQuery(name = "Fornecedor.findByContato", query = "SELECT f FROM Fornecedor f WHERE f.contato = :contato")})
public class Fornecedor implements Serializable {

//    @Transient
    private final PropertyChangeSupport CHANGE_SUPPORT = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String nome;

    private String cpf;

    private String rg;

    private String orgaoRg;

    private String cnpj;

    private Character tipo;

    private String logradouro;

    private String bairro;

    private String cidade;

    private String uf;

    private String cep;

    private String email;

    private String site;

    private String telefone;

    private String celular;

    private String fax;

    private String contato;

    public Fornecedor() {
        super();
    }

    public Fornecedor(Integer id) {
        this();
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fornecedor_seq")
    @Basic(optional = false)
    @Column(name = "cod_fornecedor")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        CHANGE_SUPPORT.firePropertyChange("id", oldId, id);
    }

    @Basic(optional = false)
    @Column(name = "nome_fornecedor")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        CHANGE_SUPPORT.firePropertyChange("nome", oldNome, nome);
    }

    @Column(name = "cpf_fornecedor")
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        CHANGE_SUPPORT.firePropertyChange("cpf", oldCpf, cpf);
    }

    @Column(name = "rg_fornecedor")
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        CHANGE_SUPPORT.firePropertyChange("rg", oldRg, rg);
    }

    @Column(name = "orgao_rg_fornecedor")
    public String getOrgaoRg() {
        return orgaoRg;
    }

    public void setOrgaoRg(String orgaoRg) {
        String oldOrgaoRg = this.orgaoRg;
        this.orgaoRg = orgaoRg;
        CHANGE_SUPPORT.firePropertyChange("orgaoRg", oldOrgaoRg, orgaoRg);
    }

    @Column(name = "cnpj_fornecedor")
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        CHANGE_SUPPORT.firePropertyChange("cnpj", oldCnpj, cnpj);
    }

    @Column(name = "tipo_fornecedor")
    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        Character oldTipo = this.tipo;
        this.tipo = tipo;
        CHANGE_SUPPORT.firePropertyChange("tipo", oldTipo, tipo);
    }

    @Column(name = "endereco_fornecedor")
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        String oldLogradouro = this.logradouro;
        this.logradouro = logradouro;
        CHANGE_SUPPORT.firePropertyChange("logradouro", oldLogradouro, logradouro);
    }

    @Column(name = "bairro_fornecedor")
    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        CHANGE_SUPPORT.firePropertyChange("bairro", oldBairro, bairro);
    }

    @Column(name = "cidade_fornecedor")
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        CHANGE_SUPPORT.firePropertyChange("cidade", oldCidade, cidade);
    }

    @Column(name = "uf_fornecedor")
    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        String oldUf = this.uf;
        this.uf = uf;
        CHANGE_SUPPORT.firePropertyChange("uf", oldUf, uf);
    }

    @Column(name = "cep_fornecedor")
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        CHANGE_SUPPORT.firePropertyChange("cep", oldCep, cep);
    }

    @Column(name = "email_fornecedor")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        CHANGE_SUPPORT.firePropertyChange("email", oldEmail, email);
    }

    @Column(name = "site_fornecedor")
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        String oldSite = this.site;
        this.site = site;
        CHANGE_SUPPORT.firePropertyChange("site", oldSite, site);
    }

    @Column(name = "fone_fornecedor")
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        String oldTelefone = this.telefone;
        this.telefone = telefone;
        CHANGE_SUPPORT.firePropertyChange("telefone", oldTelefone, telefone);
    }

    @Column(name = "celular_fornecedor")
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        String oldCelularFornecedor = this.celular;
        this.celular = celular;
        CHANGE_SUPPORT.firePropertyChange("celular", oldCelularFornecedor, celular);
    }

    @Column(name = "fax_fornecedor")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        String oldFax = this.fax;
        this.fax = fax;
        CHANGE_SUPPORT.firePropertyChange("fax", oldFax, fax);
    }

    @Column(name = "contato_fornecedor")
    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        String oldContato = this.contato;
        this.contato = contato;
        CHANGE_SUPPORT.firePropertyChange("contato", oldContato, contato);
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
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
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

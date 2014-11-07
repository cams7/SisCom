/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.siscom.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author cesar
 */
@Entity
@Table(name = "cliente", catalog = "siscom", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findById", query = "SELECT c FROM Cliente c WHERE c.id = :id"),
    @NamedQuery(name = "Cliente.findByNome", query = "SELECT c FROM Cliente c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cliente.findByCpf", query = "SELECT c FROM Cliente c WHERE c.cpf = :cpf"),
    @NamedQuery(name = "Cliente.findByDesde", query = "SELECT c FROM Cliente c WHERE c.desde = :desde"),
    @NamedQuery(name = "Cliente.findByRg", query = "SELECT c FROM Cliente c WHERE c.rg = :rg"),
    @NamedQuery(name = "Cliente.findByOrgaoRg", query = "SELECT c FROM Cliente c WHERE c.orgaoRg = :orgaoRg"),
    @NamedQuery(name = "Cliente.findByNascimento", query = "SELECT c FROM Cliente c WHERE c.nascimento = :nascimento"),
    @NamedQuery(name = "Cliente.findByProfissao", query = "SELECT c FROM Cliente c WHERE c.profissao = :profissao"),
    @NamedQuery(name = "Cliente.findByEmpresa", query = "SELECT c FROM Cliente c WHERE c.empresa = :empresa"),
    @NamedQuery(name = "Cliente.findByFoneEmpresa", query = "SELECT c FROM Cliente c WHERE c.foneEmpresa = :foneEmpresa"),
    @NamedQuery(name = "Cliente.findByRenda", query = "SELECT c FROM Cliente c WHERE c.renda = :renda"),
    @NamedQuery(name = "Cliente.findByTipo", query = "SELECT c FROM Cliente c WHERE c.tipo = :tipo"),
    @NamedQuery(name = "Cliente.findByCnpj", query = "SELECT c FROM Cliente c WHERE c.cnpj = :cnpj"),
    @NamedQuery(name = "Cliente.findByReferencia", query = "SELECT c FROM Cliente c WHERE c.referencia = :referencia"),
    @NamedQuery(name = "Cliente.findByFoneReferencia", query = "SELECT c FROM Cliente c WHERE c.foneReferencia = :foneReferencia"),
    @NamedQuery(name = "Cliente.findByEmail", query = "SELECT c FROM Cliente c WHERE c.email = :email")})
public class Cliente implements Serializable {

    @Transient
    private final PropertyChangeSupport CHANGE_SUPPORT = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cod_cliente")
    private Integer id;

    @Basic(optional = false)
    @Column(name = "nome_cliente")
    private String nome;

    @Column(name = "cpf_cliente")
    private String cpf;

    @Column(name = "desde_cliente")
    @Temporal(TemporalType.DATE)
    private Date desde;

    @Column(name = "rg_cliente")
    private String rg;

    @Column(name = "orgao_rg_cliente")
    private String orgaoRg;

    @Column(name = "nascimento_cliente")
    @Temporal(TemporalType.DATE)
    private Date nascimento;

    @Column(name = "profissao_cliente")
    private String profissao;

    @Column(name = "empresa_cliente")
    private String empresa;

    @Column(name = "fone_empresa")
    private String foneEmpresa;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "renda_cliente")
    private Double renda;

    @Column(name = "tipo_cliente")
    private Character tipo;

    @Column(name = "cnpj_cliente")
    private String cnpj;

    @Column(name = "referencia_cliente")
    private String referencia;

    @Column(name = "fone_referencia_cliente")
    private String foneReferencia;

    @Column(name = "email")
    private String email;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Endereco> enderecos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Telefone> telefones;

    public Cliente() {
        super();
    }

    public Cliente(Integer id) {
        this();
        this.id = id;
    }

    public Cliente(Integer id, String nome) {
        this(id);
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        CHANGE_SUPPORT.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        CHANGE_SUPPORT.firePropertyChange("nome", oldNome, nome);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        CHANGE_SUPPORT.firePropertyChange("cpf", oldCpf, cpf);
    }

    public Date getDesde() {
        return desde;
    }

    public void setDesde(Date desde) {
        Date oldDesde = this.desde;
        this.desde = desde;
        CHANGE_SUPPORT.firePropertyChange("desde", oldDesde, desde);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        CHANGE_SUPPORT.firePropertyChange("rg", oldRg, rg);
    }

    public String getOrgaoRg() {
        return orgaoRg;
    }

    public void setOrgaoRg(String orgaoRg) {
        String oldOrgaoRg = this.orgaoRg;
        this.orgaoRg = orgaoRg;
        CHANGE_SUPPORT.firePropertyChange("orgaoRg", oldOrgaoRg, orgaoRg);
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        Date oldNascimento = this.nascimento;
        this.nascimento = nascimento;
        CHANGE_SUPPORT.firePropertyChange("nascimento", oldNascimento, nascimento);
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        String oldProfissao = this.profissao;
        this.profissao = profissao;
        CHANGE_SUPPORT.firePropertyChange("profissao", oldProfissao, profissao);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        String oldEmpresa = this.empresa;
        this.empresa = empresa;
        CHANGE_SUPPORT.firePropertyChange("empresa", oldEmpresa, empresa);
    }

    public String getFoneEmpresa() {
        return foneEmpresa;
    }

    public void setFoneEmpresa(String foneEmpresa) {
        String oldFoneEmpresa = this.foneEmpresa;
        this.foneEmpresa = foneEmpresa;
        CHANGE_SUPPORT.firePropertyChange("foneEmpresa", oldFoneEmpresa, foneEmpresa);
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        Double oldRenda = this.renda;
        this.renda = renda;
        CHANGE_SUPPORT.firePropertyChange("renda", oldRenda, renda);
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        Character oldTipo = this.tipo;
        this.tipo = tipo;
        CHANGE_SUPPORT.firePropertyChange("tipo", oldTipo, tipo);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        CHANGE_SUPPORT.firePropertyChange("cnpj", oldCnpj, cnpj);
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        String oldReferencia = this.referencia;
        this.referencia = referencia;
        CHANGE_SUPPORT.firePropertyChange("referencia", oldReferencia, referencia);
    }

    public String getFoneReferencia() {
        return foneReferencia;
    }

    public void setFoneReferencia(String foneReferencia) {
        String oldFoneReferencia = this.foneReferencia;
        this.foneReferencia = foneReferencia;
        CHANGE_SUPPORT.firePropertyChange("foneReferencia", oldFoneReferencia, foneReferencia);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        CHANGE_SUPPORT.firePropertyChange("email", oldEmail, email);
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    @XmlTransient
    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
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

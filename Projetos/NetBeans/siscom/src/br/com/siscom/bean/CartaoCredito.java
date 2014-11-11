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
@Table(name = "cartao_credito", catalog = "siscom", schema = "public")
@SequenceGenerator(name = "cartao_credito_seq", initialValue = 1, allocationSize = 1)
@NamedQueries({
    @NamedQuery(name = "CartaoCredito.findAll", query = "SELECT c FROM CartaoCredito c"),
    @NamedQuery(name = "CartaoCredito.findById", query = "SELECT c FROM CartaoCredito c WHERE c.id = :id"),
    @NamedQuery(name = "CartaoCredito.findByOperadoraCartao", query = "SELECT c FROM CartaoCredito c WHERE c.operadoraCartao = :operadoraCartao"),
    @NamedQuery(name = "CartaoCredito.findByJurosRotativo", query = "SELECT c FROM CartaoCredito c WHERE c.jurosRotativo = :jurosRotativo"),
    @NamedQuery(name = "CartaoCredito.findByPagtoMinimo", query = "SELECT c FROM CartaoCredito c WHERE c.pagtoMinimo = :pagtoMinimo"),
    @NamedQuery(name = "CartaoCredito.findByJurosParcelado", query = "SELECT c FROM CartaoCredito c WHERE c.jurosParcelado = :jurosParcelado"),
    @NamedQuery(name = "CartaoCredito.findByMulta", query = "SELECT c FROM CartaoCredito c WHERE c.multa = :multa"),
    @NamedQuery(name = "CartaoCredito.findByMultaSemMinimoTotal", query = "SELECT c FROM CartaoCredito c WHERE c.multaSemMinimoTotal = :multaSemMinimoTotal"),
    @NamedQuery(name = "CartaoCredito.findByMultaCobradaDia", query = "SELECT c FROM CartaoCredito c WHERE c.multaCobradaDia = :multaCobradaDia")})
public class CartaoCredito implements Serializable {

    private final PropertyChangeSupport CHANGE_SUPPORT = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;

    private Short id;

    private String operadoraCartao;

    private String jurosRotativo;

    private Double pagtoMinimo;

    private Double jurosParcelado;

    private Double multa;

    private String multaSemMinimoTotal;

    private Integer multaCobradaDia;

    public CartaoCredito() {
        super();
    }

    public CartaoCredito(Short id) {
        this();
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cartao_credito_seq")
    @Basic(optional = false)
    @Column(name = "id_cartao_credito")
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        Short oldId = this.id;
        this.id = id;
        CHANGE_SUPPORT.firePropertyChange("id", oldId, id);
    }

    @Basic(optional = false)
    @Column(name = "empresa")
    public String getOperadoraCartao() {
        return operadoraCartao;
    }

    public void setOperadoraCartao(String operadoraCartao) {
        String oldOperadoraCartao = this.operadoraCartao;
        this.operadoraCartao = operadoraCartao;
        CHANGE_SUPPORT.firePropertyChange("operadoraCartao", oldOperadoraCartao, operadoraCartao);
    }

    @Basic(optional = false)
    @Column(name = "juros_rotativo")
    public String getJurosRotativo() {
        return jurosRotativo;
    }

    public void setJurosRotativo(String jurosRotativo) {
        String oldJurosRotativo = this.jurosRotativo;
        this.jurosRotativo = jurosRotativo;
        CHANGE_SUPPORT.firePropertyChange("jurosRotativo", oldJurosRotativo, jurosRotativo);
    }

    @Basic(optional = false)
    @Column(name = "pagto_minimo")
    public Double getPagtoMinimo() {
        return pagtoMinimo;
    }

    public void setPagtoMinimo(Double pagtoMinimo) {
        Double oldPagtoMinimo = this.pagtoMinimo;
        this.pagtoMinimo = pagtoMinimo;
        CHANGE_SUPPORT.firePropertyChange("pagtoMinimo", oldPagtoMinimo, pagtoMinimo);
    }

    @Basic(optional = false)
    @Column(name = "juros_parcelado")
    public Double getJurosParcelado() {
        return jurosParcelado;
    }

    public void setJurosParcelado(Double jurosParcelado) {
        Double oldJurosParcelado = this.jurosParcelado;
        this.jurosParcelado = jurosParcelado;
        CHANGE_SUPPORT.firePropertyChange("jurosParcelado", oldJurosParcelado, jurosParcelado);
    }

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "multa")
    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        Double oldMulta = this.multa;
        this.multa = multa;
        CHANGE_SUPPORT.firePropertyChange("multa", oldMulta, multa);
    }

    @Column(name = "multa_sem_minimo_total")
    public String getMultaSemMinimoTotal() {
        return multaSemMinimoTotal;
    }

    public void setMultaSemMinimoTotal(String multaSemMinimoTotal) {
        String oldMultaSemMinimoTotal = this.multaSemMinimoTotal;
        this.multaSemMinimoTotal = multaSemMinimoTotal;
        CHANGE_SUPPORT.firePropertyChange("multaSemMinimoTotal", oldMultaSemMinimoTotal, multaSemMinimoTotal);
    }

    @Column(name = "multa_cobrada_dia")
    public Integer getMultaCobradaDia() {
        return multaCobradaDia;
    }

    public void setMultaCobradaDia(Integer multaCobradaDia) {
        Integer oldMultaCobradaDia = this.multaCobradaDia;
        this.multaCobradaDia = multaCobradaDia;
        CHANGE_SUPPORT.firePropertyChange("multaCobradaDia", oldMultaCobradaDia, multaCobradaDia);
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
        if (!(object instanceof CartaoCredito)) {
            return false;
        }
        CartaoCredito other = (CartaoCredito) object;
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

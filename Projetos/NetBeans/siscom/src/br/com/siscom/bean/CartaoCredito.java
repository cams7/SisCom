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
@Table(name = "cartao_credito", catalog = "siscom", schema = "public")
@NamedQueries({
    @NamedQuery(name = "CartaoCredito.findAll", query = "SELECT c FROM CartaoCredito c"),
    @NamedQuery(name = "CartaoCredito.findByIdCartaoCredito", query = "SELECT c FROM CartaoCredito c WHERE c.idCartaoCredito = :idCartaoCredito"),
    @NamedQuery(name = "CartaoCredito.findByEmpresa", query = "SELECT c FROM CartaoCredito c WHERE c.empresa = :empresa"),
    @NamedQuery(name = "CartaoCredito.findByJurosRotativo", query = "SELECT c FROM CartaoCredito c WHERE c.jurosRotativo = :jurosRotativo"),
    @NamedQuery(name = "CartaoCredito.findByPagtoMinimo", query = "SELECT c FROM CartaoCredito c WHERE c.pagtoMinimo = :pagtoMinimo"),
    @NamedQuery(name = "CartaoCredito.findByJurosParcelado", query = "SELECT c FROM CartaoCredito c WHERE c.jurosParcelado = :jurosParcelado"),
    @NamedQuery(name = "CartaoCredito.findByMulta", query = "SELECT c FROM CartaoCredito c WHERE c.multa = :multa"),
    @NamedQuery(name = "CartaoCredito.findByMultaSemMinimoTotal", query = "SELECT c FROM CartaoCredito c WHERE c.multaSemMinimoTotal = :multaSemMinimoTotal"),
    @NamedQuery(name = "CartaoCredito.findByMultaCobradaDia", query = "SELECT c FROM CartaoCredito c WHERE c.multaCobradaDia = :multaCobradaDia")})
public class CartaoCredito implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cartao_credito")
    private Integer idCartaoCredito;
    @Basic(optional = false)
    @Column(name = "empresa")
    private String empresa;
    @Basic(optional = false)
    @Column(name = "juros_rotativo")
    private String jurosRotativo;
    @Basic(optional = false)
    @Column(name = "pagto_minimo")
    private double pagtoMinimo;
    @Basic(optional = false)
    @Column(name = "juros_parcelado")
    private double jurosParcelado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "multa")
    private Double multa;
    @Column(name = "multa_sem_minimo_total")
    private String multaSemMinimoTotal;
    @Column(name = "multa_cobrada_dia")
    private Integer multaCobradaDia;

    public CartaoCredito() {
    }

    public CartaoCredito(Integer idCartaoCredito) {
        this.idCartaoCredito = idCartaoCredito;
    }

    public CartaoCredito(Integer idCartaoCredito, String empresa, String jurosRotativo, double pagtoMinimo, double jurosParcelado) {
        this.idCartaoCredito = idCartaoCredito;
        this.empresa = empresa;
        this.jurosRotativo = jurosRotativo;
        this.pagtoMinimo = pagtoMinimo;
        this.jurosParcelado = jurosParcelado;
    }

    public Integer getIdCartaoCredito() {
        return idCartaoCredito;
    }

    public void setIdCartaoCredito(Integer idCartaoCredito) {
        Integer oldIdCartaoCredito = this.idCartaoCredito;
        this.idCartaoCredito = idCartaoCredito;
        changeSupport.firePropertyChange("idCartaoCredito", oldIdCartaoCredito, idCartaoCredito);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        String oldEmpresa = this.empresa;
        this.empresa = empresa;
        changeSupport.firePropertyChange("empresa", oldEmpresa, empresa);
    }

    public String getJurosRotativo() {
        return jurosRotativo;
    }

    public void setJurosRotativo(String jurosRotativo) {
        String oldJurosRotativo = this.jurosRotativo;
        this.jurosRotativo = jurosRotativo;
        changeSupport.firePropertyChange("jurosRotativo", oldJurosRotativo, jurosRotativo);
    }

    public double getPagtoMinimo() {
        return pagtoMinimo;
    }

    public void setPagtoMinimo(double pagtoMinimo) {
        double oldPagtoMinimo = this.pagtoMinimo;
        this.pagtoMinimo = pagtoMinimo;
        changeSupport.firePropertyChange("pagtoMinimo", oldPagtoMinimo, pagtoMinimo);
    }

    public double getJurosParcelado() {
        return jurosParcelado;
    }

    public void setJurosParcelado(double jurosParcelado) {
        double oldJurosParcelado = this.jurosParcelado;
        this.jurosParcelado = jurosParcelado;
        changeSupport.firePropertyChange("jurosParcelado", oldJurosParcelado, jurosParcelado);
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        Double oldMulta = this.multa;
        this.multa = multa;
        changeSupport.firePropertyChange("multa", oldMulta, multa);
    }

    public String getMultaSemMinimoTotal() {
        return multaSemMinimoTotal;
    }

    public void setMultaSemMinimoTotal(String multaSemMinimoTotal) {
        String oldMultaSemMinimoTotal = this.multaSemMinimoTotal;
        this.multaSemMinimoTotal = multaSemMinimoTotal;
        changeSupport.firePropertyChange("multaSemMinimoTotal", oldMultaSemMinimoTotal, multaSemMinimoTotal);
    }

    public Integer getMultaCobradaDia() {
        return multaCobradaDia;
    }

    public void setMultaCobradaDia(Integer multaCobradaDia) {
        Integer oldMultaCobradaDia = this.multaCobradaDia;
        this.multaCobradaDia = multaCobradaDia;
        changeSupport.firePropertyChange("multaCobradaDia", oldMultaCobradaDia, multaCobradaDia);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCartaoCredito != null ? idCartaoCredito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CartaoCredito)) {
            return false;
        }
        CartaoCredito other = (CartaoCredito) object;
        if ((this.idCartaoCredito == null && other.idCartaoCredito != null) || (this.idCartaoCredito != null && !this.idCartaoCredito.equals(other.idCartaoCredito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.view.CartaoCredito[ idCartaoCredito=" + idCartaoCredito + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

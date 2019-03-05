/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author User
 */
@Entity
public class TaxeTrimestrielle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double chiffreAffaire;
    private Double montantTaxe;//mt+mtretard+mtpenalite
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date datepresenatation;
    private Double montantBase;
    private Double montantPenalite;
    private Double montantMajoration;
    private long nbMoisRetard;
    private int annee;
    private int trimestre;
    private boolean paye;
    
//    @ManyToOne
//    private TauxTrimestrielle tauxtrimestrielle;
    @ManyToOne
    private TaxeAnnuelle taxeanuelle;
    private String referenceLocal;
    //private Redevable redevable;

    public String getReferenceLocal() {
        return referenceLocal;
    }

    public void setReferenceLocal(String referenceLocal) {
        this.referenceLocal = referenceLocal;
    }

    public Double getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(Double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public Date getDatepresenatation() {
        return datepresenatation;
    }

    public void setDatepresenatation(Date datepresenatation) {
        this.datepresenatation = datepresenatation;
    }

    
    public Double getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(Double montantBase) {
        this.montantBase = montantBase;
    }

    public Double getMontantPenalite() {
        return montantPenalite;
    }

    public void setMontantPenalite(Double montantPenalite) {
        this.montantPenalite = montantPenalite;
    }

    public boolean isPaye() {
        return paye;
    }

    public void setPaye(boolean paye) {
        this.paye = paye;
    }

    
    public Double getMontantMajoration() {
        return montantMajoration;
    }

    public void setMontantMajoration(Double montantMajoration) {
        this.montantMajoration = montantMajoration;
    }

    public Double getMontantTaxe() {
        return montantTaxe;
    }

    public void setMontantTaxe(Double montantTaxe) {
        this.montantTaxe = montantTaxe;
    }

    public long getNbMoisRetard() {
        return nbMoisRetard;
    }

    public void setNbMoisRetard(long nbMoisRetard) {
        this.nbMoisRetard = nbMoisRetard;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(int trimestre) {
        this.trimestre = trimestre;
    }


    
//
//    public TauxTrimestrielle getTauxtrimestrielle() {
//        return tauxtrimestrielle;
//    }
//
//    public void setTauxtrimestrielle(TauxTrimestrielle tauxtrimestrielle) {
//        this.tauxtrimestrielle = tauxtrimestrielle;
//    }

    public TaxeAnnuelle getTaxeanuelle() {
        return taxeanuelle;
    }

    public void setTaxeanuelle(TaxeAnnuelle taxeanuelle) {
        this.taxeanuelle = taxeanuelle;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof TaxeTrimestrielle)) {
            return false;
        }
        TaxeTrimestrielle other = (TaxeTrimestrielle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.Taxe_Boisson.bean.TaxeTrimestrielle[ id=" + id + " ]";
    }

}

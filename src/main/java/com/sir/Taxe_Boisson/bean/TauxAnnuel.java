/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author User
 */
@Entity
public class TauxAnnuel implements Serializable {

   
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double pourcentage;
    private Double penalite;
    private Double majoration;
    
     @OneToMany(mappedBy = "tauxannuelle")
    private List<TaxeAnnuelle> taxeAnnuelles;

    public Double getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(Double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public Double getPenalite() {
        return penalite;
    }

    public void setPenalite(Double penalite) {
        this.penalite = penalite;
    }

    public Double getMajoration() {
        return majoration;
    }

    public void setMajoration(Double majoration) {
        this.majoration = majoration;
    }

    public List<TaxeAnnuelle> getTaxeAnnuelles() {
        return taxeAnnuelles;
    }

    public void setTaxeAnnuelles(List<TaxeAnnuelle> taxeAnnuelles) {
        this.taxeAnnuelles = taxeAnnuelles;
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
        if (!(object instanceof TauxAnnuel)) {
            return false;
        }
        TauxAnnuel other = (TauxAnnuel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.Taxe_Boisson.bean.TauxAnnuel[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author User
 */
@Entity
public class TaxeAnnuelle implements Serializable {

   private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date paiementDelai;
   // private Local local;
    //private Redevable redevable;

    @ManyToOne
    private TauxAnnuel tauxannuelle;

    public Date getPaiementDelai() {
        return paiementDelai;
    }

    public void setPaiementDelai(Date paiementDelai) {
        this.paiementDelai = paiementDelai;
    }

    public TauxAnnuel getTauxannuelle() {
        return tauxannuelle;
    }

    public void setTauxannuelle(TauxAnnuel tauxannuelle) {
        this.tauxannuelle = tauxannuelle;
    }

    public List<TaxeTrimestrielle> getTaxeTrimestrielles() {
        return taxeTrimestrielles;
    }

    public void setTaxeTrimestrielles(List<TaxeTrimestrielle> taxeTrimestrielles) {
        this.taxeTrimestrielles = taxeTrimestrielles;
    }
    

    
     @OneToMany(mappedBy = "taxeanuelle")
    private List<TaxeTrimestrielle> taxeTrimestrielles;

    
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
        if (!(object instanceof TaxeAnnuelle)) {
            return false;
        }
        TaxeAnnuelle other = (TaxeAnnuelle) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sir.Taxe_Boisson.bean.TaxeAnnuelle[ id=" + id + " ]";
    }
    
}

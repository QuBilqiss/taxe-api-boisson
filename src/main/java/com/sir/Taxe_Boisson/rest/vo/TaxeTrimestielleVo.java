/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.rest.vo;

/**
 *
 * @author User
 */
public class TaxeTrimestielleVo {
     private String id;
    private String chiffreAffaire;
    private String montantTaxe;
    private String datepresenatation;
    private String montantBase;
    private String montantPenalite;
    private String montantMajoration;
    private String nbMoisRetard;
    private String annee;
    private String trimestre;
   // private TaxeAnnuelle taxeanuelle;
    private String referenceLocal;
    //private Redevable redevable;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChiffreAffaire() {
        return chiffreAffaire;
    }

    public void setChiffreAffaire(String chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
    }

    public String getMontantTaxe() {
        return montantTaxe;
    }

    public void setMontantTaxe(String montantTaxe) {
        this.montantTaxe = montantTaxe;
    }

    public String getDatepresenatation() {
        return datepresenatation;
    }

    public void setDatepresenatation(String datepresenatation) {
        this.datepresenatation = datepresenatation;
    }

    public String getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(String montantBase) {
        this.montantBase = montantBase;
    }

    public String getMontantPenalite() {
        return montantPenalite;
    }

    public void setMontantPenalite(String montantPenalite) {
        this.montantPenalite = montantPenalite;
    }

    public String getMontantMajoration() {
        return montantMajoration;
    }

    public void setMontantMajoration(String montantMajoration) {
        this.montantMajoration = montantMajoration;
    }

    public String getNbMoisRetard() {
        return nbMoisRetard;
    }

    public void setNbMoisRetard(String nbMoisRetard) {
        this.nbMoisRetard = nbMoisRetard;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getTrimestre() {
        return trimestre;
    }

    public void setTrimestre(String trimestre) {
        this.trimestre = trimestre;
    }

    public String getReferenceLocal() {
        return referenceLocal;
    }

    public void setReferenceLocal(String referenceLocal) {
        this.referenceLocal = referenceLocal;
    }
    
    

}

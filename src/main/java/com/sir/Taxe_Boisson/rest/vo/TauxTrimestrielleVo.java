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
public class TauxTrimestrielleVo {
    private String id;
    private String pourcentage;
    private String dateDebut;
    private String dateFin;
    private String refCategorie;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   

    public String getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(String pourcentage) {
        this.pourcentage = pourcentage;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public String getRefCategorie() {
        return refCategorie;
    }

    public void setRefCategorie(String refCategorie) {
        this.refCategorie = refCategorie;
    }
    
    

    
}

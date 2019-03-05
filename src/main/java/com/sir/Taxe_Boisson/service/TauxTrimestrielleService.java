/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.service;

import com.sir.Taxe_Boisson.bean.TauxTrimestrielle;
import java.util.Date;

/**
 *
 * @author User
 */
public interface TauxTrimestrielleService {
    public TauxTrimestrielle findByDateDebutAndDateFin(Date dateDebut,Date dateFin);
    public int creerTauxTrimestrielle(TauxTrimestrielle tauxTrimestrielle);
    public TauxTrimestrielle findByCategorieRefCategorie(String refCategorie);
}

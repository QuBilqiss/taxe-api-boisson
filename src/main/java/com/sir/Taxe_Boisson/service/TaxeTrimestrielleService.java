/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.service;

import com.sir.Taxe_Boisson.bean.TaxeTrimestrielle;

/**
 *
 * @author User
 */
public interface TaxeTrimestrielleService {
    public int creerTrimestre(int trimestre ,int annee);
   // public int creerTaxe(TaxeTrimestrielle taxeTrimestrielle);
    public TaxeTrimestrielle findTaxeTrimestrielleByReferenceLocalAndTrimestreAndAnnee(String referenceLocal,int trimestre,int annee);
    
}

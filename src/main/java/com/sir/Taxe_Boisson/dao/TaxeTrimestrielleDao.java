/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.dao;

import com.sir.Taxe_Boisson.bean.TaxeTrimestrielle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface TaxeTrimestrielleDao extends JpaRepository<TaxeTrimestrielle, Object>{
    public TaxeTrimestrielle findTaxeTrimestrielleByReferenceLocalAndTrimestreAndAnnee(String referenceLocal,int trimestre,int annee);
}

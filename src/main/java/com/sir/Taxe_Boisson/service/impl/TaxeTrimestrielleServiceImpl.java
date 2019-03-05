/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.service.impl;

import com.sir.Taxe_Boisson.bean.TauxTrimestrielle;
import com.sir.Taxe_Boisson.bean.TaxeTrimestrielle;
import com.sir.Taxe_Boisson.dao.TaxeTrimestrielleDao;
import com.sir.Taxe_Boisson.rest.proxy.LocalProxy;
import com.sir.Taxe_Boisson.rest.vo.LocalVo;
import com.sir.Taxe_Boisson.service.TauxTrimestrielleService;
import com.sir.Taxe_Boisson.service.TaxeTrimestrielleService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class TaxeTrimestrielleServiceImpl implements TaxeTrimestrielleService {

    @Autowired
    private TaxeTrimestrielleDao taxeTrimestrielleDao;

    @Autowired
    private LocalProxy localProxy;

    @Autowired
    private TauxTrimestrielleService tauxTrimestrielleService;

    @Override
    public int creerTrimestre(int trimestre, int annee) {

        return 1;
    }

    @Override
    public TaxeTrimestrielle findTaxeTrimestrielleByReferenceLocalAndTrimestreAndAnnee(String referenceLocal, int trimestre, int annee) {
        return taxeTrimestrielleDao.findTaxeTrimestrielleByReferenceLocalAndTrimestreAndAnnee(referenceLocal, trimestre, annee);
    }

//    @Override
//    public int creerTaxe(TaxeTrimestrielle taxeTrimestrielle) {
//        TaxeTrimestrielle t = findTaxeTrimestrielleByReferenceLocalAndTrimestreAndAnnee(taxeTrimestrielle.getReferenceLocal(), taxeTrimestrielle.getTrimestre(), taxeTrimestrielle.getAnnee());
//        LocalVo local = new LocalVo();
//        LocalVo localVo = localProxy.findByReference(taxeTrimestrielle.getReferenceLocal());
//        if (localVo == null || localVo.getReference() == null) {
//            return -1;
//        } else {
//            System.out.println("ha localVo ==> " + localVo.getId());
//            TauxTrimestrielle tauxTrimestrielle = tauxTrimestrielleService.findByCategorieRefCategorie(local.getRefCategorie());
//            //est ce que le redevable vient à l'heure 
//            long mois = 1000 * 60 * 60 * 24 * 30;
//            Date toDay = new Date();
//            long val = toDay.getTime() - taxeTrimestrielle.getDatepresenatation().getTime();
//            long nbMoisRetard = val / mois;
//            System.out.println("ha nbr retard ==> "+nbMoisRetard);
//            taxeTrimestrielle.setNbMoisRetard(nbMoisRetard);
//            long moisRetard = taxeTrimestrielle.getNbMoisRetard();
//
//            Double montantBase = taxeTrimestrielle.getChiffreAffaire() * tauxTrimestrielle.getPourcentage() / 100;
//            
//            taxeTrimestrielle.setMontantBase(montantBase);
//
//            if (moisRetard == 0) {
//                taxeTrimestrielle.setMontantTaxe(montantBase);
//                taxeTrimestrielle.setPaye(false);
//                taxeTrimestrielleDao.save(taxeTrimestrielle);
//                return 1;
//            } else {
//                taxeTrimestrielle.setMontantMajoration(montantBase * 10 / 100);
//                if (moisRetard == 1) {
//                    taxeTrimestrielle.setMontantTaxe(montantBase + taxeTrimestrielle.getMontantMajoration());
//                    taxeTrimestrielle.setPaye(false);
//                    taxeTrimestrielleDao.save(taxeTrimestrielle);
//                    return 2;
//                } else {
//                    taxeTrimestrielle.setMontantPenalite(montantBase * 5 / 100);
//                    taxeTrimestrielle.setMontantBase(montantBase + taxeTrimestrielle.getMontantMajoration() + taxeTrimestrielle.getMontantPenalite());
//                    taxeTrimestrielle.setPaye(false);
//                    taxeTrimestrielleDao.save(taxeTrimestrielle);
//                    return 3;
//                }
//            }
//        }
//    }

    public TaxeTrimestrielleDao getTaxeTrimestrielleDao() {
        return taxeTrimestrielleDao;
    }

    public void setTaxeTrimestrielleDao(TaxeTrimestrielleDao taxeTrimestrielleDao) {
        this.taxeTrimestrielleDao = taxeTrimestrielleDao;
    }

    public LocalProxy getLocalProxy() {
        return localProxy;
    }

    public void setLocalProxy(LocalProxy localProxy) {
        this.localProxy = localProxy;
    }

    public TauxTrimestrielleService getTauxTrimestrielleService() {
        return tauxTrimestrielleService;
    }

    public void setTauxTrimestrielleService(TauxTrimestrielleService tauxTrimestrielleService) {
        this.tauxTrimestrielleService = tauxTrimestrielleService;
    }

}

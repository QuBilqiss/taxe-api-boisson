/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.rest;

import com.sir.Taxe_Boisson.bean.TauxTrimestrielle;
import com.sir.Taxe_Boisson.bean.TaxeTrimestrielle;
import com.sir.Taxe_Boisson.rest.converter.TauxTrimestrielleConverter;
import com.sir.Taxe_Boisson.rest.converter.TaxeTrimestielleConverter;
import com.sir.Taxe_Boisson.rest.proxy.CategorieProxy;
import com.sir.Taxe_Boisson.rest.proxy.LocalProxy;
import com.sir.Taxe_Boisson.rest.vo.CategorieVo;
import com.sir.Taxe_Boisson.rest.vo.LocalVo;
import com.sir.Taxe_Boisson.rest.vo.TauxTrimestrielleVo;
import com.sir.Taxe_Boisson.service.TauxTrimestrielleService;
import com.sir.Taxe_Boisson.service.TaxeTrimestrielleService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
@RequestMapping({"/taxe_boisson/boissons"})
public class TestRest {
    
    @Autowired
    private TauxTrimestrielleService tauxTrimestrielleService;
    
    @Autowired
    private LocalProxy localProxy;
    
    @Autowired
    private CategorieProxy categorieProxy;
    
    @Autowired
    private TaxeTrimestrielleService taxeTrimestrielleService;
    
    @Autowired
    private TaxeTrimestielleConverter taxeTrimestrielleConverter;
    
    @Autowired
    private TauxTrimestrielleConverter tauxTrimestrielleConverter;



    @GetMapping("/dateDebut/{dateDebut}/dateFin/{dateFin}")
    public TauxTrimestrielle findByDateDebutAndDateFin(Date dateDebut, Date dateFin) {
        return tauxTrimestrielleService.findByDateDebutAndDateFin(dateDebut, dateFin);
    }
  
  
    @GetMapping("/reference/{reference}")
    public LocalVo findLocalByReference(@PathVariable String reference) {
        return localProxy.findByReference(reference);
    }

    @GetMapping("/refCategorie/{refCategorie}")
    public CategorieVo findByRefCategorie(String refCategorie) {
        return categorieProxy.findByRefCategorie(refCategorie);
    }

    @PostMapping("/createTrimestre")
    public int creerTrimestreVo(@RequestBody int trimestre, int annee) {
        return taxeTrimestrielleService.creerTrimestre(trimestre, annee);
    }

    @PostMapping("/createTauxTrim")
    public int creerTauxTrimestrielle(@RequestBody TauxTrimestrielleVo tauxTrimestrielleVo) {
        TauxTrimestrielle mytaux=tauxTrimestrielleConverter.toItem(tauxTrimestrielleVo);
        TauxTrimestrielle tauxTrimestrielle=tauxTrimestrielleService.creerTauxTrimestrielle(mytaux);
        return tauxTrimestrielleConverter.toVo(tauxTrimestrielle);
    }

//     Local myLocal = localConverter.toItem(localVo);
//        Local local = localService.creer(myLocal);
//        return localConverter.toVo(local);
//    
    @GetMapping("/refCategorie/{refCategorie}")
    public TauxTrimestrielle findByCategorieRefCategorie(@PathVariable String refCategorie) {
        return tauxTrimestrielleService.findByCategorieRefCategorie(refCategorie);
    }

    

//    @PostMapping("/createTaxeTrim")
//    public int creerTaxe(@RequestBody TaxeTrimestielleVo taxeTrimestrielleVo ) {
//      TaxeTrimestrielle taxeTrimestrielle=taxeTrimestrielleConverter.toItem(taxeTrimestrielleVo);
//      int res=taxeTrimestrielleService.creerTaxe(taxeTrimestrielle);
//      return res;
//     // return taxeTrimestrielleConverter.toVo(taxeTrimestrielleService.creerTaxe(taxeTrimestrielle));
//    }

    @GetMapping("/referenceLocal/{referenceLocal}/trimestre/{trimestre}/annee/{annee}")
    public TaxeTrimestrielle findTaxeTrimestrielleByReferenceLocalAndTrimestreAndAnnee(String referenceLocal, int trimestre, int annee) {
        return taxeTrimestrielleService.findTaxeTrimestrielleByReferenceLocalAndTrimestreAndAnnee(referenceLocal, trimestre, annee);
    }
    
    

    public TauxTrimestrielleService getTauxTrimestrielleService() {
        return tauxTrimestrielleService;
    }

    public void setTauxTrimestrielleService(TauxTrimestrielleService tauxTrimestrielleService) {
        this.tauxTrimestrielleService = tauxTrimestrielleService;
    }

    public LocalProxy getLocalProxy() {
        return localProxy;
    }

    public void setLocalProxy(LocalProxy localProxy) {
        this.localProxy = localProxy;
    }

    public TaxeTrimestrielleService getTaxeTrimestrielleService() {
        return taxeTrimestrielleService;
    }

    public void setTaxeTrimestrielleService(TaxeTrimestrielleService taxeTrimestrielleService) {
        this.taxeTrimestrielleService = taxeTrimestrielleService;
    }

    public TaxeTrimestielleConverter getTaxeTrimestrielleConverter() {
        return taxeTrimestrielleConverter;
    }

    public void setTaxeTrimestrielleConverter(TaxeTrimestielleConverter taxeTrimestrielleConverter) {
        this.taxeTrimestrielleConverter = taxeTrimestrielleConverter;
    }

    public CategorieProxy getCategorieProxy() {
        return categorieProxy;
    }

    public void setCategorieProxy(CategorieProxy categorieProxy) {
        this.categorieProxy = categorieProxy;
    }

    public TauxTrimestrielleConverter getTauxTrimestrielleConverter() {
        return tauxTrimestrielleConverter;
    }

    public void setTauxTrimestrielleConverter(TauxTrimestrielleConverter tauxTrimestrielleConverter) {
        this.tauxTrimestrielleConverter = tauxTrimestrielleConverter;
    }
    
    
    
}

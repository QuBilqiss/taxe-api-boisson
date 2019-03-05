/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.service.impl;

import com.sir.Taxe_Boisson.bean.TauxTrimestrielle;
import com.sir.Taxe_Boisson.dao.TauxTrimestrielleDao;
import com.sir.Taxe_Boisson.rest.proxy.CategorieProxy;
import com.sir.Taxe_Boisson.rest.vo.CategorieVo;
import com.sir.Taxe_Boisson.service.TauxTrimestrielleService;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class TauxTrimestrielleServiceImpl implements TauxTrimestrielleService{

    @Autowired
    private TauxTrimestrielleDao tauxTrimestrielleDao;
    
    @Autowired
    private CategorieProxy categorieProxy;
    
  
   
     @Override
    public TauxTrimestrielle findByDateDebutAndDateFin(Date dateDebut, Date dateFin) {
    return tauxTrimestrielleDao.findByDateDebutAndDateFin(dateDebut, dateFin);
    }
    
    
    
    @Override
    public int creerTauxTrimestrielle(TauxTrimestrielle tauxTrimestrielle) {
        CategorieVo categorieVo=categorieProxy.findByRefCategorie(tauxTrimestrielle.getRefCategorie());
        TauxTrimestrielle tauxTrimestre=findByDateDebutAndDateFin(tauxTrimestrielle.getDateDebut(), tauxTrimestrielle.getDateFin());
        if(categorieVo==null|| categorieVo.getRefCategorie()==null){
            return -1;
        }else if(tauxTrimestre!=null){
            return -2;
        }else {
            tauxTrimestrielleDao.save(tauxTrimestrielle);
            return 1;
        }
    }

    


    
    @Override
    public TauxTrimestrielle findByCategorieRefCategorie(String refCategorie) {
    return tauxTrimestrielleDao.findByCategorieRefCategorie(refCategorie);
    }



    public TauxTrimestrielleDao getTauxTrimestrielleDao() {
        return tauxTrimestrielleDao;
    }

    public void setTauxTrimestrielleDao(TauxTrimestrielleDao tauxTrimestrielleDao) {
        this.tauxTrimestrielleDao = tauxTrimestrielleDao;
    }

    public CategorieProxy getCategorieProxy() {
        return categorieProxy;
    }

    public void setCategorieProxy(CategorieProxy categorieProxy) {
        this.categorieProxy = categorieProxy;
    }

    
    
}

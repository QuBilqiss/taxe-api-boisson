/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.rest.converter;

import com.sir.Taxe_Boisson.bean.TauxTrimestrielle;
import com.sir.Taxe_Boisson.common.util.NumberUtil;
import com.sir.Taxe_Boisson.rest.vo.TauxTrimestrielleVo;
import ma.gov.impots.eservice.tva.common.util.DateUtil;

/**
 *
 * @author User
 */
public class TauxTrimestrielleConverter extends AbstractConverter<TauxTrimestrielle, TauxTrimestrielleVo>{

    @Override
    public TauxTrimestrielle toItem(TauxTrimestrielleVo vo) {
    if(vo==null){
        return null;
    }else{
        TauxTrimestrielle item =new TauxTrimestrielle();
        item.setDateDebut(DateUtil.parseYYYYMMDDmmhhSS(vo.getDateDebut()));
        item.setDateFin(DateUtil.parseYYYYMMDDmmhhSS(vo.getDateFin()));
        item.setPourcentage(NumberUtil.toDouble(vo.getPourcentage()));
        item.setRefCategorie(vo.getRefCategorie());
        return item;
    }
    }

    @Override
    public TauxTrimestrielleVo toVo(TauxTrimestrielle item) {
    if(item==null){
        return null;
    }else{
        TauxTrimestrielleVo vo=new TauxTrimestrielleVo();
           vo.setDateDebut(DateUtil.formatYYYYMMDDmmhhSS(item.getDateDebut()));
           vo.setDateFin(DateUtil.formatYYYYMMDDmmhhSS(item.getDateFin()));
           vo.setPourcentage(NumberUtil.doubleToString(item.getPourcentage()));
           vo.setRefCategorie(item.getRefCategorie());
           return vo;
    }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.rest.converter;

import com.sir.Taxe_Boisson.bean.TaxeTrimestrielle;
import com.sir.Taxe_Boisson.common.util.NumberUtil;
import com.sir.Taxe_Boisson.rest.vo.TaxeTrimestielleVo;
import ma.gov.impots.eservice.tva.common.util.DateUtil;
import org.springframework.stereotype.Component;

/**
 *
 * @author YOUNES
 */
@Component
public class TaxeTrimestielleConverter extends AbstractConverter<TaxeTrimestrielle, TaxeTrimestielleVo> {

    @Override
    public TaxeTrimestrielle toItem(TaxeTrimestielleVo vo) {
        if (vo == null) {
            return null;
        } else {
            TaxeTrimestrielle item = new TaxeTrimestrielle();
            item.setChiffreAffaire(NumberUtil.toDouble(vo.getChiffreAffaire()));
            item.setDatepresenatation(DateUtil.parseYYYYMMDDmmhhSS(vo.getDatepresenatation()));
            item.setAnnee(NumberUtil.toInt(vo.getAnnee()));
            item.setTrimestre(NumberUtil.toInt(vo.getTrimestre()));
            return item;

        }
    }

    @Override
    public TaxeTrimestielleVo toVo(TaxeTrimestrielle item) {
        if (item == null) {
            return null;
        } else {

            TaxeTrimestielleVo vo = new TaxeTrimestielleVo();
            vo.setChiffreAffaire(NumberUtil.doubleToString(item.getChiffreAffaire()));
            vo.setDatepresenatation(DateUtil.formatYYYYMMDDmmhhSS(item.getDatepresenatation()));
            vo.setAnnee(NumberUtil.intToString(item.getAnnee()));
            vo.setTrimestre(NumberUtil.intToString(item.getTrimestre()));
            return vo;
        }

    }

}

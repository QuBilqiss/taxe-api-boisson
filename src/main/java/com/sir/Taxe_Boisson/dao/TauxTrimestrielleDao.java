/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.dao;

import com.sir.Taxe_Boisson.bean.TauxTrimestrielle;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author User
 */
@Repository
public interface TauxTrimestrielleDao extends JpaRepository<TauxTrimestrielle, Object>{
    public TauxTrimestrielle findByDateDebutAndDateFin(Date dateDebut,Date dateFin);
    public TauxTrimestrielle findByCategorieRefCategorie(String refCategorie);

}

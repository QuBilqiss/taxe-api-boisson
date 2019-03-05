/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sir.Taxe_Boisson.rest.proxy;

import com.sir.Taxe_Boisson.rest.vo.CategorieVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author User
 */
@FeignClient(name="microservice-adresse",url="localhost:8090")
public interface CategorieProxy {
    
    @GetMapping("/taxe-api-adresse/categorie/refCategorie/{refCategorie}")
    public CategorieVo findByRefCategorie(@PathVariable String refCategorie);
    
    
}

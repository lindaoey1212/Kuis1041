/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linda.kuis1041.controller;

import com.linda.kuis1041.entity.nilai_1041;
import com.linda.kuis1041.service.nilai_1041Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


    
@RestController
@RequestMapping("/nilai_1041")
public class nilai_1041Controller {


    @Autowired
    private nilai_1041Service nilai_1041Service;

    @RequestMapping(method = RequestMethod.POST)
    public nilai_1041 insert(@RequestBody nilai_1041 nilai) {
        return nilai_1041Service.insert(nilai);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public nilai_1041 update(@RequestBody nilai_1041 nilai) {
        return nilai_1041Service.update(nilai);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{kode_nilai}")
    public boolean delete(@PathVariable("kode_nilai") Long kode_nilai) {
        return nilai_1041Service.delete(kode_nilai);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{kode_nilai}")
    public nilai_1041 getById(@PathVariable("kode_nilai") Long kode_nilai){
        return nilai_1041Service.getById(kode_nilai);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<nilai_1041> getAll(){
        return nilai_1041Service.getAll();
    }
}




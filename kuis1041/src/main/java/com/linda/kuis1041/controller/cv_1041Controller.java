/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linda.kuis1041.controller;


import com.linda.kuis1041.entity.cv_1041;
import com.linda.kuis1041.service.cv_1041Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC-5-320
 */
public class cv_1041Controller {
    
@RestController
@RequestMapping("/cv_1041")
public class beritaController {


    @Autowired
    private cv_1041Service cv_1041Service;

    @RequestMapping(method = RequestMethod.POST)
    public cv_1041 insert(@RequestBody cv_1041 cv) {
        return cv_1041Service.insert(cv);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public cv_1041 update(@RequestBody cv_1041 cv) {
        return cv_1041Service.update(cv);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{kode_cv}")
    public boolean delete(@PathVariable("kode_cv") Long kode_cv) {
        return cv_1041Service.delete(kode_cv);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{kode_cv}")
    public cv_1041 getById(@PathVariable("kode_cv") Long kode_cv){
        return cv_1041Service.getById(kode_cv);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<cv_1041> getAll(){
        return cv_1041Service.getAll();
    }
}



}

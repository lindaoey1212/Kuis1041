/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linda.kuis1041.service;

import com.linda.kuis1041.entity.cv_1041;
import com.linda.kuis1041.repo.cv_1041Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC-5-320
 */
@Service("cv_1041Service")
@Transactional
public class cv_1041Service {
 
    @Autowired
    private cv_1041Repo repo;

    public cv_1041 insert(cv_1041 cv) {
        return repo.save(cv);
    }
    
    public cv_1041 update(cv_1041 cv) {
        return repo.save(cv);
    }
    
    public boolean delete(Long kode_cv){
        repo.delete(kode_cv);
        return true;
    }
    
    public cv_1041 getById(Long kode_cv){
        return repo.findOne(kode_cv);
    }
    
    public List<cv_1041> getAll(){
        return repo.findAllcv_1041();
    }
}

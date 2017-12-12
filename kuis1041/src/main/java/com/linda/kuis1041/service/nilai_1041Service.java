/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linda.kuis1041.service;

import com.linda.kuis1041.entity.nilai_1041;
import com.linda.kuis1041.repo.nilai_1041Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("nilai_1041Service")
@Transactional
public class nilai_1041Service {
 
    @Autowired
    private nilai_1041Repo repo;

    public nilai_1041 insert(nilai_1041 nilai) {
        return repo.save(nilai);
    }
    
    public nilai_1041 update(nilai_1041 nilai) {
        return repo.save(nilai);
    }
    
    public boolean delete(Long kode_nilai){
        repo.delete(kode_nilai);
        return true;
    }
    
    public nilai_1041 getById(Long kode_nilai){
        return repo.findOne(kode_nilai);
    }
    
    public List<nilai_1041> getAll(){
        return repo.findAllnilai_1041();
    }
}



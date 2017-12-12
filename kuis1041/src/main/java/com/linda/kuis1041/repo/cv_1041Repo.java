/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linda.kuis1041.repo;


import com.linda.kuis1041.entity.cv_1041;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC-5-320
 */
public interface cv_1041Repo extends CrudRepository<cv_1041, Long> {

    @Query("select c from cv_1041 c")
    public List<cv_1041> findAllcv_1041();
    
}



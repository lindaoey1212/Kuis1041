/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linda.kuis1041.repo;

import com.linda.kuis1041.entity.nilai_1041;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface nilai_1041Repo extends CrudRepository<nilai_1041, Long> {

    @Query("select c from nilai_1041 c")
    public List<nilai_1041> findAllnilai_1041();
    
}

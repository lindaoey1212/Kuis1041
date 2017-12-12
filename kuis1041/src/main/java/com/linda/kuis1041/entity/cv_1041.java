/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linda.kuis1041.entity;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Timestamp;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cv_1041")

public class cv_1041 implements Serializable {

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

   


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 
    private Long kode_cv;
    @Column(length = 255, nullable = false)
    
    private String nama;
    private String ttl;
    private String alamat;
   
    
    @OneToMany
    @JoinColumn(name="kode_cv")
    private Set<nilai_1041> nilai_1041;

    
    /**
     * @return the kode_cv
     */
    public Long getKode_cv() {
        return kode_cv;
    }

    /**
     * @param kode_cv the kode_cv to set
     */
    public void setKode_cv(Long kode_cv) {
        this.kode_cv = kode_cv;
    }

    /**
     * @return the nama
     */
    
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the ttl
     */
    public String getTtl() {
        return ttl;
    }

    /**
     * @param ttl the ttl to set
     */
    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    
    
  
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linda.kuis1041.entity;

import java.io.Serializable;
import java.sql.Blob;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "nilai_1041")

public class nilai_1041 implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long kode_nilai;
    @Column(length = 255, nullable = false)
    private Long kode_cv;
    private String nilai;
    private String matpel;

    /**
     * @return the kode_nilai
     */
    public Long getKode_nilai() {
        return kode_nilai;
    }

    /**
     * @param kode_nilai the kode_nilai to set
     */
    public void setKode_nilai(Long kode_nilai) {
        this.kode_nilai = kode_nilai;
    }

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
     * @return the nilai
     */
    public String getNilai() {
        return nilai;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setNilai(String nilai) {
        this.nilai = nilai;
    }

    /**
     * @return the matpel
     */
    public String getMatpel() {
        return matpel;
    }

    /**
     * @param matpel the matpel to set
     */
    public void setMatpel(String matpel) {
        this.matpel = matpel;
    }

}

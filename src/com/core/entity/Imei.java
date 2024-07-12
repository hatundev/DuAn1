/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.entity;

/**
 *
 * @author hatun
 */
public class Imei {
    
    private int id;
    
    private int idChiTietSanPham;
    
    private String maImei;
    
    private int hoatDong;

    public Imei() {
    }

    public Imei(int id, int idChiTietSanPham, String maImei, int hoatDong) {
        this.id = id;
        this.idChiTietSanPham = idChiTietSanPham;
        this.maImei = maImei;
        this.hoatDong = hoatDong;
    }

    @Override
    public String toString() {
        return "Imei{" + "id=" + id + ", idChiTietSanPham=" + idChiTietSanPham + ", maImei=" + maImei + ", hoatDong=" + hoatDong + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdChiTietSanPham() {
        return idChiTietSanPham;
    }

    public void setIdChiTietSanPham(int idChiTietSanPham) {
        this.idChiTietSanPham = idChiTietSanPham;
    }

    public String getMaImei() {
        return maImei;
    }

    public void setMaImei(String maImei) {
        this.maImei = maImei;
    }

    public int getHoatDong() {
        return hoatDong;
    }

    public void setHoatDong(int hoatDong) {
        this.hoatDong = hoatDong;
    }
    
    
}

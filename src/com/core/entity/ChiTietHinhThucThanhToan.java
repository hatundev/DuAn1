/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.entity;

/**
 *
 * @author hatun
 */
public class ChiTietHinhThucThanhToan {

    private int id;

    private int idHoaDon;
    
    private int idHinhThucThanhToan;
    
    private float tongTien;

    private int hoatDong;

    public ChiTietHinhThucThanhToan() {
    }

    public ChiTietHinhThucThanhToan(int id, int idHoaDon, int idHinhThucThanhToan, float tongTien, int hoatDong) {
        this.id = id;
        this.idHoaDon = idHoaDon;
        this.idHinhThucThanhToan = idHinhThucThanhToan;
        this.tongTien = tongTien;
        this.hoatDong = hoatDong;
    }

    @Override
    public String toString() {
        return "ChiTietHinhThucThanhToan{" + "id=" + id + ", idHoaDon=" + idHoaDon + ", idHinhThucThanhToan=" + idHinhThucThanhToan + ", tongTien=" + tongTien + ", hoatDong=" + hoatDong + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public int getIdHinhThucThanhToan() {
        return idHinhThucThanhToan;
    }

    public void setIdHinhThucThanhToan(int idHinhThucThanhToan) {
        this.idHinhThucThanhToan = idHinhThucThanhToan;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public int getHoatDong() {
        return hoatDong;
    }

    public void setHoatDong(int hoatDong) {
        this.hoatDong = hoatDong;
    }

}

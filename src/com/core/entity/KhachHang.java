/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.entity;

/**
 *
 * @author mylaptop
 */
public class KhachHang {

    private int id;

    private String tenKhachHang;
    
    private String soDienThoai;

    private int hoatDong;

    public KhachHang() {
    }

    public KhachHang(int id, String tenKhachHang, String soDienThoai, int hoatDong) {
        this.id = id;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.hoatDong = hoatDong;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "id=" + id + ", tenKhachHang=" + tenKhachHang + ", soDienThoai=" + soDienThoai + ", hoatDong=" + hoatDong + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getHoatDong() {
        return hoatDong;
    }

    public void setHoatDong(int hoatDong) {
        this.hoatDong = hoatDong;
    }

    

}

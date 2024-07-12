/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.entity;

/**
 *
 * @author hatun
 */
public class HoaDonChiTiet {

    private int id;

    private int idChiTietSanPham;

    private int idHoaDon;

    private float giaBan;

    private String moTa;

    private int hoatDong;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int id, int idChiTietSanPham, int idHoaDon, float giaBan, String moTa, int hoatDong) {
        this.id = id;
        this.idChiTietSanPham = idChiTietSanPham;
        this.idHoaDon = idHoaDon;
        this.giaBan = giaBan;
        this.moTa = moTa;
        this.hoatDong = hoatDong;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "id=" + id + ", idChiTietSanPham=" + idChiTietSanPham + ", idHoaDon=" + idHoaDon + ", giaBan=" + giaBan + ", moTa=" + moTa + ", hoatDong=" + hoatDong + '}';
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

    public int getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(int idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHoatDong() {
        return hoatDong;
    }

    public void setHoatDong(int hoatDong) {
        this.hoatDong = hoatDong;
    }

}

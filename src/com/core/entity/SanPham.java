/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.entity;

/**
 *
 * @author Admin
 */
public class SanPham {

    private int id;

    private int idHeDieuHanh;

    private int id_man_hinh;

    private int id_hang;

    private int id_camera_truoc;

    private int id_camera_sau;

    private int id_chip;

    private int id_pin;

    private String tenSanPham;

    private String ngayTao;

    private String ngaySua;

    private String nguoiTao;

    private String nguoiSua;

    private int hoatDong;

    public SanPham() {
    }

    public SanPham(int id, int idHeDieuHanh, int id_man_hinh, int id_hang, int id_camera_truoc, int id_camera_sau, int id_chip, int id_pin, String tenSanPham, String ngayTao, String ngaySua, String nguoiTao, String nguoiSua, int hoatDong) {
        this.id = id;
        this.idHeDieuHanh = idHeDieuHanh;
        this.id_man_hinh = id_man_hinh;
        this.id_hang = id_hang;
        this.id_camera_truoc = id_camera_truoc;
        this.id_camera_sau = id_camera_sau;
        this.id_chip = id_chip;
        this.id_pin = id_pin;
        this.tenSanPham = tenSanPham;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.nguoiTao = nguoiTao;
        this.nguoiSua = nguoiSua;
        this.hoatDong = hoatDong;
    }

    @Override
    public String toString() {
        return "SanPham{" + "id=" + id + ", idHeDieuHanh=" + idHeDieuHanh + ", id_man_hinh=" + id_man_hinh + ", id_hang=" + id_hang + ", id_camera_truoc=" + id_camera_truoc + ", id_camera_sau=" + id_camera_sau + ", id_chip=" + id_chip + ", id_pin=" + id_pin + ", tenSanPham=" + tenSanPham + ", ngayTao=" + ngayTao + ", ngaySua=" + ngaySua + ", nguoiTao=" + nguoiTao + ", nguoiSua=" + nguoiSua + ", hoatDong=" + hoatDong + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdHeDieuHanh() {
        return idHeDieuHanh;
    }

    public void setIdHeDieuHanh(int idHeDieuHanh) {
        this.idHeDieuHanh = idHeDieuHanh;
    }

    public int getId_man_hinh() {
        return id_man_hinh;
    }

    public void setId_man_hinh(int id_man_hinh) {
        this.id_man_hinh = id_man_hinh;
    }

    public int getId_hang() {
        return id_hang;
    }

    public void setId_hang(int id_hang) {
        this.id_hang = id_hang;
    }

    public int getId_camera_truoc() {
        return id_camera_truoc;
    }

    public void setId_camera_truoc(int id_camera_truoc) {
        this.id_camera_truoc = id_camera_truoc;
    }

    public int getId_camera_sau() {
        return id_camera_sau;
    }

    public void setId_camera_sau(int id_camera_sau) {
        this.id_camera_sau = id_camera_sau;
    }

    public int getId_chip() {
        return id_chip;
    }

    public void setId_chip(int id_chip) {
        this.id_chip = id_chip;
    }

    public int getId_pin() {
        return id_pin;
    }

    public void setId_pin(int id_pin) {
        this.id_pin = id_pin;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(String ngaySua) {
        this.ngaySua = ngaySua;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getNguoiSua() {
        return nguoiSua;
    }

    public void setNguoiSua(String nguoiSua) {
        this.nguoiSua = nguoiSua;
    }

    public int getHoatDong() {
        return hoatDong;
    }

    public void setHoatDong(int hoatDong) {
        this.hoatDong = hoatDong;
    }

}

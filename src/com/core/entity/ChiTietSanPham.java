/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.entity;

/**
 *
 * @author hatun
 */
public class ChiTietSanPham {

    private int id;

    private int idSanPham;

    private int idRam;

    private int idBoNho;

    private int idMauSac;

    private String tenSanPhamChiTiet;

    private float giaBan;

    private int yeuThich;

    private String ngayTao;

    private String ngaySua;

    private String nguoiTao;

    private String nguoiSua;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(int id, int idSanPham, int idRam, int idBoNho, int idMauSac, String tenSanPhamChiTiet, float giaBan, int yeuThich, String ngayTao, String ngaySua, String nguoiTao, String nguoiSua) {
        this.id = id;
        this.idSanPham = idSanPham;
        this.idRam = idRam;
        this.idBoNho = idBoNho;
        this.idMauSac = idMauSac;
        this.tenSanPhamChiTiet = tenSanPhamChiTiet;
        this.giaBan = giaBan;
        this.yeuThich = yeuThich;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.nguoiTao = nguoiTao;
        this.nguoiSua = nguoiSua;
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "id=" + id + ", idSanPham=" + idSanPham + ", idRam=" + idRam + ", idBoNho=" + idBoNho + ", idMauSac=" + idMauSac + ", tenSanPhamChiTiet=" + tenSanPhamChiTiet + ", giaBan=" + giaBan + ", yeuThich=" + yeuThich + ", ngayTao=" + ngayTao + ", ngaySua=" + ngaySua + ", nguoiTao=" + nguoiTao + ", nguoiSua=" + nguoiSua + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public int getIdRam() {
        return idRam;
    }

    public void setIdRam(int idRam) {
        this.idRam = idRam;
    }

    public int getIdBoNho() {
        return idBoNho;
    }

    public void setIdBoNho(int idBoNho) {
        this.idBoNho = idBoNho;
    }

    public int getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(int idMauSac) {
        this.idMauSac = idMauSac;
    }

    public String getTenSanPhamChiTiet() {
        return tenSanPhamChiTiet;
    }

    public void setTenSanPhamChiTiet(String tenSanPhamChiTiet) {
        this.tenSanPhamChiTiet = tenSanPhamChiTiet;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public int getYeuThich() {
        return yeuThich;
    }

    public void setYeuThich(int yeuThich) {
        this.yeuThich = yeuThich;
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

}

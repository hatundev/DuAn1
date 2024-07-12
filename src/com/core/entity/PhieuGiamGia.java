/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.entity;

/**
 *
 * @author hatun
 */
public class PhieuGiamGia {

    private int id;

    private String maVoucher;

    private String tenVoucher;

    private int soLuong;

    private float giaTriToiThieuApDung;

    private int phanTramGiam;

    private float soTienDuocGiamToiDa;

    private String ngayBatDau;

    private String ngayKetThuc;

    private String moTa;

    private String ngayTao;

    private String ngaySua;

    private String nguoiTao;

    private String nguoiSua;

    private int hoatDong;

    public PhieuGiamGia() {
    }

    public PhieuGiamGia(int id, String maVoucher, String tenVoucher, int soLuong, float giaTriToiThieuApDung, int phanTramGiam, float soTienDuocGiamToiDa, String ngayBatDau, String ngayKetThuc, String moTa, String ngayTao, String ngaySua, String nguoiTao, String nguoiSua, int hoatDong) {
        this.id = id;
        this.maVoucher = maVoucher;
        this.tenVoucher = tenVoucher;
        this.soLuong = soLuong;
        this.giaTriToiThieuApDung = giaTriToiThieuApDung;
        this.phanTramGiam = phanTramGiam;
        this.soTienDuocGiamToiDa = soTienDuocGiamToiDa;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.moTa = moTa;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.nguoiTao = nguoiTao;
        this.nguoiSua = nguoiSua;
        this.hoatDong = hoatDong;
    }

    @Override
    public String toString() {
        return "PhieuGiamGia{" + "id=" + id + ", maVoucher=" + maVoucher + ", tenVoucher=" + tenVoucher + ", soLuong=" + soLuong + ", giaTriToiThieuApDung=" + giaTriToiThieuApDung + ", phanTramGiam=" + phanTramGiam + ", soTienDuocGiamToiDa=" + soTienDuocGiamToiDa + ", ngayBatDau=" + ngayBatDau + ", ngayKetThuc=" + ngayKetThuc + ", moTa=" + moTa + ", ngayTao=" + ngayTao + ", ngaySua=" + ngaySua + ", nguoiTao=" + nguoiTao + ", nguoiSua=" + nguoiSua + ", hoatDong=" + hoatDong + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaVoucher() {
        return maVoucher;
    }

    public void setMaVoucher(String maVoucher) {
        this.maVoucher = maVoucher;
    }

    public String getTenVoucher() {
        return tenVoucher;
    }

    public void setTenVoucher(String tenVoucher) {
        this.tenVoucher = tenVoucher;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGiaTriToiThieuApDung() {
        return giaTriToiThieuApDung;
    }

    public void setGiaTriToiThieuApDung(float giaTriToiThieuApDung) {
        this.giaTriToiThieuApDung = giaTriToiThieuApDung;
    }

    public int getPhanTramGiam() {
        return phanTramGiam;
    }

    public void setPhanTramGiam(int phanTramGiam) {
        this.phanTramGiam = phanTramGiam;
    }

    public float getSoTienDuocGiamToiDa() {
        return soTienDuocGiamToiDa;
    }

    public void setSoTienDuocGiamToiDa(float soTienDuocGiamToiDa) {
        this.soTienDuocGiamToiDa = soTienDuocGiamToiDa;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
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

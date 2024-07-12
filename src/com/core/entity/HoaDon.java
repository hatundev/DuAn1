/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.entity;

/**
 *
 * @author hatun
 */
public class HoaDon {

    private int id;

    private int idKhachHang;

    private int idNhanVien;

    private int idPhieuGiamGia;

    private String ngayTao;

    private float tongTien;

    private float tongTienSauGiam;

    private String tenKhachHang;

    private String soDienThoai;

    private String ngaySua;

    private String nguoiTao;

    private String nguoiSua;

    private int hoatDong;

    public HoaDon() {
    }

    public HoaDon(int id, int idKhachHang, int idNhanVien, int idPhieuGiamGia, String ngayTao, float tongTien, float tongTienSauGiam, String tenKhachHang, String soDienThoai, String ngaySua, String nguoiTao, String nguoiSua, int hoatDong) {
        this.id = id;
        this.idKhachHang = idKhachHang;
        this.idNhanVien = idNhanVien;
        this.idPhieuGiamGia = idPhieuGiamGia;
        this.ngayTao = ngayTao;
        this.tongTien = tongTien;
        this.tongTienSauGiam = tongTienSauGiam;
        this.tenKhachHang = tenKhachHang;
        this.soDienThoai = soDienThoai;
        this.ngaySua = ngaySua;
        this.nguoiTao = nguoiTao;
        this.nguoiSua = nguoiSua;
        this.hoatDong = hoatDong;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", idKhachHang=" + idKhachHang + ", idNhanVien=" + idNhanVien + ", idPhieuGiamGia=" + idPhieuGiamGia + ", ngayTao=" + ngayTao + ", tongTien=" + tongTien + ", tongTienSauGiam=" + tongTienSauGiam + ", tenKhachHang=" + tenKhachHang + ", soDienThoai=" + soDienThoai + ", ngaySua=" + ngaySua + ", nguoiTao=" + nguoiTao + ", nguoiSua=" + nguoiSua + ", hoatDong=" + hoatDong + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public int getIdPhieuGiamGia() {
        return idPhieuGiamGia;
    }

    public void setIdPhieuGiamGia(int idPhieuGiamGia) {
        this.idPhieuGiamGia = idPhieuGiamGia;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public float getTongTienSauGiam() {
        return tongTienSauGiam;
    }

    public void setTongTienSauGiam(float tongTienSauGiam) {
        this.tongTienSauGiam = tongTienSauGiam;
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

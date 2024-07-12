/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.model.response;

/**
 *
 * @author hatun
 */
public class SanPhamResponse {

    private int stt;
    private String tenSanPham;
    private String tenHang;
    private String ram;
    private String boNho;
    private String mauSac;
    private int soLuong;
    private float gia;

    public SanPhamResponse() {
    }

    public SanPhamResponse(int stt, String tenSanPham, String tenHang, String ram, String boNho, String mauSac, int soLuong, float gia) {
        this.stt = stt;
        this.tenSanPham = tenSanPham;
        this.tenHang = tenHang;
        this.ram = ram;
        this.boNho = boNho;
        this.mauSac = mauSac;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "SanPhamResponse{" +
                "stt=" + stt +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", ram='" + ram + '\'' +
                ", boNho='" + boNho + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", soLuong=" + soLuong +
                ", gia=" + gia +
                '}';
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getBoNho() {
        return boNho;
    }

    public void setBoNho(String boNho) {
        this.boNho = boNho;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
}

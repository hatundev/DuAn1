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
    private String maSanPham;
    private String tenSanPham;
    private String tenHang;
    private String serial;
    private String imei;
    private String tinhTrang;
    private float giaBan;

    public SanPhamResponse() {
    }

    public SanPhamResponse(int stt, String maSanPham, String tenSanPham, String tenHang, String serial, String imei, String tinhTrang, float giaBan) {
        this.stt = stt;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.tenHang = tenHang;
        this.serial = serial;
        this.imei = imei;
        this.tinhTrang = tinhTrang;
        this.giaBan = giaBan;
    }
    
    

    @Override
    public String toString() {
        return "SanPhamResponse{" + "stt=" + stt + ", maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", tenHang=" + tenHang + ", serial=" + serial + ", imei=" + imei + ", tinhTrang=" + tinhTrang + ", giaBan=" + giaBan + '}';
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
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

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public Object[] towRowTable() {
        return new Object[]{
            stt, maSanPham, tenSanPham, tenHang, serial, imei, tinhTrang, giaBan
        };
    }
}

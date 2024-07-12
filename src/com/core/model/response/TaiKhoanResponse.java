/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.model.response;

/**
 *
 * @author hatun
 */
public class TaiKhoanResponse {

    private String username;

    private String password;

    private String tenNhanVien;

    private String tenChucVu;

    public TaiKhoanResponse() {
    }

    public TaiKhoanResponse(String username, String password, String tenNhanVien, String tenChucVu) {
        this.username = username;
        this.password = password;
        this.tenNhanVien = tenNhanVien;
        this.tenChucVu = tenChucVu;
    }

    @Override
    public String toString() {
        return "TaiKhoanResponse{" + "username=" + username + ", password=" + password + ", tenNhanVien=" + tenNhanVien + ", tenChucVu=" + tenChucVu + '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }

}

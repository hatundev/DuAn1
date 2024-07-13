package com.core.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
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

}

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
public class NhanVien {

    private int id;

    private String maNhanVien;

    private String tenNhanVien;

    private String diaChi;

    private String soDienThoai;

    private String cccd;

    private String matKhau;

    private int chucVu;

    private String ngayTao;

    private String ngaySua;

    private String nguoiTao;

    private String nguoiSua;

    private int hoatDong;

}

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

}

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
public class SanPham {

    private int id;

    private int idHeDieuHanh;

    private int idManHinh;

    private int idHang;

    private int idCameraTruoc;

    private int idCameraSau;

    private int idChip;

    private int idPin;

    private String tenSanPham;

    private String ngayTao;

    private String ngaySua;

    private String nguoiTao;

    private String nguoiSua;

    private int hoatDong;

}

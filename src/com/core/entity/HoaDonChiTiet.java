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
public class HoaDonChiTiet {

    private int id;

    private int idChiTietSanPham;

    private int idHoaDon;

    private float giaBan;

    private String moTa;

    private int hoatDong;

}

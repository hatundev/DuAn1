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
public class ChiTietHinhThucThanhToan {

    private int id;

    private int idHoaDon;

    private int idHinhThucThanhToan;

    private float tongTien;

    private int hoatDong;

}

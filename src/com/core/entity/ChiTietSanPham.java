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
public class ChiTietSanPham {

    private int id;

    private int idSanPham;

    private int idRam;

    private int idBoNho;

    private int idMauSac;

    private String tenSanPhamChiTiet;

    private float giaBan;

    private int yeuThich;

    private String ngayTao;

    private String ngaySua;

    private String nguoiTao;

    private String nguoiSua;

}

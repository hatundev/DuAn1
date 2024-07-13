package com.core.model.response;

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
public class SanPhamResponse {

    private int stt;
    
    private String tenSanPham;
    
    private String tenHang;
    
    private String ram;
    
    private String boNho;
    
    private String mauSac;
    
    private int soLuong;
    
    private float gia;

}

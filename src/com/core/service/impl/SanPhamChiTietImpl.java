/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.service.impl;

import com.core.entity.Chip;
import com.core.model.response.SanPhamResponse;
import com.core.repository.SanPhamChiTietRepository;
import com.core.service.ThuocTinhService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hatun
 */
public class SanPhamChiTietImpl implements ThuocTinhService {

    private SanPhamChiTietRepository repo = new SanPhamChiTietRepository();

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public List<SanPhamResponse> findAll(){
        return repo.findAll();
    }

}

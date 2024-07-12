/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.core.repository;

import com.core.model.response.SanPhamResponse;
import com.core.tool.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hatun
 */
public class ChiTietSanPhamRepository {

    public List<SanPhamResponse> findAll() {
        List<SanPhamResponse> list = new ArrayList<>();
        String sql = "SELECT\n"
                + "	ROW_NUMBER() OVER(ORDER BY ctsp.id  DESC) AS 'index',\n"
                + "	ctsp.masanphamchitiet,\n"
                + "	sp.tensanpham ,\n"
                + "	h.tenhang,\n"
                + "	ctsp.serial,\n"
                + "	ctsp.imei1,\n"
                + "	ttsp.tentinhtrang,\n"
                + "	ctsp.giaban\n"
                + "	\n"
                + "FROM\n"
                + "	ChiTietSanPham ctsp\n"
                + "JOIN SanPham sp ON\n"
                + "	ctsp.masanpham = sp.masanpham\n"
                + "JOIN Hang h ON\n"
                + "	sp.mahang = h.id \n"
                + "JOIN TinhTrangSanPham ttsp ON\n"
                + "	ctsp.matinhtrang = ttsp.id ";

        try {
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPhamResponse sp = new SanPhamResponse();
                sp.setStt(rs.getInt("index"));
                sp.setMaSanPham(rs.getString("masanphamchitiet"));
                sp.setTenSanPham(rs.getString("tensanpham"));
                sp.setTenHang(rs.getString("tenhang"));
                sp.setSerial(rs.getString("serial"));
                sp.setImei(rs.getString("imei1"));
                sp.setTinhTrang(rs.getString("tentinhtrang"));
                sp.setGiaBan(rs.getFloat("giaban"));
                list.add(sp);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}

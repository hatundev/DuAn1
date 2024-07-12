/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Admin
 */
public class CameraSau {

    private int id;
    private String ten;
    private int hoatDong;

    public CameraSau() {
    }

    public CameraSau(int id, String ten, int hoatDong) {
        this.id = id;
        this.ten = ten;
        this.hoatDong = hoatDong;
    }

    @Override
    public String toString() {
        return "CameraSau{" + "id=" + id + ", ten=" + ten + ", hoatDong=" + hoatDong + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHoatDong() {
        return hoatDong;
    }

    public void setHoatDong(int hoatDong) {
        this.hoatDong = hoatDong;
    }

}

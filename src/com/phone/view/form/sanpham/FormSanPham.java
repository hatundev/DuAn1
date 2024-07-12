package com.phone.view.form.sanpham;

import com.core.entity.Hang;
import com.core.entity.Ram;
import com.core.model.response.SanPhamResponse;
import com.core.service.impl.SanPhamChiTietImpl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class FormSanPham extends javax.swing.JPanel {

    private DefaultTableModel defaultTableModel = new DefaultTableModel();
    private SanPhamChiTietImpl sanPhamChiTietImpl = new SanPhamChiTietImpl();
    private int page =1;
    private List<SanPhamResponse> listTable = new ArrayList<>();

    public FormSanPham() {
        initComponents();
        setOpaque(false);
        init();
    }

    public void init() {
        defaultTableModel = (DefaultTableModel) tbSanPham.getModel();
//        //fill table
        
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        listTable.add(new SanPhamResponse(1,"SP01","Sản phẩm","Tùng","12345","12345","1",10000));
        fillTable(listTable);
//        stt, maSanPham, tenSanPham, tenHang, serial, imei, tinhTrang, giaBan
//        
//        //fill combobox
//       // List<Hang> listHang= hangServiceImpl.findAll();
//        for (Hang hang : listHang) {
//            if(hang.getHoatDong()==1){
//               // cbHang.addItem(hang.getTenHang());
//            }
//        }
//        cbHang.setSelectedIndex(-1);
//        
//       // List<Ram> listRam= ramServiceImpl.findAll();
//        for (Ram ram : listRam) {
//            if(ram.getHoatDong()==1){
//               // cbRam.addItem(ram.getDungLuong());
//            }
//        }
//        cbRam.setSelectedIndex(-1);
    }

    public void fillTable(List<SanPhamResponse> list) {
        defaultTableModel.setRowCount(0);
//        for (SanPhamResponse sanPhamResponse : list) {
//            defaultTableModel.addRow(sanPhamResponse.towRowTable());
//        }
          for (int i = 5*(page-1); i < 5*page; i++) {
            defaultTableModel.addRow(list.get(i).towRowTable());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        txtTimKiem = new com.phone.custome_ui.swing.TextField();
        btnClear = new com.phone.custome_ui.swing.Button2();
        cbHang = new com.phone.custome_ui.swing.Combobox();
        cbRam = new com.phone.custome_ui.swing.Combobox();
        cbChip = new com.phone.custome_ui.swing.Combobox();
        cbMau = new com.phone.custome_ui.swing.Combobox();
        cbManHinh = new com.phone.custome_ui.swing.Combobox();
        cbGia = new com.phone.custome_ui.swing.Combobox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        button21 = new com.phone.custome_ui.swing.Button2();
        button22 = new com.phone.custome_ui.swing.Button2();
        jLabel2 = new javax.swing.JLabel();
        button23 = new com.phone.custome_ui.swing.Button2();
        button24 = new com.phone.custome_ui.swing.Button2();

        txtTimKiem.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTimKiem.setLabelText("Tìm kiếm");

        btnClear.setText("Làm mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        cbHang.setLabeText("Hãng");

        cbRam.setLabeText("Ram");

        cbChip.setLabeText("Chip");

        cbMau.setLabeText("Màu");

        cbManHinh.setLabeText("Màn hình");

        cbGia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1", "Item2", "Item3", "Item4", "Item5", "Item1", "Item2", "Item3", "Item4", "Item5", " " }));
        cbGia.setSelectedIndex(-1);
        cbGia.setLabeText("Giá");

        tbSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã sản phẩm", "Tên sản phẩm", "Hãng", "Serial", "Imei", "Tình trạng", "Giá bán"
            }
        ));
        tbSanPham.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbSanPham.setRowHeight(50);
        jScrollPane1.setViewportView(tbSanPham);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone/resources/icons/search.png"))); // NOI18N

        button21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone/resources/icons/angle-double-left.png"))); // NOI18N

        button22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone/resources/icons/angle-left.png"))); // NOI18N
        button22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button22ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("1");

        button23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone/resources/icons/angle-right.png"))); // NOI18N
        button23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button23ActionPerformed(evt);
            }
        });

        button24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/phone/resources/icons/angle-double-right.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbMau, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(47, 47, 47)
                                        .addComponent(cbManHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(cbGia, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbHang, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(cbRam, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbChip, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(584, 584, 584)
                        .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15)
                        .addComponent(button23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(button24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1447, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1))
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbChip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbManHinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 237, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void button23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button23ActionPerformed
        // TODO add your handling code here:
        page = page +1;
        fillTable(listTable);
    }//GEN-LAST:event_button23ActionPerformed

    private void button22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button22ActionPerformed
        // TODO add your handling code here:
        page = page -1;
        fillTable(listTable);
    }//GEN-LAST:event_button22ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.phone.custome_ui.swing.Button2 btnClear;
    private com.phone.custome_ui.swing.Button2 button21;
    private com.phone.custome_ui.swing.Button2 button22;
    private com.phone.custome_ui.swing.Button2 button23;
    private com.phone.custome_ui.swing.Button2 button24;
    private com.phone.custome_ui.swing.Combobox cbChip;
    private com.phone.custome_ui.swing.Combobox cbGia;
    private com.phone.custome_ui.swing.Combobox cbHang;
    private com.phone.custome_ui.swing.Combobox cbManHinh;
    private com.phone.custome_ui.swing.Combobox cbMau;
    private com.phone.custome_ui.swing.Combobox cbRam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbSanPham;
    private com.phone.custome_ui.swing.TextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}

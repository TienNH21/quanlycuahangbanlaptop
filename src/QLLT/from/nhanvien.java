/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLLT.from;

import QLLT.from.fromcon.suaNV;
import QLLT.from.fromcon.themNV;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vinh
 */
public class nhanvien extends javax.swing.JPanel {
Connection cn;
    DefaultTableModel model;
     public static String ma,ten,ngayinh,diachi,sdt,trangthai;
    /**
     * Creates new form nhanvien
     */
    public nhanvien() {
        initComponents();
         String heder[] = {"Manv", "tên nv", "ngày sinh", "địa chỉ", "sdt", "trạng thái"};
        String data[][] = null;
        model = new DefaultTableModel(data, heder);
        table.setModel(model);
        cn = helper.hepper.ketnoi("qllaptop4");
        System.out.println("kết nối thành công");
        jButton3.setEnabled(false);
        jButton1.setEnabled(false);
        loaddatatable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        bltthem = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "manv", "tennv", "ngay sinh", "dia chi", "sdt", "trang thai"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        jButton3.setText("sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        jButton1.setText("xóa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        bltthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        bltthem.setText("thêm");
        bltthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bltthemActionPerformed(evt);
            }
        });

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("tìm kiếm"));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_replay_30px.png"))); // NOI18N
        jButton7.setText("làm mới");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bltthem)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(bltthem))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(jDesktopPane1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  try {

            cn = helper.hepper.ketnoi("qllaptop4");

            String sql = "DELETE dbo.nhanvien \n" +
"WHERE manv LIKE ?";

            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, table.getValueAt(table.getSelectedRow(), 0).toString());

            int hoi = JOptionPane.showConfirmDialog(this, "xóa nhân viên");
            if (hoi == JOptionPane.YES_OPTION) {

                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "xóa thành công");
                model.setRowCount(0);
                loaddatatable();

            } else {
                JOptionPane.showMessageDialog(this, "chưa xóa");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "lỗi xóa sp");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bltthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bltthemActionPerformed
        // TODO add your handling code here:
        themNV themnv= new themNV();
        jDesktopPane1.add(themnv);
        themnv.setVisible(true);

    }//GEN-LAST:event_bltthemActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        suaNV snv= new suaNV();
        jDesktopPane1.add(snv);
        snv.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
         int row = table.getSelectedRow();
        ma=table.getValueAt(row, 0).toString();
        ten=table.getValueAt(row, 1).toString();
        ngayinh=table.getValueAt(row, 2).toString();
        diachi=table.getValueAt(row, 3).toString();
        sdt=table.getValueAt(row, 4).toString();
        trangthai=table.getValueAt(row, 5).toString();
        jButton3.setEnabled(true);
        jButton1.setEnabled(true);
    }//GEN-LAST:event_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bltthem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

      private void loaddatatable() {
        try {
            String sql = "SELECT * FROM nhanvien";
            Statement stm = cn.createStatement();
            //khai báo re sun sét nhận dữ liệu khi thực thi truy vấn select
            ResultSet rs = stm.executeQuery(sql);
            // duyệt rs đổ dữ liệu table
            while (rs.next()) {
                Vector nv = new Vector();
                nv.add(rs.getString(1));
                nv.add(rs.getString(2));
                nv.add(rs.getString(3));
                nv.add(rs.getString(4));
                nv.add(rs.getString(5));
                nv.add(rs.getString(6));
              
                model.addRow(nv);
            }
            table.setModel(model);
            cn.close();
            rs.close();
            stm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);

        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import Model.SinhVienDiem;
import Service.QuanLySinhVienDiemService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QuanLyDiemSinhVien extends javax.swing.JFrame {

    private QuanLySinhVienDiemService QuanLyDiemSVService = new QuanLySinhVienDiemService();

    /**
     * Creates new form QuanLyDiemSinhVien
     */
    public QuanLyDiemSinhVien() {
        initComponents();
        this.setLocationRelativeTo(null);
        Icon save = new ImageIcon("save.png");
        Icon delete = new ImageIcon("delete.png");
        Icon newe = new ImageIcon("new.png");
        Icon updated = new ImageIcon("updated.png");
        Icon dau = new ImageIcon("dau.png");
        Icon tien = new ImageIcon("tien.png");
        Icon lui = new ImageIcon("lui.png");
        Icon cuoi = new ImageIcon("cuoi.png");
        butsave.setIcon(save);
        butdelete.setIcon(delete);
        butnew.setIcon(newe);
        butupdate.setIcon(updated);
        butdau.setIcon(dau);
        buttien.setIcon(tien);
        butlui.setIcon(lui);
        butcuoi.setIcon(cuoi);
        try {
            this.QuanLyDiemSVService.LoadGRADE();
            this.FilltoData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    int index;

    public void display() {
        ArrayList<SinhVienDiem> a = this.QuanLyDiemSVService.getlist();
        SinhVienDiem svd = a.get(index);
        int ind = a.indexOf(svd);
        this.lblten.setText(svd.getTenSV());
        this.txtMaSV.setText(svd.getMaSV());
        this.txtTinhoc.setText(svd.getTHoc() + "");
        this.txtTienganh.setText(svd.getTAnh() + "");
        this.txtGDTC.setText(svd.getGduc() + "");
        this.txtdiemtb.setText(svd.DiemTB() + "");
        this.table.setRowSelectionInterval(ind, ind);
    }

    public void FilltoData() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    DefaultTableModel bang = (DefaultTableModel) table.getModel();
                    QuanLyDiemSVService.LoadGRADE();
                    bang.setRowCount(0);
                    ArrayList<SinhVienDiem> list = QuanLyDiemSVService.getlist();
                    for (SinhVienDiem svd : list) {
                        bang.addRow(new Object[]{svd.getMaSV(), svd.getTenSV(), svd.getTAnh(), svd.getTHoc(), svd.getGduc(), svd.DiemTB()});
                    }
                } catch (Exception e) {
                }
            }
        }).start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblMaSV1 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        butsearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblHoten = new javax.swing.JLabel();
        lblMaSV2 = new javax.swing.JLabel();
        lblTienganh = new javax.swing.JLabel();
        lblTinhoc = new javax.swing.JLabel();
        lblGDTC = new javax.swing.JLabel();
        lblHotentxt = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtTienganh = new javax.swing.JTextField();
        txtTinhoc = new javax.swing.JTextField();
        txtGDTC = new javax.swing.JTextField();
        lblDiemTB = new javax.swing.JLabel();
        txtdiemtb = new javax.swing.JLabel();
        lblten = new javax.swing.JLabel();
        butnew = new javax.swing.JButton();
        butsave = new javax.swing.JButton();
        butupdate = new javax.swing.JButton();
        butdelete = new javax.swing.JButton();
        butdau = new javax.swing.JButton();
        buttien = new javax.swing.JButton();
        butlui = new javax.swing.JButton();
        butcuoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Quản Lý Điểm Sinh Viên");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm kiếm\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lblMaSV1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMaSV1.setText("Mã SV:");

        butsearch.setText("Search");
        butsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblMaSV1)
                .addGap(18, 18, 18)
                .addComponent(txtsearch, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(butsearch)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSV1)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butsearch))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblHoten.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblHoten.setText("Họ tên SV:");

        lblMaSV2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMaSV2.setText("Mã SV:");

        lblTienganh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTienganh.setText("Tiếng anh:");

        lblTinhoc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblTinhoc.setText("Tin học:");

        lblGDTC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGDTC.setText("Giáo dục TC:");

        lblDiemTB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDiemTB.setText("Điểm TB:");

        txtdiemtb.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtdiemtb.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMaSV2)
                            .addComponent(lblHoten)
                            .addComponent(lblTienganh)
                            .addComponent(lblTinhoc)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblGDTC)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTinhoc, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(txtGDTC))
                        .addGap(199, 199, 199))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMaSV)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTienganh, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                .addGap(52, 52, 52))
                            .addComponent(lblten, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHotentxt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtdiemtb, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDiemTB))
                                .addGap(58, 58, 58))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblHoten)
                            .addComponent(lblHotentxt, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)))
                    .addComponent(lblten, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMaSV2)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTienganh)
                    .addComponent(txtTienganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDiemTB))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTinhoc)
                            .addComponent(txtTinhoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGDTC)
                            .addComponent(txtGDTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtdiemtb, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        butnew.setText("New");
        butnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butnewActionPerformed(evt);
            }
        });

        butsave.setText("Save");
        butsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butsaveActionPerformed(evt);
            }
        });

        butupdate.setText("Update");
        butupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butupdateActionPerformed(evt);
            }
        });

        butdelete.setText("Delete");
        butdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butdeleteActionPerformed(evt);
            }
        });

        butdau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butdauActionPerformed(evt);
            }
        });

        buttien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttienActionPerformed(evt);
            }
        });

        butlui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butluiActionPerformed(evt);
            }
        });

        butcuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butcuoiActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Họ Tên", "Mã SV", "Tiếng Anh", "Tin Học", "Giáo Dục TC", "Điểm TB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel2.setText("Sinh vien có điểm cao nhất");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(butnew, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(butsave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(butupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(butdelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(butdau)
                        .addGap(18, 18, 18)
                        .addComponent(buttien)
                        .addGap(18, 18, 18)
                        .addComponent(butlui)
                        .addGap(18, 18, 18)
                        .addComponent(butcuoi))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(butnew)
                        .addGap(18, 18, 18)
                        .addComponent(butsave)
                        .addGap(18, 18, 18)
                        .addComponent(butupdate)
                        .addGap(18, 18, 18)
                        .addComponent(butdelete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(butlui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butcuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butdau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsearchActionPerformed
        try {
            SinhVienDiem svd = this.QuanLyDiemSVService.findMaSV(txtsearch.getText());
//            this.lblten.setText(svd.getTenSV());
//            this.txtMaSV.setText(svd.getMaSV());
            this.lblten.setText(svd.getTenSV());
            this.txtMaSV.setText(svd.getMaSV());
            this.txtTinhoc.setText(svd.getTHoc() + "");
            this.txtTienganh.setText(svd.getTAnh() + "");
            this.txtGDTC.setText(svd.getGduc() + "");
            this.txtdiemtb.setText(svd.DiemTB() + "");
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_butsearchActionPerformed

    private void butsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butsaveActionPerformed
        // TODO add your handling code here:
        SinhVienDiem svd = this.getFormData();
        if (svd == null) {
            return;
        }
        try {
            this.QuanLyDiemSVService.insert(svd);
            this.FilltoData();
            this.New();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butsaveActionPerformed

    private void butupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butupdateActionPerformed
        // TODO add your handling code here:
        SinhVienDiem svd = this.getFormData();
        if (svd == null) {
            return;
        }
        try {
            this.QuanLyDiemSVService.update(svd);
            this.FilltoData();
            this.New();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_butupdateActionPerformed

    private void butdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butdeleteActionPerformed
        try {
            // TODO add your handling code here:
            this.QuanLyDiemSVService.delete(txtMaSV.getText());
            this.FilltoData();
            this.New();
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_butdeleteActionPerformed
    private int FindMa(SinhVienDiem svd) {
        ArrayList<SinhVienDiem> a = this.QuanLyDiemSVService.getlist();
        for (int i = 0; i < a.size(); i++) {
            if (svd.getMaSV().equals(a.get(i).getMaSV())) {
                return i;
            }
        }
        return -1;
    }
    private void butdauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butdauActionPerformed
        // TODO add your handling code here:
        index = 0;
        display();
    }//GEN-LAST:event_butdauActionPerformed

    private void buttienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttienActionPerformed
        // TODO add your handling code here:
        if (index >= 0) {
            index++;
            display();
        }
    }//GEN-LAST:event_buttienActionPerformed

    private void butluiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butluiActionPerformed
        // TODO add your handling code here:
        ArrayList<SinhVienDiem> a = this.QuanLyDiemSVService.getlist();
        if (index <= a.size() - 1) {
            index--;
            display();
        }
    }//GEN-LAST:event_butluiActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int row = table.getSelectedRow();
        if (row >= 0) {
            index = row;
            display();
        }
    }//GEN-LAST:event_tableMouseClicked

    private void butnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butnewActionPerformed
        // TODO add your handling code here:
        this.New();
    }//GEN-LAST:event_butnewActionPerformed

    private void butcuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butcuoiActionPerformed
        // TODO add your handling code here:
        ArrayList<SinhVienDiem> a = this.QuanLyDiemSVService.getlist();
        index = a.size() - 1;
        display();
    }//GEN-LAST:event_butcuoiActionPerformed

    private SinhVienDiem getFormData() {
        String tenSV = this.lblten.getText();
        String maSV = this.txtMaSV.getText();
        String Tanh = this.txtTienganh.getText();
        String Thoc = this.txtTinhoc.getText();
        String Gduc = this.txtGDTC.getText();
        double TAnh = -1;
        double THoc = -1;
        double GDuc = -1;
        if (maSV.length() == 0
                || Tanh.length() == 0
                || Thoc.length() == 0
                || Gduc.length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống.");
            return null;
        }
        try {
            TAnh = Double.parseDouble(Tanh);
            if (TAnh < 0) {
                JOptionPane.showMessageDialog(this, "Điểm tiếng anh không được âm");
                return null;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Điểm tiếng anh phải là số");
            return null;
        }

        try {
            THoc = Double.parseDouble(Thoc);
            if (THoc < 0) {
                JOptionPane.showMessageDialog(this, "Điểm tin học không được âm");
                return null;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Điểm tin học phải là số");
            return null;
        }

        try {
            GDuc = Double.parseDouble(Gduc);
            if (GDuc < 0) {
                JOptionPane.showMessageDialog(this, "Điểm giáo dục không được âm");
                return null;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Điểm giáo dục phải là số");
            return null;
        }

        return new SinhVienDiem(maSV, tenSV, TAnh, THoc, GDuc);
    }

    private void New() {
        this.lblten.setText("");
        this.txtMaSV.setText("");
        this.txtTinhoc.setText("");
        this.txtTienganh.setText("");
        this.txtGDTC.setText("");
        this.txtdiemtb.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyDiemSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butcuoi;
    private javax.swing.JButton butdau;
    private javax.swing.JButton butdelete;
    private javax.swing.JButton butlui;
    private javax.swing.JButton butnew;
    private javax.swing.JButton butsave;
    private javax.swing.JButton butsearch;
    private javax.swing.JButton buttien;
    private javax.swing.JButton butupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiemTB;
    private javax.swing.JLabel lblGDTC;
    private javax.swing.JLabel lblHoten;
    private javax.swing.JLabel lblHotentxt;
    private javax.swing.JLabel lblMaSV1;
    private javax.swing.JLabel lblMaSV2;
    private javax.swing.JLabel lblTienganh;
    private javax.swing.JLabel lblTinhoc;
    private javax.swing.JLabel lblten;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtGDTC;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtTienganh;
    private javax.swing.JTextField txtTinhoc;
    private javax.swing.JLabel txtdiemtb;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}

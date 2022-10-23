/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SinhVienDiem;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QuanLySinhVienDiemService {

    private ArrayList<SinhVienDiem> ls;

    public QuanLySinhVienDiemService() {
        this.ls = new ArrayList<>();
    }

    public ArrayList<SinhVienDiem> getlist() {
        return ls;
    }

    public void setList(ArrayList<SinhVienDiem> ls) {
        this.ls = ls;
    }

    public void addtable(DefaultTableModel bang) {
        bang.setRowCount(0);
        for (SinhVienDiem svd : ls) {
            bang.addRow(new Object[]{svd.getTenSV(), svd.getMaSV(), svd.getTAnh(), svd.getTHoc(), svd.getGduc(), svd.DiemTB()});
        }
    }

    public void add(SinhVienDiem svd) {
        ls.add(svd);
    }

    public void update(String ten,SinhVienDiem svd){
        for (int i = 0; i < ls.size(); i++) {
            SinhVienDiem sv=ls.get(i);
            if(sv.getTenSV().trim().equals(ten)){
                ls.set(i, svd);
            }
        }
    }

    public void delete(int ma) {
        ls.remove(ma);
    }

}

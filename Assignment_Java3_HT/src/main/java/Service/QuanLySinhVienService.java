/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.SinhVien;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.w3c.dom.stylesheets.LinkStyle;

/**
 *
 * @author Admin
 */
public class QuanLySinhVienService {

    private ArrayList<SinhVien> list ;
    
    public QuanLySinhVienService(){
        this.list=new ArrayList<>();
    }

    public ArrayList<SinhVien> getlist() {
        return list;
    }
    
    public void setList(ArrayList<SinhVien> list){
        this.list=list;
    }

    public void addtable(DefaultTableModel bang) {
        bang.setRowCount(0);
        for (SinhVien sv : list) {
            bang.addRow(new Object[]{sv.getMasv(), sv.getHoten(), sv.getEmail(), sv.getSodt(), sv.getGioitinh(), sv.getDiachi(), sv.getHinhanh()});
        }
        bang.fireTableDataChanged();
    }

    public void save(SinhVien sv) {
        list.add(sv);
    }

    public void delete(int ma) {
        list.remove(ma);
    }

public void update(String ma,SinhVien sv){
    for (int i = 0; i < list.size(); i++) {
        SinhVien s=list.get(i);
        if(s.getMasv().equals(ma)){
            list.set(i, sv);
        }
    }
}

}

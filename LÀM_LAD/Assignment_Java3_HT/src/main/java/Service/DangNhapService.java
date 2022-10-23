/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.DangNhap;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DangNhapService {

    ArrayList<DangNhap> list = new ArrayList<>();

    public DangNhapService() {
        list.add(new DangNhap("admin", "123", true));
        list.add(new DangNhap("admin", "123", true));
        list.add(new DangNhap("admin", "123", true));
    }

    public boolean check(String user, String pass) {
        for (DangNhap dangNhap : list) {
            if (dangNhap.getUsername().equals(user)
                    && dangNhap.getPass().equals(pass)) {
                return true;
            }
        }
        return false;
    }
}

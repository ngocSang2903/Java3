/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.DangNhapModel;
import Repository.DangNhapRepository;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class DangNhapService {

    private DangNhapRepository dangNhapRepository;

    public DangNhapService() {
        dangNhapRepository=new DangNhapRepository();
    }
    
    public DangNhapModel getDangNhap(String user,String pass,String role){
        return this.dangNhapRepository.getDangNhap(user, pass, role);
    }
}

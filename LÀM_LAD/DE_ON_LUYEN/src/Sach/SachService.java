/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sach;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SachService {

    SachRepository sachRepository;

    public SachService() {
        sachRepository = new SachRepository();
    }

    public void insert(SachModel s) {
        sachRepository.insert(s);
    }

    public void update(int id, SachModel s) {
        sachRepository.update(id, s);
    }

    public void delete(int id) {
        sachRepository.delete(id);
    }

    public ArrayList<SachModel> all() {
        return sachRepository.all();
    }
}

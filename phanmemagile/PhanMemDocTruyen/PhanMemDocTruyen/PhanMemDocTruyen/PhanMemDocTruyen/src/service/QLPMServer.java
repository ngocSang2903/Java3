/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Repository.QLPMRepository;
import java.util.ArrayList;
import model.QLPMModel;

/**
 *
 * @author Admin
 */
public class QLPMServer {

    private QLPMRepository qLPMRepository;

    public QLPMServer() {
        qLPMRepository = new QLPMRepository();
    }

    public void insert(QLPMModel ql) {
        qLPMRepository.insert(ql);
    }

    public void update(int ma, QLPMModel ql) {
        qLPMRepository.update(ma, ql);
    }

    public void delete(int ma) {
        qLPMRepository.delete(ma);
    }

    public ArrayList<QLPMModel> all() {
        return qLPMRepository.all();
    }
    
        public ArrayList<QLPMModel> Findtap(String Ten) {
        return qLPMRepository.FIndTap(Ten);
    }
}

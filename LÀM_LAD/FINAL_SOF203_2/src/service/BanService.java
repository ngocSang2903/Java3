/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Model.BanModel;
import java.util.ArrayList;
import repository.Repository;

/**
 *
 * @author Admin
 */
public class BanService {

    private Repository Repo = new Repository();

    public ArrayList<BanModel> all() {
        return this.Repo.all();
    }

    public void update(String ma, BanModel banModel) {
        this.Repo.update(ma, banModel);
    }

    public void delete(String ma) {
        this.Repo.delete(ma);
    }
}

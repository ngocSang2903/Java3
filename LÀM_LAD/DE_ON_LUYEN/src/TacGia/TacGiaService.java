/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TacGia;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class TacGiaService {

    private TacGiaRepository tgr = new TacGiaRepository();

    public void insert(TacGiaModel tg) {
        tgr.insert(tg);
    }

    public void update(int id, TacGiaModel tg) {
        tgr.update(id, tg);
    }

    public void delete(int id) {
        tgr.delete(id);
    }

    public ArrayList<TacGiaModel> all() {
        return tgr.all();
    }
}

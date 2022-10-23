/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Danh_Muc;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class CategoryService {

    private CategoryRepository categoryrepository;

    public CategoryService() {
        categoryrepository = new CategoryRepository();
    }

    public void insert(Category c) {
        categoryrepository.insert(c);
    }

    public void update(int id, Category c) {
        categoryrepository.update(id, c);
    }

    public void delete(int id) {
        categoryrepository.delete(id);
    }

    public ArrayList<Category> all() {
        return categoryrepository.all();
    }
}

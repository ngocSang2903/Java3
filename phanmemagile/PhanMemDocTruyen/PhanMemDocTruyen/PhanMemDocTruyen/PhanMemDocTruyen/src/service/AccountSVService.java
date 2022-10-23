
package service;

import Repository.AccountRepository;
import java.util.ArrayList;
import model.SinhVien;


public class AccountSVService {
    private AccountRepository AccRepo;
    
    public AccountSVService() {
        this.AccRepo = new AccountRepository();
    }
    public ArrayList<SinhVien> all(){
        return this.AccRepo.all();
    }

    public AccountRepository getAccRepo() {
        return AccRepo;
    }

    public void setAccRepo(AccountRepository AccRepo) {
        this.AccRepo = AccRepo;
    }
    
    public void insert(SinhVien svn){
        this.AccRepo.insert(svn);
    }
    
}

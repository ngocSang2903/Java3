package model;

public class QuanLi {

    private int maQL;
    private String hoTen;
    private String email;
    private String passWord;

    public QuanLi() {
    }

    public QuanLi(int maQL, String hoTen, String email, String passWord) {
        this.maQL = maQL;
        this.hoTen = hoTen;
        this.email = email;
        this.passWord = passWord;
    }

    public int getMaQL() {
        return maQL;
    }

    public void setMaQL(int maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}

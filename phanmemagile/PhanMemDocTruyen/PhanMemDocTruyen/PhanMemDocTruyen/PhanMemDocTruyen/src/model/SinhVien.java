
package model;


public class SinhVien {
    private int maSV;
    private String hoTen;
    private String Email;
    private String password;
    private boolean gioiTinh;

    public SinhVien() {
    }

    public SinhVien(int maSV, String hoTen, String Email, String password, boolean gioiTinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.Email = Email;
        this.password = password;
        this.gioiTinh = gioiTinh;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

  
    

    public String hienThiGioiTinh(){
        if(gioiTinh){
            return "Nam";
        }
        return "Nữ";
    }
}

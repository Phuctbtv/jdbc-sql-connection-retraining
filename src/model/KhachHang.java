package model;

import java.sql.Date;

public class KhachHang {
    private int id;
    private String hoVaTen;
    private Date ngaySinh;
    private String diachi;

    public KhachHang(int id, String hoVaTen, Date ngaySinh, String diachi) {
        super();
        this.id = id;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diachi = diachi;
    }

    public KhachHang() {
        super();
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

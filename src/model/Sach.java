package model;

public class Sach {
    private String ID;
    private String tenSach;
    private float giaBan;
    private int namXuatBan;

    public Sach(String ID, String tenSach, float giaBan, int namXuatBan) {
        super();
        this.ID = ID;
        this.tenSach = tenSach;
        this.giaBan = giaBan;
        this.namXuatBan = namXuatBan;
    }

    public Sach() {
        }

    public String getID() {
        return ID;
    }

    public String getTenSach() {
        return tenSach;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

}

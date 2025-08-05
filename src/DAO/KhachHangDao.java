package DAO;

import model.KhachHang;

import java.sql.Connection;
import java.util.ArrayList;

public class KhachHangDao implements DaoInterface<KhachHang>{
    public static KhachHangDao getInstance(){
        return new KhachHangDao();
    }
    @Override
    public int insert(KhachHang khachHang) {

        return 0;
    }

    @Override
    public int update(KhachHang khachHang) {
        return 0;
    }

    @Override
    public int delete(KhachHang khachHang) {
        return 0;
    }

    @Override
    public ArrayList<KhachHang> selectAll() {//lấy tất cả khách hàng trong 1 bảng nào đó
        return null;
    }

    @Override
    public KhachHang selectById(KhachHang khachHang) {
        return null;
    }

    @Override
    public ArrayList<KhachHang> selectByCondition(String condition) {
        return null;
    }
}

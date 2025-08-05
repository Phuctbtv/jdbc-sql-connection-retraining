package DAO;

import Ketnoi.JDBC_Connect;
import model.Sach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SachDAO implements DaoInterface<Sach> {

    public static SachDAO getInstance(){
        return new SachDAO();
    }
    @Override
    public int insert(Sach sach) {
        int ketQua = 0;

        try {
            // Bước 1: Tạo kết nối đến CSDL
            Connection con = JDBC_Connect.getConnection();

            // Bước 2: Tạo câu lệnh SQL với tham số ?
            String sql = "INSERT INTO sach(ID, tenSach, giaBan, namXuatBan) VALUES (?, ?, ?, ?)";

            // Bước 3: Tạo đối tượng PreparedStatement
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, sach.getID());
            pstmt.setString(2, sach.getTenSach());
            pstmt.setFloat(3, sach.getGiaBan());
            pstmt.setInt(4, sach.getNamXuatBan());

            // Bước 4: Thực thi
            ketQua = pstmt.executeUpdate();

            System.out.println("✅ Đã thực thi: " + sql);
            System.out.println("👉 Có " + ketQua + " dòng bị thay đổi.");

            // Bước 5: Đóng kết nối
            JDBC_Connect.closeConnection(con);

        } catch (SQLException e) {
            System.out.println("❌ Lỗi khi insert sách: " + e.getMessage());
        }

        return ketQua;
    }


    @Override
    public int update(Sach sach) {
        int ketQua = 0;

        try {
            // Bước 1: Kết nối CSDL
            Connection con = JDBC_Connect.getConnection();

            // Bước 2: Viết câu lệnh SQL UPDATE
            String sql = "UPDATE sach SET tenSach = ?, giaBan = ?, namXuatBan = ? WHERE ID = ?";

            // Bước 3: Truyền giá trị bằng PreparedStatement
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, sach.getTenSach());
            pstmt.setFloat(2, sach.getGiaBan());
            pstmt.setInt(3, sach.getNamXuatBan());
            pstmt.setString(4, sach.getID()); // điều kiện WHERE

            // Bước 4: Thực thi
            ketQua = pstmt.executeUpdate();

            System.out.println("✅ Đã cập nhật sách có ID = " + sach.getID());
            System.out.println("👉 Có " + ketQua + " dòng bị thay đổi.");

            // Bước 5: Đóng kết nối
            JDBC_Connect.closeConnection(con);

        } catch (SQLException e) {
            System.out.println("❌ Lỗi khi update sách: " + e.getMessage());
        }

        return ketQua;
    }


    @Override
    public int delete(Sach sach) {
        int ketQua = 0;

        try {
            // Bước 1: Kết nối
            Connection con = JDBC_Connect.getConnection();

            // Bước 2: SQL DELETE
            String sql = "DELETE FROM sach WHERE ID = ?";

            // Bước 3: Truyền tham số
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, sach.getID());

            // Bước 4: Thực thi
            ketQua = pstmt.executeUpdate();

            System.out.println("✅ Đã xóa sách có ID = " + sach.getID());
            System.out.println("👉 Có " + ketQua + " dòng bị xóa.");

            // Bước 5: Đóng kết nối
            JDBC_Connect.closeConnection(con);

        } catch (SQLException e) {
            System.out.println("❌ Lỗi khi xóa sách: " + e.getMessage());
        }

        return ketQua;
    }


    @Override
    public ArrayList<Sach> selectAll() {
        return null;
    }

    @Override
    public Sach selectById(Sach sach) {
        return null;
    }

    @Override
    public ArrayList<Sach> selectByCondition(String condition) {
        return null;
    }
}

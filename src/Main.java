import Ketnoi.JDBC_Connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            //B1 tạo kết nối
            conn = JDBC_Connect.getConnection();

            if (conn != null) {
                //B2 tạo ra đối tượng statement
                Statement stmt = conn.createStatement();//tạo đối tượng
                //B3 thực thi một câu lệnh sql

                int rs1 = stmt.executeUpdate("INSERT INTO PRODUCTS (CODE, IMAGE, NAME, PRICE, CREATE_DATE)\n" +
                        "VALUES ('S006', NULL, 'Python for Beginners', 130, '2025-08-03 10:00:00.000');\n");
               // ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUCTS");//thực thi staterment không thể vừa thực hiện executeQuery() (truy vấn) và vừa thực hiện executeUpdate() (thêm dữ liệu) trên cùng một đối tượng Statement
                //cách 1 còn làm như cách trên là cách 2
               /* Statement stmt = conn.createStatement();
                stmt.executeUpdate("INSERT INTO PRODUCTS ...");
                stmt.close(); // đóng lại để giải phóng

                stmt = conn.createStatement(); // tạo mới để SELECT
                ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUCTS");*/

//                Thực thi statement
//                        boolean excute(String SQL) throws SQLException
//                        int executeUpdate(String SQL) throw SQLException ==> thêm ,sửa ,xóa dữ liệu
//                        ResultSet executeQuery(String sql) throw SQLException ==>lấy dữ liệu

                if (rs1 > 0) {
                    System.out.println("✅ Thêm dữ liệu thành công! Số dòng ảnh hưởng: " + rs1);
                } else {
                    System.out.println("⚠️ Không có dòng nào được thêm.");
                }
                System.out.println("Dữ liệu vừa thêm đã cập nhật vào bảng dữ liệu");
                //phải làm xong executeUpdate() (thêm dữ liệu) mới đến truy vấn
                ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUCTS");//thực thi staterment
                while (rs.next()) {//duyệt qua từng hàng
                    // In ra các cột, ví dụ cột 1 và cột 2
                    System.out.println("Mã SP: " + rs.getString(1) + ", Tên SP: " + rs.getString(3));
                }


            } else {
                System.out.println("❌ Không thể kết nối đến CSDL.");
            }


        } catch (Exception e) {
            System.out.println("❌ Lỗi thao tác: " + e.getMessage());
        } finally {
            JDBC_Connect.closeConnection(conn); // luôn đóng kết nối dù thành công hay lỗi
        }
    }
}

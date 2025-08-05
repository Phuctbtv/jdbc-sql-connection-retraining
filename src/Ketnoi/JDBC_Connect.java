package Ketnoi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connect {
    /*public static Connection getConnection() {
        Connection conn = null;

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName("PHAMPHUC\\SQLEXPRESS");
        ds.setPortNumber(1433);
        ds.setDatabaseName("ShopDB1");
        ds.setUser("sa");
        ds.setPassword("123456");

        // ⚠ KHÔNG cần gọi setEncrypt(true)
        ds.setTrustServerCertificate(true); // đủ để tránh lỗi SSL khi chạy local

        try {
            conn = ds.getConnection();
            System.out.println("✅ Kết nối thành công!");
        } catch (SQLException e) {
            System.out.println("❌ Lỗi: " + e.getMessage());
        }

        return conn;
    }*/ //cách1
    private static final String URL = "jdbc:sqlserver://PHAMPHUC\\SQLEXPRESS:1433;databaseName=nhasach;encrypt=true;trustServerCertificate=true";
    private static final String USER = "sa";
    private static final String PASSWORD = "123456";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("❌ Kết nối thất bại: " + e.getMessage());
            return null;
        }
    }

    public static void closeConnection(Connection conn) {//ngắt kết nối csdl
        if (conn != null) {
            try {
                conn.close();
                System.out.println("🔌 Đã ngắt kết nối.");
            } catch (SQLException e) {
                System.out.println("❌ Lỗi khi đóng kết nối: " + e.getMessage());
            }
        }
    }
}

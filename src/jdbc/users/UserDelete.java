package jdbc.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDelete {
    public static void main(String[] args) {
        Connection con = null;

        try {
            // 1. JDBC 드라이버 등록 : MySQL DB 접근하기 위한 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded " + con);

            // 2. MySQL DB에 연결객체를 얻어와서 연결하기
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg");
            System.out.println("Connected to database " + con);

            // 3. 매개변수화된 SQL문 작성
//            String query = "UPDATE users SET userpassword = ? WHERE userid = ?";
//            PreparedStatement pstmt = con.prepareStatement(query);
//            pstmt.setString(1, "12345");
//            pstmt.setString(2, "minseong123");

            String query = new StringBuilder()
                    .append("DELETE FROM users ")
                    .append("WHERE userid = ? ").toString();

            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, "minseong123");

            // 4. SQL문 실행
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " rows deleted");

            // 5. PreparedStatement 객체 닫기
            pstmt.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (con != null) {
                try {
                    con.close();
                    System.out.println("Connection closed.");
                } catch (SQLException e) {e.printStackTrace();}
            }
        }
    }
}

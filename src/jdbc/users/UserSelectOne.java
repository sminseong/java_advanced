package jdbc.users;

import java.sql.*;

public class UserSelectOne {
    public static void main(String[] args) {
        Connection con = null;
        ResultSet rs = null;

        try {
            // 1. JDBC 드라이버 등록 : MySQL DB 접근하기 위한 드라이버 등록
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded " + con);

            // 2. MySQL DB에 연결객체를 얻어와서 연결하기
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssgdb?serverTimezone=Asia/Seoul", "ssg", "ssg");
            System.out.println("Connected to database " + con);

            String query = new StringBuilder()
                    .append("SELECT * FROM users ")
                    .append("WHERE userid = ? ")
                    .toString();

            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, "ssgcom1");

            // 4. SQL문 실행
            rs = pstmt.executeQuery();

            if (rs.next()) {
                User user = new User();
                user.setUserid(rs.getString("userid"));
                user.setUsername(rs.getString("username"));
                user.setUserpassword(rs.getString("userpassword"));
                user.setUserage(rs.getInt("userage"));
                user.setUseremail(rs.getString("useremail"));
                System.out.println(user);
            } else {
                System.out.println("가입된 회원이 아닙니다.");
            }

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

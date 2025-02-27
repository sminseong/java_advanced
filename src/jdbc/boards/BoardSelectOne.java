package jdbc.boards;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;

public class BoardSelectOne {
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
            String query = "SELECT * FROM boards WHERE bno = ?";
            PreparedStatement pstmt = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            pstmt.setInt(1, 1);

            // 4. SQL문 실행
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Board board = new Board();
                board.setBno(rs.getInt("bno"));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBdate(rs.getDate("bdate"));
                board.setBfilename(rs.getString("bfilename"));
                board.setBfiledata(rs.getString("bfiledata"));
                System.out.println(board);
            }

//            // bno 값 얻어오기
//            if (rows == 1) {
//                ResultSet rs = pstmt.getGeneratedKeys();
//                if (rs.next()) {
//                    int bno = rs.getInt(1);
//                    System.out.println(bno);
//                }
//                rs.close();
//            }

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

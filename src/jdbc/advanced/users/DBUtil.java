package jdbc.advanced.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * packageName   : jdbc.advanced.users
 * fileName      : DBUtil
 * author        : a
 * date          : 2025-02-28
 * description   : 데이터베이스 연결 작업 클래스
 * =================================================
 * DATE             AUTHOR             NOTE
 * -------------------------------------------------
 * 2025-02-28        a
 */
public class DBUtil {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DBUtil1.URL.getValue());
        } catch (SQLException e) {
            System.out.println("connect failed");
            return null;
        }
    }

}

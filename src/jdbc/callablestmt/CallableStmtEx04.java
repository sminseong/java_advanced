package jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStmtEx04 {
    Connection conn = null;
    CallableStatement cs = null;
    public CallableStmtEx04() throws SQLException {
        // 1. connection 얻어오기
        conn = DBUtil.getConnection();

        // 2. CallableStatement 객체를 이용하여 호출할 프로시저 연결
        cs = conn.prepareCall("{CALL SP_MEMBER_LIST()}");     // ? : cDATA  ? : cTname  ? : resultMsg

        // 3. 바인드 변수에 값을 세팅
//        cs.setString(1, "TB_MEMBER");

        //4. out 파라미터에 저장된 프로시저의 수행결과에 대한 외부 변수 등록
        // cs.registerOutParameter(2, java.sql.Types.VARCHAR);

        // 5. 쿼리 수행
        // flag 의 값은 resultSet 객체의 경우는 true, 갱신카운트 또는 결과가 없는 경우 false 리턴됨
        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
            System.out.println(rs.getInt("m_seq"));
        }

        if (cs != null) cs.close();
        if (conn != null) conn.close();
    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx04();
    }
}

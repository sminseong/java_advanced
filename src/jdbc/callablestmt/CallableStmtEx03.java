package jdbc.callablestmt;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStmtEx03 {
    Connection conn = null;
    CallableStatement cs = null;
    public CallableStmtEx03() throws SQLException {
        // 1. connection 얻어오기
        conn = DBUtil.getConnection();

        // 2. CallableStatement 객체를 이용하여 호출할 프로시저 연결
        cs = conn.prepareCall("{CALL SP_MEMBER_INSERT(?,?,?,?,?)}");     // ? : cDATA  ? : cTname  ? : resultMsg

        // 3. 바인드 변수에 값을 세팅     inparameter (?) 에 값 넣기
        cs.setString(1, "black");        //코드네임
        cs.setString(2, "1234");           //코드를 등록할 테이블명
        cs.setString(3, "black@gmail.com");
        cs.setString(4, "01044442222");

        //4. out 파라미터에 저장된 프로시저의 수행결과에 대한 외부 변수 등록
        cs.registerOutParameter(5, java.sql.Types.INTEGER);

        // 5. 쿼리 수행
        // flag 의 값은 resultSet 객체의 경우는 true, 갱신카운트 또는 결과가 없는 경우 false 리턴됨
        cs.execute();
        int rtn = cs.getInt(5);
        System.out.println(rtn);
        String resultString = null;
        if (rtn == 100) {
            resultString = "이미 가입된 회원입니다";
            conn.rollback();
        } else {
            resultString = "회원 가입 성공";
        }
        System.out.println();

        if (cs != null) cs.close();
        if (conn != null) conn.close();
    }

    public static void main(String[] args) throws SQLException {
        new CallableStmtEx03();
    }
}

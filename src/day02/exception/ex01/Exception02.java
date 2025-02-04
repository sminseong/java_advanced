package day02.exception.ex01;

public class Exception02 {
    public static void main(String[] args) {
        String[] stringArray = {"100", "1oo", null};
        for (int i=0; i<stringArray.length; i++) {
            try {
                int value = Integer.parseInt(stringArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과되었습니다." + e.getMessage());
            } catch (NumberFormatException | NullPointerException e1) {
                System.out.println("숫자로 변환할 수 없는 데이터입니다." + e1.getMessage()); // 2가지 예외 동시에 처리
            } catch (Exception e) {
                System.out.println("실행에 문제가 발생하였습니다." + e.getMessage());
            }
        }
    }
}

package day01.sealedEx;

public class Student extends Manager{
    //봉인된 Person 클래스의 permits 가 되지 않았으므로 상속 불가
    //봉인 해제된 Manager 클래스는 상속 가능합니다.


    @Override
    public void work() {
        System.out.println("공부를 열심히 합니다.");
    }
}

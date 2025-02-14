package day10.lambda.ex01;
// Person 클래스는 Workable 인터페이스를 매개변수로 갖는 action이라는 메서드를 갖고 있다.
public class Person {
    public static void action(Workable workable) {
        workable.work();
    }
}

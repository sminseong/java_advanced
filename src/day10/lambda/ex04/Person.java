package day10.lambda.ex04;

import day10.lambda.ex03.Calculable;

//Person 클래스는 Calculable 을 매개변수로 갖는 calculate 메서드를 갖고 있다.
//calculate 메서드는 Calculable 인터페이스를 매개변수로 갖는 메소드이다.
public class Person {

    public void action(Calculable calculable) {
        double result = calculable.calculate(20, 5);
        System.out.println("결과: " + result);
    }
}

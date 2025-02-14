package day10.lambda.ex01;

public class WorkMain {
    public static void main(String[] args) {
        Person person = new Person();

        Person.action(
                () -> {
                    System.out.println("09시까지 출근을 합니다.");
                    System.out.println("9시 ~ 11시 50분까지 오전업무를 합니다.");
                    System.out.println("12시 ~ 오후 1시까지 점심시간 입니다.");
                }
        );

        person.action(() -> System.out.println("주말엔 축구 동호회에 가서 열심히 공을 찹니다."));

    }
}

package day10.lambda.ex06;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        Member m1 = person.getMember1(Member::new);
        Member m2 = person.getMember2(Member::new);
    }
}


// 생성자 참조는 함수형 인터페이스의 매개변수 개수에 따라 실행되는 Member 생성자가 다름을 확인함.

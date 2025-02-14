package day10.lambda.ex02;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("홍길동", "프로그래밍", "프로그래밍은 정말 재미있어!!");

        person.action((name, job) -> {
            System.out.println(name + "씨가 " + job + "을 합니다.");
        });

        person.action2(System.out::println);

        System.out.println();

        //황가람은 가수 입니다.
        //"여러분을 만날때까지 너무 오래 걸렸어요. 만나서 반갑습니다." 말합니다. 출력
        //"반딧불" 노래를 부릅니다.

        Person person1 = new Person("황가람", "가수", "여러분을 만날때까지 너무 오래걸렸어요. 만나서 반갑습니다.", "반딧불");
        person1.action((name, job) -> System.out.println(name + "은 " + job + "입니다."));
        person1.action2(System.out::println);
        person1.action3(song -> System.out.println(song + " 노래를 부릅니다."));

        System.out.println();

        Person person2 = new Person("조수미", "오페라가수", "저를 오랫동안 사랑해주셔서 감사합니다.", "밤의 아리아");
        person2.action((name, job) -> System.out.println(name + "은 " + job + "입니다."));
        person2.action2(System.out::println);
        person2.action3(song -> System.out.println(song + " 노래를 부릅니다."));




//        Workable action = (name, job) -> System.out.println(name + "씨가 " + job + "을 합니다.");
//        Speakable action2 = System.out::println;
//
//        action.work("홍길동", "프로그래밍");
//        action2.speak("프로그래밍은 정말 재미있어!!");
    }
}

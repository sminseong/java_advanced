package day10.lambda.ex02;

// Person 클래스는 Workable 인터페이스를 매개변수로 갖는 action 메서드와 speakable을 매개변수로 갖는 action2() 를 갖고있다.

public class Person {
    private String name;
    private String job;
    private String contents;
    private String song;

    public Person(String name, String job, String contents, String song) {
        this.name = name;
        this.job = job;
        this.contents = contents;
        this.song = song;
    }

    public Person(String name, String job, String contents) {
        this.name = name;
        this.job = job;
        this.contents = contents;
    }

    public void action(Workable workable) {
        workable.work(name, job);
    }
    public void action2(Speakable speakable) {
        speakable.speak(contents);
    }
    public void action3(Singable singable) { singable.sing(song); }
}

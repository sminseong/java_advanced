package day01;

public class Phone {
    //필드 선언
    public String model;
    public String color;

    //public Phone() {}
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone model color 생성");
    }

    //메소드
    public void bell() {
        System.out.println("벨이 울린다.");
    }

    public final void volumeUp() {  //오버라이딩 불가
        System.out.println("볼륨을 줄입니다.");
    }
}

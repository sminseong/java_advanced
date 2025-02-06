package day04.interfaceEx.ex02;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();

        //자동차에 타이어를 장착
        myCar.run();

        myCar.tire1 = new KeumhoTire();
        myCar.tire2 = new HankookTire();

        myCar.run();
    }
}

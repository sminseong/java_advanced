package day01.inheritance;

public class CarMain {
    public static void main(String[] args) {
        Car myCar = new Car();

        //자동차에 타이어를 장착
        myCar.tire = new Tire();
        myCar.run();

        //HankookTire 교환
        myCar.tire = new HankookTire();
        myCar.run();

        //KeumohoTire 교환
        myCar.tire = new KeumhoTire();
        myCar.run();
    }
}

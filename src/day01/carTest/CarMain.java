package day01.carTest;

public class CarMain {
    public static void main(String[] args) {
        Car myCar1 = new Car(3);
        myCar1.speedUp();
        myCar1.speedUp();
        myCar1.speedUp();
        System.out.println(myCar1.speed);
        SportsCar myCar2 = new SportsCar(50);
        myCar2.speedUp();
        myCar2.speedUp();
        myCar2.speedUp();
        myCar2.speedUp();
        myCar2.speedUp();
        System.out.println(myCar2.toString());
    }
}

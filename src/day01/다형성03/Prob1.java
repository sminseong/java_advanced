package day01.다형성03;

public class Prob1 {
    public static void main(String[] args) {
        Wheeler bike = new Bike("자전거", 0,2);
        Wheeler truck = new Truck("트럭", 0, 4);

        System.out.println(truck.carName + " : 바퀴 " + truck.wheelNumber + "개입니다");
        System.out.println(bike.carName + " : 바퀴 " + bike.wheelNumber + "개입니다");

        truck.speedUp(20);
        bike.speedUp(25);
        truck.speedDown(20);
        bike.speedDown(20);
        truck.stop();
        bike.stop();
        truck.speedUp(10);
    }
}

package day01.다형성03;

public class Bike extends Wheeler {

    public Bike(String carName, int velocity, int wheelNumber) {
        super(carName, velocity, wheelNumber);
    }

    @Override
    public void speedDown(int speed) {
        velocity -= speed;
        if (velocity < 10) {
            velocity = 10;
            System.out.println("자전거의 최저속도위반으로 속도를 " + velocity + " 으로 올립니다.");
        }
    }

    @Override
    public void speedUp(int speed) {
        velocity += speed;
        if (velocity > 40) {
            velocity = 40;
            System.out.println("자전거의 현재 속도는 " + velocity + " 입니다.");
        }
    }
}

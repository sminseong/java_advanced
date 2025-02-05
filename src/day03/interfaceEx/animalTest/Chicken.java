package day03.interfaceEx.animalTest;

public class Chicken extends Animal implements Cheatable{

    public Chicken(int speed) {
        super(speed);
    }

    @Override
    public void run(int hours) {
        setDistance(getDistance() + getSpeed() * hours);
    }

    @Override
    public void fly() {
        setSpeed(getSpeed() * 2);
    }
}

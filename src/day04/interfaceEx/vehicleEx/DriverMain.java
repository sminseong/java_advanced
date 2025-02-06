package day04.interfaceEx.vehicleEx;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        driver.run();

        driver.vehicle1 = new Taxi();
        driver.vehicle2 = new Bus();

        driver.run();
//        Bus bus = new Bus();
//        driver.drive(bus);
//
//        Taxi taxi = new Taxi();
//        driver.drive(taxi);
    }
}

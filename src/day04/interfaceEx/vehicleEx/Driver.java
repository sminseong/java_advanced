package day04.interfaceEx.vehicleEx;

public class Driver {
    //메소드 선언부에서 매개변수 클래스타입의 매개변수
//    public void drive(Vehicle vehicle) {
////        Object obj = vehicle;
////        Vehicle v = (Vehicle)obj;
//        if (vehicle instanceof Taxi || vehicle instanceof Bus) {
//            vehicle.run();
//        }
//    }
    Vehicle vehicle1 = new Bus();
    Vehicle vehicle2 = new Taxi();

    public void run() {
        vehicle1.run();
        vehicle2.run();
    }


}

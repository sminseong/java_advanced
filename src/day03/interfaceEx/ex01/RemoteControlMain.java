package day03.interfaceEx.ex01;

public interface RemoteControlMain {
    public static void main(String[] args) {
//        RemoteControl remoteControl;
//        remoteControl = new TV();   //인터페이스 자신을 구현한 구현객체(TV)를 담을 수 있다.
//        remoteControl.turnOn();
//        remoteControl = new Radio(); //remoteControl변수에 Radio로 교체(대입)
//        remoteControl.turnOff();
//        System.out.println("리모컨 최대 볼륨: " + RemoteControl.MAX_VOLUME);
//        System.out.println("리모컨 최소 볼륨: " + RemoteControl.MIN_VOLUME);

        //1. 리모컨을 구입한다.
        RemoteControl remoteControl;
        //2. 새로 산 리모컨에 TV를 설정한다.
        remoteControl = new TV();
        //3. 리모컨을 이용하여 TV를 켠다.
        remoteControl.turnOn();
        //4. 리모컨을 이용하여 볼륨을 10으로 설정하고 설정값을 확인한다.
        remoteControl.setVolume(10);
        //5. 리모컨을 이용하여 TV를 끈다.
        remoteControl.turnOff();

        //1. 리모컨을 집에 있는 라디오로 페어링 한다.
        remoteControl = new Radio();
        //2. 리모컨을 이용하여 라디오를 켠다.
        remoteControl.turnOn();
        //3. 리모컨을 이용하여 볼륨을 20으로 설정하고 설정값을 확인한다.
        remoteControl.setVolume(20);
        //4. 리모컨을 이용하여 라디오를 끈다.
        remoteControl.turnOff();

        remoteControl.setMute(true);    //디폴트 메소드 호출
        remoteControl.setMute(false);
        RemoteControl.changeBattery();
    }
}

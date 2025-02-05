package day03.interfaceEx.ex01;

public interface RemoteControl {
    //가장 큰 볼륨을 저장할 멤버 30할당
    public static final int MAX_VOLUME = 30;
    //가장 작은 볼륨을 저장할 멤버 0할당
    int MIN_VOLUME = 0;

    public abstract void turnOn();
    void turnOff();  // 바디 { } 구현X

    public abstract void setVolume(int volume);     //볼륨 세팅

    default void setMute(boolean mute) {
        if(mute) {
            System.out.println("쉿 모드로 전환됩니다.");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("쉿 모드가 해제되었습니다.");
        }
    }

    // 배터리 교체 기능을 정적메소드를 통하여 구현 changeBattery()

    public static void changeBattery() {
        System.out.println("건전지를 교체합니다.");
    }
}

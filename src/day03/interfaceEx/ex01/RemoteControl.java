package day03.interfaceEx.ex01;

public interface RemoteControl {
    //가장 큰 볼륨을 저장할 멤버 30할당
    public static final int MAX_VOLUME = 30;
    //가장 작은 볼륨을 저장할 멤버 0할당
    int MIN_VOLUME = 0;

    public abstract void turnOn();
    void turnOff();  // 바디 { } 구현X

    public abstract void setVolume(int volume);     //볼륨 세팅
}

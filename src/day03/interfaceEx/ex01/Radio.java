package day03.interfaceEx.ex01;

import day03.interfaceEx.ex02.Pet;

public class Radio implements RemoteControl{

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("라디오를 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("라디오를 끈다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
            System.out.println("현재 해당 제품의 볼륨 최대값으로 세팅되었습니다.");
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
            System.out.println("mute");
        } else {
            this.volume = volume;
        }
        System.out.println("현재 라디오 볼륨은: " + this.volume);
    }
    private int memoryVolume;
    //내가 사용했던 이전 볼륨을 기억했다가 쉿모드 해제 이후 다시 복원
    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("쉿모드 작동");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("쉿모드 해제");
            setVolume(this.memoryVolume);   // 원래 볼륨으로 복원됨
        }
    }
}

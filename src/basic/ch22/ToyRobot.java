package basic.ch22;

import basic.exercise.toy.ToyMachineTest;

public class ToyRobot implements RemoteController, SoundEffect{
	
	int width;
	int height;
	String color;
	
	// 공통기능 설계
	// turn On
	// turn Off
	
	@Override
	public void turnOn() {
		System.out.println("장난감 로봇을 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("장난감 로봇을 끕니다.");
	}
	
	@Override
	public void soundOn() {
		System.out.println("두두르르르 ~~~ 크악~");
	}
	
	@Override
	public void soundOff() {
		System.out.println(" ㅇㅅㅇ ");
	}
}

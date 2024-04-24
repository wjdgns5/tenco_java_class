package basic.ch21;

public class DeskTop extends Computer {

	@Override
	public void display() {
		System.out.println("Display On");
	}

	@Override
	public void typing() {
		System.out.println("Input On");
	}

	@Override
	public void turnOn() {
		System.out.println("Power On");
	}

	@Override
	public void turnOff() {
		System.out.println("Power Off");
	}

}

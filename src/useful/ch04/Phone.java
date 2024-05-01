package useful.ch04;

public abstract class Phone {

	public void startPhone() {
		System.out.println("휴대폰이 켜집니다.");
	};

	public abstract void operation();

	public abstract void stop();

	public void turnOff() {
		System.out.println("휴대폰이 꺼집니다.");
	};

	public void run() {

		startPhone();
		operation();
		stop();
		turnOff();
	};
}

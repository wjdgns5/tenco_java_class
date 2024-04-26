package basic.ch22;

interface Animal {
	// 추상 메서드만 선언 가능
	// public abstract void eat(); // 축약이 가능하다.
	// public abstract void move(); // 축약이 가능하다.

	// 축약 가능
	void eat();

	void move();

} // end of interface Animal

// implements - 구현하다.
class Dog implements Animal {
	// class 앞에 abstract를 붙이거나 , Animal의 메서드를 @oOverride 하거나

	@Override
	public void eat() {
		System.out.println("먹이를 먹다.");
	}

	@Override
	public void move() {
		System.out.println("촐랑촐랑 다닌다.");
	}
} // end of Dog class

class Bird implements Animal {
	@Override
	public void eat() {
		System.out.println("모이를 먹다.");
	}
	
	@Override
	public void move() {
		System.out.println("날라 다닌다.");
	}
} // end of Bird class

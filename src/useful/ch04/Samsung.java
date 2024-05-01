package useful.ch04;

public class Samsung extends Phone {

	@Override
	public void operation() {
		System.out.println("Samsung on ");
	}

	@Override
	public void stop() {
		System.out.println("Samsung off");
	}

}

package useful.ch04;

public class Apple extends Phone {
	
	@Override
	public void operation() {
		System.out.println("Apple on ");
	}
	
	@Override
	public void  stop() {
		System.out.println("Apple off ");
	}

}

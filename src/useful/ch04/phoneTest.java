package useful.ch04;

public class phoneTest {

	public static void main(String[] args) {

		Phone sam = new Samsung();
		Phone app = new Apple();

		sam.run();
		System.out.println("------------------");
		app.run();

	}

}

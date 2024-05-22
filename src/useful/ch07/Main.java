package useful.ch07;

class OuterClass {
	private int num = 10;

	public class InnerClass {
		
		public void Display() {
			System.out.println("num : " + num);
		} // end of Display()
		
	} // end of InnerClass()
	
} // end of OuterClass()

public class Main {

	public static void main(String[] args) {

		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.Display();

	} // end of main
} // end of class

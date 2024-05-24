package useful.ch07;

public class OuterClass_1 {
	
	// 외부 클래스의 메서드
	public void display() {
		
		class LocalInnerClass {
			void printMessage() {
				System.out.println("Hello from the Local Inner Class !");
			} // end of printMessage()
		} // end of  LocalInnerClass
		
		// 지역 내부 클래스의 인스턴스 생성
		LocalInnerClass inner = new LocalInnerClass();
		// 메서드 호출
		inner.printMessage();
	} // end of display()
	
	public static void main(String[] args) {
		OuterClass_1 outer = new OuterClass_1();
		outer.display();
	} // end of main

} // end of class
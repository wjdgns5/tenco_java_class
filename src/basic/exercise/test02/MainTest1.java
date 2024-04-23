package basic.exercise.test02;

public class MainTest1 {
	// 코드의 시작
	public static void main(String[] args) {
		
		// 문제 1번
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		// 메서드 의존 주입
		a.setB(b);
		b.setC(c);
		c.setD(d);
		
		
		// 각 클래스 내부에서(A, B, C, D) 객체를 생성하지 않고
		// 외부에서 객체를 주입한 후 D에 getName() 호출 하시오.
		
		// 외부에서 주입 받을 수 있도록 코드를 작성
		System.out.println(a.getB().getC().getD().getName());

	} // end of main

} // end of class

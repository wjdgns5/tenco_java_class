package basic.ch17;

public class Cal {
	
	public Cal() {
		System.out.println("Cal() 부모 생성자 호출");
	}// Cal 생성자
	

	public int sum(int n1, int n2) {
		return n1 + n2;
	} // 원시코드 부모코드 같은 의미

	public int multiply(int n1, int n2) {
		System.out.println("2. 호출");
		System.out.println("여기는 부모 클래스 메서드 입니다.");
		return n1 * n2;
	} // 원시코드 부모코드 같은 의미

	public static void main(String[] args) {

		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 3));
		System.out.println(cal2.multiply(10, 0));

	}

} // end of Cal class 

class Cal2 extends Cal {
	// Cal2 가 Cal 에게 상속받았다. : extends
	
	public Cal2() {
		System.out.println("Cal2() 자식 생성자 호출");
	} // Cal2 생성자 
	

	public int minus(int n1, int n2) {
		return n1 - n2;
	}
	
	// 부모 코드의 기능을 변경하고 싶다면 --> 재정의 하고 싶다면
	// 오버라이드 이라고 한다.
	// 오버라이딩 부모Class의 기능을 재정
	
	
	// a 또는 b --> 논리 연산자 --> 논리 합 --> 두개 중 하나라도 True 라면 True
	// a 그리고 b --> 논리 연산자 --> 논리 곱 --> 전부 True 여야 --> True 이다.
	
//	public int multiply(int n1, int n2) {
//		if(n1 == 0 || n2 == 0 ) { // 두개 중 하나라도 0 이라면
//			System.out.println("0을 입력하시오 마시오");
//		}
		// System.out.println("자식 클래스에서 호출 된 multiply 메서드");
//		return n1 * n2;
//	}
	
	@Override  // <-- 애노티이션, 어노테이션 --> 주석 + 힌트
	public int multiply(int n1, int n2) {
		System.out.println("1. 호출");
		return super.multiply(n1, n2);
		// super 클래스는 부모를 가르킨다.
		// super.multiply()는 부모의 메서드를 가르킨다.
	}
	
} // end of Cal2 class

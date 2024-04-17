package basic.ch06;

public class FunctionMainTest2 {

	public static void main(String[] args) {
		
		// 함수를 언제든지 호출해서 사용할 수 있다.
		
		addNum(10, 10, 10);
		System.out.println(30);
		System.out.println(addNum(10, 10, 10));
		int result = addNum(10, 10, 10);
		System.out.println("result : " +result);
		System.out.println("-------------------");
		
		sayHello("안녕 반가워"); // 함수에 호출을 모양 맞추기이다.
		System.out.println("-------------------");
		
		int result2 = calcSum();
		System.out.println("result2 : " + result2);
		
	} // end of main
	
	// 함수 설계, 함수 사용
	
	// 세개의 정수값을 받아서 덧셈하는 기능을 만들어 보자.
	static int addNum(int n1, int n2, int n3) {
		int result = 0;
		result = n1 + n2 + n3;
		return result;
	}
	
	// 리턴 값이 없는 함수를 만들어 보자.
	static void sayHello(String greeting) {
		System.out.println(greeting + " ^^");
	}
	
	// 매개 변수가 없는 함수를 만들어 보자. 리턴값(return)도 없도록 설계 
	static int calcSum() {
		
		int sum = 0;
		int i;
		for(i = 1; i<= 100; i++) { // 횟수 100번 동작 하는 녀석
			// 0 = 0 + 1;
			// 1 = 1 + 2;
			// 3 = 3 + 3;
			sum = sum+ i; // 결과값 : 5050 
		} // end of for
		return sum;
	} // end of calcSum

} // end of class

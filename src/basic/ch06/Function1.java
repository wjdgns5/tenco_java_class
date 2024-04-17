package basic.ch06;

public class Function1 {
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		int sum;
		
		add(10, 10);
		System.out.println("add 값 : " + add(10, 10) );
		
		calcSum();
		System.out.println("calcSum 값 : " + calcSum() );
		
		// 함수의 호출은 모양 맞추기
		calcSum1(1, 10);
		System.out.println("practice 값 : " + calcSum1(1, 10) );
		
		calcSum1(7, 10);
		System.out.println("practice 값 : " + calcSum1(7, 200) );
		
	} // end of main
	
	static int add(int n1, int n2) {
		int result;
		result = n1 + n2;
		return result;
	}
	
	static int calcSum() {
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) { // 횟수 100 번 동작 하는 녀석
			// 0 = 0 + 1
			// 1 = 1 + 2
			// 3 = 3 + 3
			sum = sum + i; // 5050
		}
		return sum;
	}
	
	// 연습 문제
	// 함수를 수정 -- 파라메터 정수 2개 받을 수 있도록 설계
	// s1. s2 --> 
	// 1, 10 --> 55
	// 7, 200 --> 7 + 8 + 9 .... + 200
	
	static int calcSum1(int n1, int n2) {
		int sum = 0;
		for(int i = n1; i<n2+1; i++) {
			sum = sum + i;
		}
		return sum;
	}
	
} // end of class

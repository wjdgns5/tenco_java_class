package basic.ch03;

public class Operation7 {

	/*
	 * 빠른 평가란?
	 * 논리 연산에 있어 첫 번째 조건이 결과를 결정할 때
	 * 두 번째 조건을 평가 하지 않는 것을 의미한다.
	 * 
	 */
	
	public static void main(String[] args) {
		
		int number = 5; // 변수의 선언과 동시에 초기화
		int index = 0;
		
		// 빠른 평가가 동작하는 식을 만들어 보자.
		//									F
		//						15					<	10
		boolean result = ( (number = number + 10) < 10) && ( (index = index + 2) < 10 );
		System.out.println("현재 number 변수에 값은 : " +number);
		// index의 값이 0 인 이유 앞에 있는 값을 판단하고 False가 나왔기 때문에
		// 굳이 뒤에있는 값 까지 계산하지 않아도 값이 나오기에 Cpu가 계산하지 않음
		System.out.println("현재 index 변수에 값은 : " +index);
		
		System.out.println("========================");
		
		// number 값 재 설정
		number = 5;
		// 논리합을 이용한 빠른 평가 식을 만들어 보자.
		
		//							15	<	10 ||			2	<	10
		//								F		||			T
		result = ((number = number + 10) < 10 || (index = index +2) < 10);
		
		//문제
		System.out.println("number : " + number);
		System.out.println("index : " + index);
		
		
		
		// 도전 문제 number 와 index 반대로 변경 해서 출력해 보자
		int number2 = 5; // 변수의 선언과 동시에 초기화
		int index2 = 0;
	
		

		boolean result2 = (( (index2 = index2 + 2) < 10 ) && (number2 = number2 + 10) < 10);
		System.out.println(" 도전문제 현재 index2 변수에 값은 : " +index2);
		System.out.println(" 도전문제 현재 number2 변수에 값은 : " +number2);
		System.out.println(" 도전문제 현재 변수에 값은 : " +result2);
	
		
		result2 = ( ( (index2 = index2 +2) < 10) || (number2 = number2 + 10) < 10);
		System.out.println(" 도전문제 현재 index2 변수에 값은 : " +index2);
		System.out.println(" 도전문제 현재 numver2 변수에 값은 : " +number2);
		System.out.println(" 도전문제 현재 변수에 값은 : " +result2);
		
		
		
		
		
		
		
		
		
		
	} // end of main

} // end of class

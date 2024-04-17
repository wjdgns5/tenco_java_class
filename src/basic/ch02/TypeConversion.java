package basic.ch02;

public class TypeConversion {
	/*
	 *  형 변환이란?
	 *  데이터 타입을 다른 타입으로 변경 하는 것
	 *  자동 형변환, 강제 형변환
	 */
	
	// 코드의 시작점
	public static void main(String[] args) {
		
		int intDataBox = 100; // int 는 4byte
		double doubleDataBox; // double 은 8byte
		
		//	100
		doubleDataBox = intDataBox;
		// 작은 상자(4byte)에서 큰 상자(8byte)로 들어가는 개념이다.
		System.out.println(doubleDataBox);
		// 자동 형 변환이다.
		System.out.println("-------------------------");
		
		// 강제 형 변환이란?
		final double PI = 3.13159;
		
		// int intBox = PI; // 컴파일러가 작은 상자에 큰 상자로 값을 넣을 수 없다는 것을 알려 줌!!!
		// 컴파일러야 괜찮으니깐 그냥 강제로 넣어
		int intBox = (int)PI;
		System.out.println(intBox); // 값: 3
		// 소수점 값을 그냥 버려 버림
		
		// 연습
		double interestRate;
		int discount;
		
		interestRate = 15.5;
		// discounter <-- 변수에 강제 형 변환해서 값을 넣어 보자.
		discount = (int)interestRate;
		System.out.println(discount); // 값 : 15
		
		// System.out.println(// 식을 작성할 수 있다.);
		System.out.println( (int)7.5 ); // 값: 7

	} // end of main

} // end of class

package basic.ch14;

public class ArrayTest1 {
	// 코드의 시작
	public static void main(String[] args) {

		// 배열이란?
		// 연관된 데이터를 모아서 통으로 관리하기 위한 데이터 타입!!

		// 배열에 특징 *<중요>*
		// 배열은 사용하기 전에 반드시 몇 개의 데이터가 들어갈지
		// 크기를 지정해야 사용할 수 있다.

		// 배열 메모리 공간 만들기
		int[] numbers = new int[3]; // 배열 초기화X, 배열 공간만 선언
		int intBox[] = new int[5]; // 배열 초기화X, 배열 공간만 선언

		// 값 넣기 (초기화)
		// 배열의 길이 ---> 3
		// 인덱스의 길이 -> 2
		numbers[0] = 1000;
		numbers[1] = 1001;
		numbers[2] = 1002;

		// numbers[3] = 1003; --> 인덱스의 길이를 벗어났음, 오류발생
		// 사전기반 지식 - 모든 프로그래밍에 '인덱스 번호에 시작'은 0 부터 시작한다.
		
		// 배열에 선언과 동시에 초기화
		int[] grades = new int[] {5, 3, 1}; // 배열 초기화, 배열 공간 선언
		int[] grades2 = {5, 3, 1}; // new int[] 생략 가능하다.
		
		// 문제 1번
		// 5개의 크기를 가지는 double 타입의 배열을 선언하시오.
		// 단, 배열에 이름은 마음대로 작성
		double[] doubleBox = new double[5]; // double 데이터를 저장하는 배열
		double doubleBox1[] = new double[3];
		
		// 문제 2번
		// 위에서 선언한 배열에 값을 인덱스 0 ~ 2 까지 초기화 하시오
		// 값은 아무것나 상관없음
		doubleBox[0] = 11.0;
		doubleBox[1] = 0.5;
		doubleBox[2] = 1.3;
		// doubleBox[3] = 0.0;
		// doubleBox[4] = 0.0;
		
		// 문제 3번
		// String 타입에 배열을 선언, 배열에 크기는 3개,
		// 선언과 동시에 초기화 하세요.
		String strBox[] = new String[] {"구름", "가을", "하늘"};
		String strBox1[] = {"가", "나", "다"};
		String[] strBox2 = new String[] {"개미","나비", "고양이"};
		String[] strBox3 = {"개미","나비", "고양이"};
		
		System.out.print(strBox[0]+" ");
		System.out.print(strBox[1]+" ");
		System.out.print(strBox[2]+" ");

	} // end of main

} // end of class

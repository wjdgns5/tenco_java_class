package basic.exercise;

public class Exercise1 {
	// 코드의 시작점 (main 함수)
	public static void main(String[] args) {
		
		// 1. 데이터 10, 100, 100 변수를 이름을 정해서 선언하고 동시에 초기화 후 화면에 출력하시오
		// 2. int ageBox 상자에 20을 담기
		// 3. int a = 1; int b = 3; 선언하고 a와 b에 담겨있는 값을 서로 스위칭
		
		int data1 = 10; // 변수에 선언과 동시에 초기화 (값을 넣다.)
		int data2 = 100;
		int data3 = 100;
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		
		// 2. int ageBox 상자에 20을 담기
		int ageBox;
		ageBox = 20;
		
		// 2-1. ageBox 상자의 값을 30으로 변경하고 기존에
		// 담겨 있던 데이터를 다른 곳으로 옮기기
		int oldBox = ageBox;
		ageBox = 30;
		System.out.println("ageBox : " +ageBox);
		System.out.println("oldBox : " +oldBox);
		
		// 3. int a = 1; int b = 3
		// 선언하고 서로 a와 b에 담겨 있는 값을 서로 스위칭
		int a = 1;
		int b = 3;
	
		// 값이 사라지지 않게 하기 위해서는 메모리 상자를 하나 더 만들어서
		// 넣어 두면 된다.
		
		int temp = a;
		// temp = 1;
		
		a = b;
		// a = 3;
		
		b = temp;
		// b = 1;
		
		System.out.println("a : "+ a);
		System.out.println("b : " +b);
	} // end of main

} // end of class

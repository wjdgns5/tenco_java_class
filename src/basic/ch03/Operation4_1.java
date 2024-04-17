package basic.ch03;

public class Operation4_1 {

	/*
	 * 복합 대입연산자란 대입 연산자와 다른 연산자가 함께 쓰이는 것 (산술연산자)
	 */
	public static void main(String[] args) {

		int num1 = 0;

		num1 += 2;
		System.out.println(num1); // 2

		int num2 = 0;

		num2 -= 2;
		System.out.println(num2); // -2

		int num3 = 1;
		num3 *= 3;
		System.out.println(num3); // 3

		int num4 = 10;
		num4 /= 2;
		System.out.println(num4); // 5

		int num5 = 5;
		num5 %= 3;
		System.out.println(num5); // 2

	} // end of main

} // end of class

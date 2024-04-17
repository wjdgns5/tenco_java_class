package basic.exercise;

import java.util.Scanner;

public class Exercise5 {
	// Code Start
	public static void main(String[] args) {

		// 1단계 - 세로 반복의 횟수 (for - 횟수)

		// * - 1
		// ** - 2
		// *** - 3
		// **** - 4
		// ***** - 5

		// "for" + ctrl + space 누르고 use index array 를 클릭

		for (int i = 0; i < 5; i++) { // 5번

		}

		// 2단계
		System.out.print("*");
		System.out.println();
		System.out.print("**");
		System.out.println();
		System.out.print("***");
		System.out.println();
		System.out.print("****");
		System.out.println();
		System.out.print("*****");
		System.out.println();

		System.out.println("-----------------");
		for (int i = 0; i < 1; i++) { // 1번 동작

			System.out.print("*"); // print() 이다

		}
		System.out.println();

		for (int i = 0; i < 2; i++) { // 2번 동작

			System.out.print("*"); // print() 이다

		}
		System.out.println();

		for (int i = 0; i < 3; i++) { // 3번 동작

			System.out.print("*"); // print() 이다

		}
		System.out.println();

		for (int i = 0; i < 4; i++) { // 4번 동작

			System.out.print("*"); // print() 이다

		}
		System.out.println();

		for (int i = 0; i < 5; i++) { // 5번 동작

			System.out.print("*"); // print() 이다

		}
		System.out.println();

		System.out.println("--------------------------");
		// 3단계

		for (int i = 0; i < 5; i++) { // 5번

			// inner for
			// 첫번째 동작 j = 0, j <= 0 --> 한번 동작 -> * -> 줄바꿈
			// 두번째 동작 j = 0, j <= 1 --> 두번 동작 -> ** -> 줄바꿈
			// 세번째 동작 j = 0, j <= 2 --> 세번째 동작 -> *** -> 줄바꿈
			// 네번째 동작 j = 0, j <= 3 --> 네번째 동작 -> **** -> 줄바꿈
			// 다섯번째 동작 j = 0, j <= 4 --> 다섯번째 동작 -> ***** -> 줄바꿈
			for (int j = 0; j < i; j++) { // i번 동작

				System.out.print("*"); // print() 이다

			}
			System.out.println();

		}

	} // end of main

} // end of class

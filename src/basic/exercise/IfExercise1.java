package basic.exercise;

import java.util.Scanner;

public class IfExercise1 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 정수값 이력 받기 활용해서 코드에 흐름을 만들어 주세요
		// 조건문을 완성 하세요

		// 90점 이상 -> A학점 입니다.
		// 80점 이상 -> B학점 입니다.
		// 70점 이상 -> C학점 입니다.
		// 60점 이상 -> D학점 입니다.
		// 59점 이하 -> F학점 입니다.

		System.out.println("성적을 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		int point = sc.nextInt();
		System.out.println("로깅 - 받은 값 확인: " + point);

		if (point >= 90) {
			System.out.println("90점 이상 A학점 입니다.");
		} else if (point >= 80) {
			System.out.println("80점 이상 B학점 입니다.");
		} else if (point >= 70) {
			System.out.println("70점 이상 C학점 입니다.");
		} else if (point >= 60) {
			System.out.println("60점 이상 D학점 입니다.");
		} else {
			System.out.println("59점 이하 F학점 입니다.");
		}
		
		// 열려 있는 자원 닫기
		sc.close();

	} // end of main

} // end of class

package basic.exercise;

import java.util.Scanner;

public class GradeCalculator {

	// 코드의 시작
	public static void main(String[] args) {

		System.out.println("성적을 입력하세요 (0-100): ");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();

		char grade = 'X'; // 초기값을 'X'로 설정해 잘못된 입력을 쉽게 확인
		String message = "잘못된 입력입니다. 성적은 0에서 100 사이로 입력해주세요."; // 추가적인 피드백 메시지

		if (score > 100 || score < 0) {

		} else {

			if (score >= 90) {
				grade = 'A';
				message = "우수한 성적이네요! 계속 좋은 성적 유지하길 바랍니다";

			} else if (score >= 80) {
				grade = 'B';
				message = "좋은 성적입니다. 조금만 더 노력하면 A도 가능해요!";

			} else if (score >= 70) {
				grade = 'C';
				message = "괜찮은 성적이지만, 더 높은 등급을 위해 노력해봅시다.";

			} else if (score >= 60) {
				grade = 'D';
				message = "학습에 더 집중할 필요가 있어요. 도움이 필요하면 말해주세요.";

			} else {
				grade = 'F';
				message = "불합격입니다. 부족한 부분을 파악하고, 추가 학습이 필요해요.";
			}
		}
		
		System.out.println(grade + "학점: " + message);
		
		scanner.close(); // 자원 닫기
		
		// .. 코드를 작성해주세요
		// 힌트 - 비교 연산자와 논리연사자를 활용
		// ...
		


	} // end of main

} // end of class

package basic.ch03;

public class Operation4 {

	/*
	 * 복합 대입연산자란 대입 연산자와 다른 연산자가 함께 쓰이는 것 (산술연산자)
	 */

	/*
	 * 복합 대입연산자란 대입 연산자와 다른 연산자가 함께 쓰이는 것 (산술연산자)
	 */
	public static void main(String[] args) {

		int score = 5;

		// score += 10;
		// System.out.println("점수 확인 : " + score);
		// 도전 연습 --> int score = score + 10;
		// score 변수에 적븐해 기존에 존재하는 값에 더하기 10을 해주세요
		// 15 = 5 + 10;
		// score = score + 10;
		score += 10;
		System.out.println(score);
		System.out.println("--------------------");
		int n1 = 100;
		// n1 이라는 변수에 접근해서 기존에 있는 값에 추가로 10을 더해주세요

		// n1 = n1 + 10;
		n1 += 10;
		System.out.println("n1 : " + n1);

		// score 변수에 접근해서 10점 감소 시켜주세요
		// score = score - 10;
		score -= 10;

		// ! 점수 두배 증가
		score *= 2;
		System.out.println("score : " + score);

		// ! 점수를 반으로 감소
		score /= 2;
		System.out.println("score : " + score);

	} // end of main

} // end of class

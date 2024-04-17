package basic.ch03;

public class Operation2 {

	public static void main(String[] args) {
		
		int result1 = 5 + 3;
		int result2 = 5 - 3;
		int result3 = 5 * 3;
		// 고민해볼 사항
		// int result4 = 5 / 3;
		double result4 = 5.0 / 3;
		int result5 = 5 % 3;
		
		System.out.println("result1 " + result1);
		System.out.println("result2 " + result2);
		System.out.println("result3 " + result3);
		System.out.println("result4 " + result4);
		System.out.println("result5 " + result5);
		
		// 문제
		// 1. (12 + 3) / 3 값을 화면에 출력해 보세요
		// 변수명, 데이터 유형 스스로 결정하고 식을 만들어 보세요
		
		int int_coa = (12 + 3) /3;
		System.out.println("문제1번(int) : " +int_coa);
		
		double double_coa = (12.0 + 3) /3;
		System.out.println("문제1번(double) : " +double_coa);
		
		// 2. (25 % 2) 값을 화면에 출력해 보세요
		// 어떤 수를 2로 나누었을 때 나머지가 0이면 짝수 1이면 홀수
		
		int int_cob = (25 % 2);
		System.out.println("문제2번(int) : " +int_cob);
		
		double double_cob = (25 % 2.0);
		System.out.println("문제2번(double) : " +double_cob);
		
		// 3. 15를 4로 나눈 후, 그 결과를 절대값으로 출력하세요.
		
		int int_coc = 15 / 4;
		System.out.println("문제3번(int) : " + Math.abs(int_coc));
		
		double double_coc = 15.0 / 4;
		System.out.println("문제3번(double) : " + Math.abs(double_coc));
		

	} // end of main

} // end of class

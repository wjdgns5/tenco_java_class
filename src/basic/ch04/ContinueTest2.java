package basic.ch04;

public class ContinueTest2 {
	// 코드의 시작
	public static void main(String[] args) {

		// 1부터 100까지 숫자 중에 3의 배수를 출력 하세요.

		// 1~100 --> 반복적인 패턴이 확인
		// 만약 3의 배수라면 화면에 숫자를 출력하세요.
		// 반복문은 for 문을 사용해 주세요.

//		for (int i = 1; i < 101; i++) {
//			// 3의 배수일 때만 화면에 출력 해
//			if ((i % 3) == 0) {
//				System.out.println(i);
//			}
//		}
		// ****************************************
//		int start = 1;
//		int end = 101;
//
//		while (start < end) {
//			start++;
//			if( (start % 3) == 0) {
//				System.out.println(start);
//			}
//		}
		
		// 풀이 1 *************************
		
//		int i = 1;
//		
//		while(i < 101) {
//			if(i%3==0) {
//				System.out.println("i의 값 : " +i);
//			}
//			i++;
//		}
		
		// 풀이 2 ********* 특정 조건이 되었을 때 반복문을 멈추어라
		
		int i = 1;
		boolean flag = true;
		// 풀이
		while(flag) {
			System.out.println("3의 배수 : " +i);
			
			// 특정 조건 --> 멈추기
			if(i == 100) {
				flag = false;
				// i == 100
			}
			i++; // i  == 101
		}
			
	} // end of main

} // end of class

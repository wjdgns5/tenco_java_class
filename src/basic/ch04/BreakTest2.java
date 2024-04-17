package basic.ch04;

public class BreakTest2 {
	// 코드 시작
	public static void main(String[] args) {

		// BreakTest1의 문제 내용
		// for문 대신해서 --> while문으로 변경해서 결과를 출력해보세요.
		// 소수 7이면 반복문을 멈추어라.

//		int start = 1;
//		int end = 11;
//		while (start < end) {
//			
//			System.out.println("i의 값 : " +start);
//			
//			start++;
//			if (start % 7 == 0) {
//				break;
//			} // end of if
		
		
		// for 문 대신에 --> while 변경해서 결과를 출력해보세요
				// 만약 소수 7이면 반복문을 멈추어라

				int i = 1;
				while (i < 11) {
					
					// 단독 if 구문은 - 수행이 될 수도 있고 안될 수도 있다. 
					if (i % 7 == 0) {
						// 중간에 멈추어라
						break;
					}
					System.out.println("i의 값 : " + i);
					i++;
				}

		
//		} // end of while

	} // end of main
} // end of class

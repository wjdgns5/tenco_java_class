package basic.ch04;

public class whileTest2 {
	// 코드의 시작 (메인함수)
	public static void main(String[] args) {
		
		// start = 0;
		// end = 사용자가 입력한 값
		// 화면에 0부터 사용자가 입력한 값 까지 반복해서 출력해 보자.
		
		// 특정 조건일 때 반복문을 종료 시켜 보자.
		boolean flag = true; // 깃발
		int start = 1;
		int end = 3;
		
		while(flag) {
			if(start == end) {
				System.out.println("if 구문이 동작함");
				flag = false;
				return;
				
			} // end of if
			
			System.out.println("start : " + start);
			
			start++;
		} // end of while
		
	} // end of main

} // end of class

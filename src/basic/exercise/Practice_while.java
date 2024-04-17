package basic.exercise;

public class Practice_while {
	// 코드의 시작
	public static void main(String[] args) {
		
		int start = 1;
		int end = 100;
		int sum = 0;
		
		while(start <= end) {
			sum = sum + start;
			System.out.println("start : " + start);
			start++;
		} System.out.println("sum : " + sum);
	
	} // end of main

} // end of class

package basic.ch04;

import java.util.Scanner;

public class OddSumCalculator {

	public static void main(String[] args) {
		// 사용자의 입력값을 받아서 1부터 x 까지 숫자에 홀수를 덧셈하고 출력 하시오.

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int sum = 0;
		for(int i=1; i<=a; i++) {
			if(i%3==0) {
				
				sum +=i;
				System.out.print(i+" ");
			}
		} System.out.println("최종합계 "+ sum);
		
		
		System.out.println("---------------------");
		// 3번(0, 1, 2) 반복
		for (int j = 0; j < 3; j++) {
			// i 는 0 부터 2까지 출력  
			for (int i = 0; i < 3; i++) {
				System.out.print(i+" ");
			}
			
			System.out.println();
		}

	} // end of main

} // end of class

package basic.ch04;

import java.util.Scanner;

public class EvenSumCalculator {
	// 코드의 시작
	public static void main(String[] args) {
		
		// ctrl + shift + o 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력 하세요 : ");
		
		int MaxNumber = sc.nextInt();
		// 1 <--		10 -> 2 + 4 + 6 + 8 + 10;
		int sum = 0;
		
		// 10
		// 반복적인 패턴이 확인 된다.
		// 1 2 3 4 5 6 7 8 9 10; 10번 반복
		// i = i + 2 --> i +=2;
		for(int i=2; i <= MaxNumber; i = i +=2) {
			//1 =  0  + 1;
			//2 =  1  + 2;
			//6 =  3  + 3;
			sum = sum + i;
			System.out.println("sum : " + sum + " \n");
		}
		System.out.println("sum : " + sum);
		
	} // end of main

} // end of class

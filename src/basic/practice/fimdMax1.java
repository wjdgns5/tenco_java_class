package basic.practice;

import java.util.Scanner;
import java.util.Iterator;

public class fimdMax1 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		int[] a = new int[5]; // a 배열에 5 라는 값을 지정 --> a의 배열은 5 이다.
		for (int i = 0; i < a.length; i++) { // i값을 0번부터 4번까지 5번 반복
			a[i] = sc.nextInt(); // a[i]번까지 5번 반복
			
		}
		System.out.println(findMax1(a));

	} // end of main
	
	static int findMax1(int[] b ) {
		
		int max = b[0]; // max의 값은 b[0]번 지정
		
		for (int i = 0; i < b.length; i++) { //
			if(b[i]>max) {
				max = b[i];
			}
		}
		return max;	
	}

}

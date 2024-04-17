package basic.practice;

public class findMax {
	// 코드의 시작
	 
public static void main(String[] args) {
		
		findMax(10, 20);
		
	} // end of main
	
	static int findMax(int n1, int n2) {
		int result = 0;
		result = n1 > n2 ? n1 : n2;
		System.out.println("두 수중에서 가장 큰 값 : " +result);
		return result;
	} // end of findMax
	
} // end of class

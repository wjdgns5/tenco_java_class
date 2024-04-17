package basic.practice;

public class square {
	// 코드의 시작
	public static void main(String[] args) {
		
		square(10);
		
		System.out.println("result : "+square(10));

	} // end of main
	
	static int square(int n1) {
		int result = 0;
		result = n1 * n1;
		return result;
	} // end of square

} // end of class

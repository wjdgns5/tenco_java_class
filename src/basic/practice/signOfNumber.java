package basic.practice;

public class signOfNumber {
	// 코드의 시작
	public static void main(String[] args) {
		
		signOfNumber(1);

	} // end of main
	
	static int signOfNumber(int n1) {
		
		if(n1 > 0) {
			System.out.println("positive");
		} else if( n1 == 0) {
			System.out.println("zero");
		} else if(n1 < 0) {
			System.out.println("negative");
		}
		return n1;
	} // end of signofNumber

} // end of class

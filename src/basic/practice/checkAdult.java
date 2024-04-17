package basic.practice;

public class checkAdult {
	// 코드의 시작
	public static void main(String[] args) {
		
		checkAdult(17);
		
	} // end of main
	
	static int checkAdult(int age) {
	if(age >= 18) {
		System.out.println("18세 이상입니다. true");
	} else {
			System.out.println("18세 미만입니다. false");
		}
		return age;
	} // end of checkAdult

} // end of class

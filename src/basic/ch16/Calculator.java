package basic.ch16;
/*
 * 메서드 오버로딩이란?
 * 같은 이름의 메서드, 함수를 여러개 정의하는 것을 말한다.
 * 단, 매개변수의 개수가 다른던지 해야한다.
 */
public class Calculator {
	// 코드의 시작
	
	// 덧셈 메서드 생성
	public int add(int a, int b) {
		return a + b;
	} // 정수
	
	public double add(double a, double b) {
		return a + b;
	} // 실수
	
	public int add(int a, int b, int c) {
		return a + b + c;
	} // 정수
	
	// 문자열 더하는 기능
	public String add(String str1, String str2) {
		return str1 + str2;
	} // 문자열

} // end of class

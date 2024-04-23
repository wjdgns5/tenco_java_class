package basic.ch16;

public class ziro {
	
	// 메서드 연습하기 
	
	public int sum(int a, int b) {
		return a + b;
	} // sum 함수
	
	public int sum(int a, int b, int c) {
		return a + b + c;
	} // int 타입의 sum 메서드 오버로딩 -> 기존 매개변수의 개수에서 1개 추가했음
	
	public double sum(double a, double b) {
		return a + b;
	}
	
	public double sum(double a, double b, double c) {
		return a + b + c;
	} // double 타입의 sum 메서드 오버로딩 -> 기존 매개변수의 개수에서 1개 추가

	public static void main(String[] args) {		
	}
} // end of class

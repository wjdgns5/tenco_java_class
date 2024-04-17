package basic.ch02;

public class TriangleAreaCalculator {

	public static void main(String[] args) {
		
		// 삼각형에 밑변 BASE, 단 상수로 선언
		float Base = 10.0f;
		
		// 삼각형의 높이 HEIGHT, 단 상수로 선언
		float HEIGHT = 5.0f;
		
		// 결과 값을 area 변수에 저장
		float area = (Base * HEIGHT)/2;
		
		System.out.println(" 삼각형의 면적 : " + area );
//		String result = " 삼각형의 면적 : " + area;
//		System.out.println(result);
		
	} // end of main

} // end of class

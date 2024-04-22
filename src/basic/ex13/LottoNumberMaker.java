package basic.ex13;

// import : 가지고 오다. 수입하다.
import java.util.Random;

public class LottoNumberMaker {
	
	// 멤버 변수
	private String version = "1.0.0";
	
	
	// main 함수 static 함수이다.
	public static void main(String[] args) {
		
		System.out.print( makeNumber() +"\t");
		System.out.print( makeNumber() +"\t");
		System.out.print( makeNumber() +"\t");
		System.out.print( makeNumber() +"\t");
		System.out.print( makeNumber() +"\t");
		System.out.print( makeNumber() +"\t");
		
	} // end of main
	
	// 인스턴스에 속하지 않는 함수 만들기
	public static int makeNumber() {
	// static 함수안에 멤버 변수를 사용할 수 없다.
	// 메모리가 뜨는 순서 !! 를 이해해야 한다. 
//	 	System.out.println("ver : " +version);
		
		
		// 자바 도구 -- 표준 API
		// 난수 발생기 --> 랜덤 번호를 생성
		// 앞 자리가 대문자 이면 참조함수 이다.
		Random random = new Random();
		int resultNumber = random.nextInt(45) + 1; // 1 ~ 45 까지 

		return resultNumber;
	}

}

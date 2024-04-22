package basic.ex13;

import basic.ex13.LottoNumberMaker;

// 동작을 확인하고 이해할 수 이도록 주석으로 확인
// 잘못된 부분이 있다면 코드를 수정해주세요
public class LottoGame3 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		int tempBox = 0;
		// 테스트 값 : 5, 1, 9, 7, 2, 3
for(int i =0; i<7; i++) {
		if (gameNumber1 > gameNumber2) {
			tempBox = gameNumber1;
			gameNumber1 = gameNumber2;
			gameNumber2 = tempBox;
		}
		if (gameNumber2 > gameNumber3) {
			tempBox = gameNumber2;
			gameNumber2 = gameNumber3;
			gameNumber3 = tempBox;
		}
		if (gameNumber3 > gameNumber4) {
			tempBox = gameNumber3;
			gameNumber3 = gameNumber4;
			gameNumber4 = tempBox;
		}
		if (gameNumber4 > gameNumber5) {
			tempBox = gameNumber4;
			gameNumber4 = gameNumber5;
			gameNumber5 = tempBox;
		}
		if (gameNumber5 > gameNumber6) {
			tempBox = gameNumber5;
			gameNumber5 = gameNumber6;
			gameNumber6 = tempBox;
		}
}
		System.out.println(gameNumber1);
		System.out.println(gameNumber2);
		System.out.println(gameNumber3);
		System.out.println(gameNumber4);
		System.out.println(gameNumber5);
		System.out.println(gameNumber6);

	} // end of main

} // end of class

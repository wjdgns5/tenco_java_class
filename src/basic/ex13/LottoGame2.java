package basic.ex13;

import basic.ex13.LottoNumberMaker;

public class LottoGame2 {

	public static void main(String[] args) {
		// static 변수 --> 클래스 변수라고도 불린다.
		int gameNumber1 = LottoNumberMaker.makeNumber();
		int gameNumber2 = LottoNumberMaker.makeNumber();
		int gameNumber3 = LottoNumberMaker.makeNumber();
		int gameNumber4 = LottoNumberMaker.makeNumber();
		int gameNumber5 = LottoNumberMaker.makeNumber();
		int gameNumber6 = LottoNumberMaker.makeNumber();

		// 전체 1~6 까지 나온 결과값을 오름 차순으로 정렬
		// 단, 중복 값 제외

		System.out.println(gameNumber1 + "\t");
		System.out.println(gameNumber2 + "\t");
		System.out.println(gameNumber3 + "\t");
		System.out.println(gameNumber4 + "\t");
		System.out.println(gameNumber5 + "\t");
		System.out.println(gameNumber6 + "\t");

		// 수식을 작성해주세요
		// 만약 if --> 반복문 사용 금지, if문 6개로 사용
		int tempBox = 0;
		// 5 1 9 7 2 3
		
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

		if (gameNumber5 >= gameNumber6) {
			tempBox = gameNumber5;
			gameNumber5 = gameNumber6;
			gameNumber6 = tempBox;
		}

		System.out.print(gameNumber1 + "\t");
		System.out.print(gameNumber2 + "\t");
		System.out.print(gameNumber3 + "\t");
		System.out.print(gameNumber4 + "\t");
		System.out.print(gameNumber5 + "\t");
		System.out.print(gameNumber6 + "\t");

	} // end of main

} // end of class

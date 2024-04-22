package basic.ch14;

public class ArrayTest3 {
	// 코드의 시작
	public static void main(String[] args) {

		char alphabet[] = new char[26];

		char ch1 = 'A';
		alphabet[0] = ch1;

		char ch2 = 'B';
		alphabet[1] = ch2;

		char ch3 = 'C';
		alphabet[2] = ch3;

		char ch26 = 'Z';
		alphabet[25] = ch26;

		System.out.println("-------------------");
		System.out.println(alphabet[3]);
		if (alphabet[3] == 0) {
			System.out.println("동작함");
		}
		System.out.println("-------------------");

		// 배열은 반복문과 함께 많이 사용된다.
		int forCount = 0;
		int eCount = 0;
		for (int i = 0; i < alphabet.length; i++) {
			// alphabet[i];
			System.out.println(alphabet[i]);
			forCount++;

			if (alphabet[i] != 0) {
				// char의 기본값 0 이다.
				// char 의 값이 0 이 아니라면 값이 들어있다는 뜻이다.
				// 따라서 char의 값이 0 이 아니라면 eCount에 1를 추가해라.
				eCount++;
			}
		}
		System.out.println("for 동작 횟수 : " + forCount);
		System.out.println("배열안에 요소의 개수는? : " + eCount);

	} // end of main

} // end of class

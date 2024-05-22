package io;

import java.io.IOException;

public class MySystemIn2 {

	public static void main(String[] args) {

		// 키보드에서 데이터를 응용 프로그램 안으로 넣기
		System.out.println("알파벳 하나늘 쓰고 Enter를 누르세요");

		// 바이트 기반으로 동작한다. --> 0과 1로 구성되어 있다.
		// 정수 -> byte, shrot, int, long

		int i;
		// 한 바이트씩 키보드에 값을 읽어라
		try {
			while ((i = System.in.read()) != '\n') {
				System.out.println("i : " + i);
				System.out.println("(char) i : " + (char) i);
			}
//			i = System.in.read();
//			System.out.println("-------------");

			// 출력
//			System.out.println("i : " + i); // 알파벳이 숫자로 나온다

			// 문자로 변환하고 싶다면 --> 컴퓨터 안에 있는 문자표를 활용(인코딩)
//			System.out.println((char) i); // 형 변환 시켜서 출력한다.

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

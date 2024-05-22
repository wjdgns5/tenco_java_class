package io.file.ch04;

import java.io.InputStreamReader;
import java.io.OutputStream;

public class SingleCharReader {

	public static void main(String[] args) {

		// 문자 기반에 InputStreamReader 사용 방법
		// ** 중요 **
		// InputStreamReader 는 한 바이트씩 데이터를 읽는 것이 아니라
		// 하나의 문자 단위로 읽음 !!!

		System.out.println("문자 하나를 입력하세요");

		// try catch resource --> try 앞에 괄호 () 사용하면 된다.
		try (InputStreamReader isr = new InputStreamReader(System.in)) {
			// 한 <-- 통으로 읽는다. --> InputStreamReader
			// 한 <-- 한 바이트로는 못 읽음 --> InputStream
			int charData = isr.read(); // 사용자가 키보드의 값을 입력할 때 까지 대기한다.
			// -1 --> 파일 끝 (EOF) 가 아니라면 출력
			if (charData != -1) { // -1은 문자를 읽다가 문자를 다 읽으면 반환하는 값을 의미한다.
				// char --> 2byte 크기 (한글은 2 byte로 거의 모든 글자 표현이 가능하다.)
				System.out.println("사용자가 입력한 값 : " + (char) charData);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("뭔가 잘못 되었습니다.");
			e.printStackTrace();
		}

	} // end of main

} // end of class

package io.file.ch02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileOutputStream {
	// 코드에 시작점
	public static void main(String[] args) {

		// 현재 시간을 찍고 (시작)
		long start = System.nanoTime(); // (더 정밀한 현재 시간을 출력한다.)

		// 데이터가 존재
		String data = "Hello, Java FileOutputStream \n 안녕반가워";

		// 1. 파일에다가 데이터를 저장하고 싶다면 (바이트 기반 필요)
		// JAVA 8 버전부터 제공
		// try-catch-resource

		// 파일이 없으면 자동으로 생성이 된다.
		// 파일에 있는 글자가 새롭게 붙일 거라면 true로 지정해야 한다.
		// 파일에 있는 글자를 덮어쓰기 할겨면 false로 지정해도 되고 안적어도 된다.
		try (FileOutputStream fos = new FileOutputStream("output.txt", false)) {
			// 수행 코드
			// data (String) 가지고 있는 문자열들을 바이트 배열로 반환 처리하는 기능
			// byte[] bytes = data.getBytes();
			byte[] bytes = { 72, 101, 108, 108, 111 }; // Hello
			System.out.println("bytes : " + bytes);
			for (int i = 0; i < bytes.length; i++) {
				System.out.println("bytes[i] : " + bytes[i]);
			}

			// 연결된 스프림을 활용해서 Byte 배열을 파일에다가 흘려 보냄
			fos.write(bytes);

			System.out.println("파일출력 스트림을 통해서 데이터를 씀");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없음");
		} catch (IOException e) {
			e.printStackTrace(); // 스택으로 추적을 한다.
		}
		// 동작 이해해 보기
		// 파일에 바이트 단위로 데이터를 쓰고
		// 그 파일을 열였을 때 글자로 보이는 이유는 파일을 읽는 프로그램이
		// 파일 내에 바이트 데이터를 문자로 해석해서(문자 인코딩) 보여 주었다.
		
		// 현재 시간을 측정하고 싶다 (종료)
		long end = System.nanoTime();
		
		// 종료시간 - 시작시간 -> 소요 시간
		long duration = end - start;
		
		// 나노초는 10억 분에 1 -> 0.000304
		System.out.println("소요시간 : " + duration);

//		try {
//			FileOutputStream fos = new FileOutputStream("output.txt"); // 예외처리 try-catch()
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			fos.close(); // 자원을 사용하고 나서 닫아줘야 한다.
//			}

	} // end of main

} // end of class

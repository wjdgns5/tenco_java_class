package io.file.ch04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 문자 기반 스트림 + 보조 문자 기반 스트림 확인
// 한줄 입력 하면 종료 됨
// 여러 줄 반복적으로 동작할 수 있도록 기능을 추가해주세요.

public class StandardInputExample {

	public static void main(String[] args) {

		// 데이터를 통으로 관리 하고 싶다면 --> 자료구조 --> 적절한 자료 구조를 선택
		List<String> lines = new ArrayList<String>();

		try (InputStreamReader isr = new InputStreamReader(System.in, "UTF-8"); // 기반 스트림
				BufferedReader br = new BufferedReader(isr); // 보조 스트림
		) {

			System.out.println("더 많은 텍스트를 입력 하세요 (한줄 단위) -> 엔터 사용할 때 까지");

			String line;
			// "" --> 엔터 --> line.isEnpty() --> False --> 실행에 종료가 된다.
			while ((line = br.readLine()) != null && !line.isEmpty()) {
				lines.add(line);
				System.out.println("입력 확인 : " + line);
			}

			for (String data : lines) {
				System.out.println(data);
			}

			System.out.println("프로그램 종료 처리");

		} catch (Exception e) {
			// TODO: handle exception
		}

	} // end of main

} // end of class

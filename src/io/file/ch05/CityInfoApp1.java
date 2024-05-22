package io.file.ch05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class CityInfoApp1 {

	public static void main(String[] args) {

		System.out.println("도시 이름을 입력 하세요(예 : seoul, NewYork )");

		// try() - catch - resource
		try (Scanner scanner = new Scanner(System.in)) {

			String city = scanner.nextLine();
			String fileName = city + ".txt";
			// (바이트 기반)은 stream 기반
			// 1. 파일에 있는 데이터를 응용프로그램으로 가져와야 한다. (문자 기반) -> Reader

			// FileReader (문자 기반 스트림 이다), 단 주의할 사항
			// 파일을 있을 때 시스템의 기본 문자 인코딩을 사용합니다. 또는 운영체제, 지역에 따라 다름
			try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr)) {
				System.out.println(city + " 에 대한 정보 입니다.");

				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}

			} catch (Exception e) {
				System.out.println("해당 파일을 찾을 수 없습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end of main

} // end of class

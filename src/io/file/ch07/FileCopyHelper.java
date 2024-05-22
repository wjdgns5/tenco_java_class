package io.file.ch07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopyHelper {

	// 파일 복사하는 함수
	public static void copyFile(String readFilePath, String writerFilePath) {

		// try() -catch - resource
		try (FileReader fr = new FileReader(readFilePath); FileWriter fw = new FileWriter(writerFilePath)) {

			int c;
			while ((c = fr.read()) != -1) {
				fw.write(c);
			}
			System.out.println("파일 복사 완료 : " + writerFilePath);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 복사 중에 오류 발생");
		} // end of try() -catch - resource

	} // end of copyFile()

	// 파일 복사 - 버퍼 기능 활용
	public static void copyFileWithBuffer(String readFilePath, String writeFilePath) {
		// try() -catch -resource
		try (
				// 보조 스트림 - 기반스트림
				BufferedReader bufferedReader = new BufferedReader(new FileReader(readFilePath));
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writeFilePath));) {
			// 버퍼를 활용하는 버퍼에 크기를 지정할 수 있다.
			char[] buffer = new char[1024];
			int numCharsRead; // 읽은 문자 수

			while ((numCharsRead = bufferedReader.read(buffer)) != -1) { // 배열의 크기만큼 읽어온다.
				bufferedWriter.write(buffer, 0, numCharsRead);
				System.out.println("numCharRead : " + numCharsRead);
			}
			System.out.println("버퍼를 사용한 파일 복사 완료 : " + writeFilePath);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("버퍼를 사용한 파일 복사 중 오류 발생");
		}

	}

	// 메인 함수
	public static void main(String[] args) {

		FileCopyHelper.copyFile("seoul.txt", "copy");
		System.out.println("--------------------------------");
		FileCopyHelper.copyFileWithBuffer("NewYork.txt", "copyNewYork.txt");

	} // end of main

} // end of class

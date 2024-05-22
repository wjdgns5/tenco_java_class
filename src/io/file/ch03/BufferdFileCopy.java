package io.file.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferdFileCopy {

	public static void main(String[] args) {
		// 기반 스트림 + 보조 스트림을 활용해서
		// 파일 복사 기능을 만들고
		// 소요 시간을 측정하시오.

		// ( 바이트 기반 스트림을 활용 )
		// 입력스트림 --> 출력스트림 --> 입력 --> 출력에 반복 완료

		String sourceFilePath = "C:\\Users\\KDP\\a.zip"; // 파일 경로
		String destinationFilePath = "a.zip"; // 목적지 파일 경로

		try (FileInputStream fis = new FileInputStream(sourceFilePath);
				FileOutputStream fos = new FileOutputStream(destinationFilePath);
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			// 코드 수행 부분
			int data;

			while ((data = bis.read()) != -1) { // 한 바이트 씩 읽어서
				// 파일에 출력
				bos.write(data); // 한 바이트 씩 읽은 데이터를 출력하고
			}
			bos.flush(); // 매번 입출력을 발생 하는 것이 아니라 한번에 입출력을 사용

		} catch (Exception e) {
		}

	} // end of main
} // end of class

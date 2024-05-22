package io.file.ch03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {
	
	public static void main(String[] args) {
		
		// 스트림은 기본적으로 단방향 이다. - 한 방향으로 데이터를 흘려 보낼수 있다는 뜻
		// 입력 스트림 , 출력 스트림 두개가 필요하다.
		
		// 파일 경로가 필요하다. (복사할 대상 )
		// 사진 아무거나 여러개 압축해서 임의의 경로에 넣어 지정한 것이다.
		String sourceFilePath = "C:\\Users\\KDP\\a.zip";
		// 목적지 파일
		String destinationFilePath = "a.zip";
		
		// 소요시간 확인
		long startTime = System.nanoTime();
		
		try(FileInputStream in = new FileInputStream(sourceFilePath);
					FileOutputStream out = new FileOutputStream(destinationFilePath)){
			
			int data;
			while( (data = in.read() ) != -1 ) { // 한 바이트 씩 읽어서
				// 파일에 출력
				out.write(data); // 한 바이트 씩 읽은  데이터를 출력하고 
			}
			
			System.out.println("입력스트림 --> 출력스트림 --> 입력 --> 출력에 반복 완료");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		long endTime = System.nanoTime();
		long duration = endTime = startTime;
		System.out.println("복사의 소요 시간은 : "+ duration);
		
		// 소요 시간을 초 단위로 변환 --> 포맷팅 이라고 한다.
		double seconds = duration / 1_000_000_000.0; // 더블 타입이 정확해서
		// String 클래스에 format 메서드 사용해 보기
		// .6f 은 소수점 6째 짜리까지 보여라
		String resultFormat = String.format("소요 시간은 : %.6f초 입니다.", seconds); 
		// % 는 포맷 지정장의 시작 이다.
		// f 지정자는 float, double 유형의 변수를 인자로 받아 처리 하겠다는 의미
		
		System.out.println(resultFormat);
		
		
	} // end of main

} // end of class

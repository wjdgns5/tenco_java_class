package io.file.ch02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class MyBufferedOutputStream {

	public static void main(String[] args) {
		
		// 현재 시간을 찍고 (시작)
	// 	System.currentTimeMillis(); // 1000 / 1초
		long start = System.nanoTime(); // (더 정밀한 현재 시간을 출력한다.)
		
		String data = "기반 스트림 + 보조 스트림을 활용해보자";
		// try -catch - resource 문법 활용
		try (
				// 기반 스트림
				// 파일이 없으면 자동으로 생성이 된다.
				FileOutputStream fos = new FileOutputStream("output2.txt");
				
				// 보조 스트림
				BufferedOutputStream bos = new BufferedOutputStream(fos);) {
			
			// 코드 수행 부분
			byte[] bytes = data.getBytes();

			// 보조 스트림 (버퍼)
			bos.write(bytes);

			// 간혹 버퍼의 데이터가 남아 있다면 중복된 데이터를 쓸 수 있다.
			// 한번 사용한 다음에 flush()를 해야한다.
			bos.flush(); // flush --> 물을 내리다. (비우다 ) -- 반드시 기억해야 하는 문법

			System.out.println("보조 스트림을 활용한 파일 출력 완료");
			
			// 시간 측정을 해보고 싶다
			

		} catch (Exception e) {
			e.printStackTrace(); // 스택으로 추적한다.
		}
		
		// 현재 시간을 측정하고 싶다 (종료)
		long end = System.nanoTime();
		// 종료시간 - 시작시간 -> 소요 시간
		
		long duration = end - start;
		System.out.println("소요시간 : " +duration);
		// 나노초는 10억 분에 1 -> 0.000304

	} // end of main

} // end of class

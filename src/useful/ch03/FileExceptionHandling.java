package useful.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
	// 메인 쓰레드
	public static void main(String[] args) {

		FileInputStream fis = null;

		try {
			// fis = new FileInputStream("test1.txt"); // test1.txt 파일이 없다.
			fis = new FileInputStream("demo.txt"); // demo.txt 파일이 있다.
			// return; // : return 구문보다 강한 것 finally 이다.
			// return; // finally 까지만 출력한다. 뒤에 출력X
		} catch (FileNotFoundException e) {
			System.out.println("catch 구문 실행!!!");
			e.printStackTrace(); // 오류가 발생한 시점을 추적해 주는 기능
		} finally {
			// 반드시 수행 되어야 하는 코드 영역
			// 심지어 return 키워드를 만나더라도 여기는 수행이 된다.
			System.out.println("finally 블록 수행");
			// fis.close(); // 닫는 시점에 fis. <-- 객체가 생성 안되어 있을 수 있다.
			// fit.close(); // try -catch 사용이 된다.
			
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("비정상 종료 되지 않았어요~");

	} // end of main

} // end of class

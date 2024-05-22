package io.file.ch08;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// ObjectOutputStream
// ObjectInputStream 공부

public class MyObjectStream {
	
	public static void main(String[] args) {
		
		try(
				FileInputStream fis = new FileInputStream("cloud9.txt");

				// 객체 직렬화
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
				) {
			
			Person person = new Person("손흥민", 30);
			oos.writeObject(person);
			
			if(fis.read() != -1) {
				System.out.println((char)fis.read());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("----------------------------");
		
		// 객체 역 직렬화 
		try(
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.txt"));
				) {
			// 문자 기반으로 데이터를 읽으면 <-- 하나 하나 String 값 추출해서 코드상에 활용할수 있도록
			// Object 만드는 코딩을 해야한다. name:, 10 <---
			Person person = (Person)ois.readObject(); // 다운캐스팅
			System.out.println(person);
			
		} catch (Exception e) {
			e.printStackTrace(); // 예외 처리 흐름 생성 가능 
		}
		
	} // end of main

} // end of class

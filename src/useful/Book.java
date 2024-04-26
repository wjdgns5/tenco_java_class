package useful;

import java.lang.*;
// lang 모든 녀석들을 가지고 온다.

/*
 *  Object 클래스는 모든 클래스의 최상위 클래스이다.
 *  import jvav.lang.*; 프로그래밍시 import 하지 않아도 자동으로 가지고 온다.
 *  자바는 단일 상속만 지원 합니다. 단, Object 클래스를 제외 하고!!
 */
public class Book extends Object {
	// Obejct 파일을 직접 만든것이 아니라 Java에서 만들어 준것
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// Object -> toString();
	// 오버라이드 단축키 tos + ctrl + shift
	
	@Override
	public String toString() {
		
		return "[" + title + ", " + author + "]";
	}
	
	// 테스트 코드
	public static void main(String[] args) {
		Book book = new Book("데미안", "헤르만 헤세");
		System.out.println(book); // String 클래스가 재정의 한다. @Override
		System.out.println("-------------------------");
		String str1 = new String("안녕"); // String 클래스가 재정의 한다. @Override
		System.out.println(str1);
	}
}

package useful;

public class StringTest2 {
	
	public static void main(String[] args) {
		
		String str3 = "abc";
		String str4 = "abc"; // 불변
		
		System.out.println(System.identityHashCode(str3)); // 원시 HashCode 값 출력
		System.out.println(System.identityHashCode(str4)); // 원시 HashCode 값 출력
		
		str3 = str3 + " :def "; // abc 문자열이 사라지는 것이 아니고 새로 생김
		System.out.println(System.identityHashCode(str3)); // 원시 HashCode 값 출력
		
		// 리터럴 타입으로 생성한 String 한번 생성하면 불변이다.
		
	} // end of main

} // end of class

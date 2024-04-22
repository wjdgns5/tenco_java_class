package basic.ch14;

public class ArrayTest2 {

	public static void main(String[] args) {

		String name[] = new String[5]; // 5칸 짜리 메모리 공간 할당

		// (생성) - Create
		name[0] = "김씨";
		name[1] = "나씨";
		name[2] = "박씨";
		// name[3] = null
		// name[4] = null

		// (조회) - Read
		System.out.println(name); // 주소값
		System.out.println(name[0]); // 인덱스 0
		System.out.println(name[1]); // 인덱스 1
		System.out.println(name[2]); // 인덱스 2
		System.out.println(name[3]); // 인덱스 3
		System.out.println(name[4]); // 인덱스 4
		// System.out.println(name[5]); // 오류 발생 -> 배열의 크기보다 오버 됨

		// (수정) - Upadte
		name[0] = "Mr . kim";
		name[1] = "Mr . Na";
		name[2] = "Mr . Park";

		// (삭제) - Delete
		name[0] = null;
		name[1] = null;
		name[2] = null;
		
		// 자바에서 null 값은 할당 되지 않는 상태를 의미한다.
		// Object 타입에서 사용 가능
		// ex) boolean = false
		
		// 1단계
		// 배열에 길이와 인덱스 길이에 대한 이해 --> 인덱스의 길이는 N-1 이다.
		System.out.println("배열에 크기 : " + name.length);
		System.out.println("인덱스의 크기(n -1) : " + (name.length -1));
		
		// 문제 2
		// 배열의 크기가 50개이면 인덱스의 길이는 얼마인가? --> 49
		// 배열의 크기가 100이면 인덱스의 길이는 얼마인가> --> 99
		// 배열의 크기가 375이면 인덱스의 길이는 얼마인가> --> 374
	
	} // end of main

} // end of class

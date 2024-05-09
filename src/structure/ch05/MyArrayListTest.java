package structure.ch05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import basic.ch22.Student;

public class MyArrayListTest {
	// 메인 쓰레드
	public static void main(String[] args) {

		List mList; // 리스트 인터페이스 계열

		// ArrayList 클래스의 인스턴스화 처리
		ArrayList List = new ArrayList();
		// 제네릭은 추후 더 설명
		// 제네릭은 타입의 명시화 한다.
		ArrayList<Integer> nums = new ArrayList<Integer>();

		// 변수에 선언과 동시에 초기화 ---> 값이 들어가 있는 상태인가? -> 아니다, 공간만 선언한 것이다.
		// 뒤에 Integer 타입추론이 가능하여 생략 가능하다.
		// 값을 동시에 추가 하고 싶다면
		ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

		// String 값만 들어갈 수 있다.
		ArrayList<String> vocabulary = new ArrayList<String>();

		// 뒤에 String 타입추론이 가능하여 생략 가능하다.
		ArrayList<Student> members = new ArrayList<>();

		// 클래스의 정의 된 기능을 알아 봐야 한다.
		// 값 추가 하는 방법
		List.add(3);
		List.add(null);
		List.add(1, 10); // 인덱스 1번 위치에 Element 요소 10을 삽입, 기존 요소가 있다면 뒤로 자동 이동 (밀어내기)
		System.out.println("갑 추가 확인 : " + List);

		Student student = new Student("홍박사");
		System.out.println(student);

		// 값 삭제하는 방법
		List.remove(2); // 인덱스(index) 2번 요소를 삭제해라.
		System.out.println("갑 삭제 확인 : " + List);

		// 값 전체 삭제하는 방법
		// List.clear();
		System.out.println("전체 삭제 확인 : " + List);

		// 리스트 사이즈 확인 (요소의 갯수, 사이즈 개념)
		System.out.println("리스트 사이즈 확인 : " + List.size()); // 요소의 개수를 확인한다.

		// 하나의 요소를 꺼내는 방법
		try {
			System.out.println("하나의 요소를 꺼내기 : " + List.get(0));
		} catch (Exception e) {
			System.out.println("프로그램이 종료 되지 않게 처리");
		}

		// ArrayList 와 반복문에 활용
		// List에 선언된 것이 Int 도 있고 String 이 있기에 최상위 Object로 잡힌다. 숫자로 인식을 못했음

		nums = List; // 복사 개념 - 필 !!!! 얕은 복사 개념 !!!! 중요
		System.out.println(List);
		System.out.println("-----------");
		List.add(10000); // 추가 기능
		System.out.println("nums : " + nums);
		// 얕은 복사 개념 !!!! 중요
		System.out.println("List : " + List);

		// ArrayList 와 반복문에 활용
		// List에 선언된 것이 Int 도 있고 String 이 있기에 최상위 Object로 잡힌다. 숫자로 인식을 못했음

		// for (Integer i : nums) {} <-- List 는 컴파일 시점에 Object 타입으로 인식

		for (Integer i : nums) {
			System.out.println("i : " + i);
		} // for-each

		// ArrayList 안에 값이 포함 되어 있는가 확인 하는 방법 --> contains()
		System.out.println("3이 nums 리스트에 존재하는 가? --> " + nums.contains(3)); // true
		System.out.println("500이 nums 리스트에 존재하는 가? --> " + nums.contains(500)); // false

		// 요소의 위치 (index) 확인 --> indexOf()
		// 값이 없다면 -1 을 반환한다.
		System.out.println("Element 요소 3이 몇 번째 index에 위치 하니 -> " + nums.indexOf(3));
		System.out.println("Element 요소 10이 몇 번째 index에 위치 하니 -> " + nums.indexOf(10));
		System.out.println("Element 요소 500이 몇 번째 index에 위치 하니 -> " + nums.indexOf(500));

		// Iterator 요소 순회(반복자) 를 시키고 싶을 때
		Iterator<Integer> iter = nums.iterator();
		while (iter.hasNext()) { // hasNext : 반복 시킴
			System.out.println("while 을 활용하는 방법 : " + iter.next()); // next 값을 꺼낸다.
		}

		// 배열, ArrayList 차이점 생각

	} // end of main

} // end of class

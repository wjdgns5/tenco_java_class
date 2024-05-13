package structure.ch06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MySetTest {

	public static void main(String[] args) {

		// 계층 구조 확인
		// 업 캐스팅 상태 - 컴파일 시점에서는 Set 계열에 타입은 멤버들만 확인 가능
		Set<Integer> mSet = new HashSet<Integer>();

		HashSet<Integer> set1 = new HashSet<Integer>();

		// 요소 추가 방법
		set1.add(1);
		set1.add(1); // 중복 값 발생
		set1.add(2);
		set1.add(2);// 중복 값 발생
		set1.add(3);
		set1.add(3); // 중복 값 발생
		set1.add(4); 
		set1.add(4); // 중복 값 발생

		// 자료구조에 들어온 데이터는 유일성을 보장한다.
		System.out.println(set1.size());

		// 요소 제거 (요소 -> 값을 넣음)
		set1.remove(3);
		System.out.println(set1);

		// set 계열은 순서를 보장하지 않음
		for (int i = 0; i < set1.size(); i++) {
			// 횟수 만큼 반복은 한다.
			// set1[i] ==> set 계열은 인덱스 개념이 없다.
		}

		for (Integer mi : set1) {
			System.out.println("요소값 추출 : " + mi);
		} // for each 구문을 이용해 반복문을 돌린다.

//		while(set1.size() < 10) {
//			// set1 요소는 어떻게 접근하지???
//			set1.iterator();
//		}
		// 반복자(iterator)를 활용해서 요소 순회를 할 수 있다.
		Iterator<Integer> iter = set1.iterator();

		while (iter.hasNext()) {
			System.out.println("값 확인 : " + iter.next());
		} // end of while()

		System.out.println("------------------");

		// getRandomNumber() 메서드가 호출 되면 데이터를 관리하고자 한다.
		HashSet<Integer> lottoNumbers = new HashSet<Integer>();

		int whileCount = 0;
		while (lottoNumbers.size() < 6) {
			lottoNumbers.add(getRandomNumber());
			whileCount++;
		}

		System.out.println(lottoNumbers);
		System.out.println("반복 횟수 : " + whileCount);

	} // end of main

	public static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(45) + 1;
	}

}

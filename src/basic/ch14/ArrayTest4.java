package basic.ch14;

public class ArrayTest4 {
	// 코드의 시작
	public static void main(String[] args) {

		String[] arrayStr = new String[26];
		// 배열의 길이 : 26
		// 배열의 인덱스 : 25

		arrayStr[0] = "A";
		arrayStr[1] = "B";
		arrayStr[2] = "C";
		arrayStr[3] = "D";
		arrayStr[3] = "E";
		arrayStr[25] = "Y";

		// 배열안에 요소(배열안에 들어있는 값)의 개수를 출력 하시오
		// 값이 있다면 콘솔창에 출력하시오
		// 반복문을 활용 하시오.
		int count = 0; // 배열의 길이
		int eCount = 0; // 요소의 길이
		int nullCount = 0; // String 배열 값이 없는 길이
		for (int i = 0; i < arrayStr.length; i++) {

			if (arrayStr[i] != null) {
				System.out.println("arrayStr[" + i + "] = " + arrayStr[i]);
				// 요소의 개수 저장
				eCount++; // 요소값이 있을 경우 +1 한다.
			}

			if (arrayStr[i] == null) {
				nullCount++; // 요소의 값이 없어서 경우 null 일 경우 +1 한다.
			}

			count++;
		}
		System.out.println("배열의 길이 : " + count);
		System.out.println("인덱스의 길이 : " + (count - 1));

		System.out.println("요소의 개수: " + eCount + " 개");
		System.out.println("배열의 빈 공간 : " + nullCount + " 개");

	} // end of main

} // end of class

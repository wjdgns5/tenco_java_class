package basic.ch03;

public class Operation3 {

/*
 * 증감, 감소 연산자
 * 변수에 접근해서 그 값을 조직 1증가 또는 1감소 시킨다.
 */
	public static void main(String[] args) {
		
		int value1 = 1;
		// value1++;
		++value1;
		
		System.out.println(value1);
		
		// 변수에 접근해서 1 감소 시키기
		int value2 = 1;
		value2--;
		System.out.println(value2);
		
		// 증감 연산자가 변수 뒤에 올 때 (후의 연산자)
		int intData1 = 10;
		int resultData;
		
		// (오른쪽)에서(왼쪽)으로 간다.
		// 후의 연산자는 ; (세미콜론 기준으로 동작 합니다)
		//   11    =   10  +  1 
		resultData = intData1++;
		System.out.println(resultData); // 결과 10
		System.out.println(intData1);
		// ; 세미콜론 기준으로 끝나고 변수에 접근해서 1을 증가 시켰다.
		// ---> 여러분들은 전위 연산자로 사용하자
		
		// 증감 연산자가 변수 앞에 올 경우(전위 연산자)
		int intData2 = 100;
		int resultData2;
		
		resultData2 = ++intData2;
		System.out.println(resultData2);
		
		// 결론 : 증감 연산자는 변수의 값을 오직 1 증가 시킬때 사용 한다.
		// 항에 앞, 뒤 위치에 따라서 연산에 순서가 다르다.
		
		
		

	} // end of main

} // end of class

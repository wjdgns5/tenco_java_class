package basic.ch22;

public class CompleteCalc extends Calculator {

	@Override
	public int add(int n1, int n2) {
		return n1 + n2;
	}

	@Override
	public int substract(int n1, int n2) {
		return n1 - n2;
	}

	@Override
	public int times(int n1, int n2) {
		return n1 * n2;
	}

	public void showInfo() {
		System.out.println("계산 완료");
	}

	// 코드 테스트 메인 함수
	public static void main(String[] args) {
		Calc calc = new CompleteCalc(); // 업캐스팅된 상태

		System.out.println(calc.add(10, 10));
		System.out.println(calc.div(10, 0));
		System.out.println("--------------------");

		((CompleteCalc) calc).showInfo();
		// 반복문, 제어문 활용한다면 instanceof 연산자를 기억하자
		if (calc instanceof CompleteCalc) {
			((CompleteCalc) calc).showInfo();
		}

	}

}

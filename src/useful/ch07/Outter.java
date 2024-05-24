package useful.ch07;

public class Outter {

	Runnable runnable1; // 인터페이스 이다.

	// 인터페이스는 기본적으로 객체를 만들 수 없다
	// 하지면 익명 내부 클래스로 구현할 수 있다.
	// 이런것들을 앞으로 우리는 구현 클래스라 부르자

	public Outter() {
		// Runnable 인터페이스를 구현 클래스로 만들었다.
		// Outter 클래스 내부에 있고, 이녀석을 만들었지만
		// 다른곳에서 부를 방법이 없다. 이름이 없음 - 익명
		// 종합 하면 익명 내부 클래스 명칭 한다.
		new Runnable() {
			public void run() {
				// . . .
			}
		}; // end of Runnable()
	} // end of Outter()

	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");

		}
	};

	// 리턴 타입으로 Runnable 구현 클래스 반환
	Runnable getRunnable(int i) {

		int num = 100;

		return new Runnable() {

			@Override
			public void run() {
				// num = 200; // 에러 남
				// i = 10; // 에러 남
				System.out.println(i);
				System.out.println(num);

			}
		};

	}

} // end of class

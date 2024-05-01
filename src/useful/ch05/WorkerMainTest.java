package useful.ch05;

public class WorkerMainTest {
	// 우리가 정의한 클래스에서 run() 메서드 재정의 할 수 있다.
	// 쓰레드를 사용할 때 알아야 하는 필수 개념 - 그냥 외우자!
	// 쓰레드가 가지고 있는 메서드 start() 호출 시키면 약속으로
	// run() 메서드가 호출 되어 동작하게 만들어진다.

	public static void main(String[] args) {
		System.out.println("-----------main 쓰레드 시작 ----------------");
		System.out.println(Thread.currentThread()); // 현재 자기 쓰레드 출력

		// 작업자 하나 만들어 내기
		Worker worker1 = new Worker("워커1"); // 생성은 메인 쓰레드가 했다.
		// 명령어를 통해서 워커1에게 너가 위임 받은 일을 시작해
		worker1.start(); // 메인 쓰레드가 명령 내림
		// start()를 호출하면 run()이 실행된다.

		System.out.println("--------Main 쓰레드 종료 -----------");
	}

}

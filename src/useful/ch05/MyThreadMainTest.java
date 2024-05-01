package useful.ch05;

public class MyThreadMainTest {
	// 기본적으로 메인 작업자 하나를 가지고 있다. 메인 쓰레드라 한다.
	
	public static void main(String[] args) {
		
		// currentThread()는 static 메서드 객체 생성없이 바로 쓸수있다.
		System.out.println(Thread.currentThread()); // 쓰레드 1개

		// 필요하다면 추가 작업자를 사용할 수 있다.
		MyThread th1 = new MyThread(); // 쓰레드 1개
		th1.start(); // start 호출되면 run() 메서드가 동작되게 약속 되어 있다.

		System.out.println("-----------------------");

		// 필요하다면 추가 작업자를 더 만들 수 있다.
		MyThread th2 = new MyThread(); // 쓰레드 1개
		th2.start();

		// 쓰레드는 총 3개이다. Thread.currentThread(), th1, th2

	} // end of main

} // end of class

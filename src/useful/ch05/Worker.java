package useful.ch05;
/*
 * HOW, WHY
 *
 * // 쓰레드가 가지고 있는 메서드 start() 호출 시키면 약속으로
 * // run() 메서드가 호출 되어 동작하게 만들어진다.
 */
public class Worker extends Thread {

	private String name;

	public Worker(String name) {
		this.name = name;
	}

	// 약속된 부분 --> run() 메서드를 정의 하면 된다.

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker : " + name + " : " + i);

			try {
				Thread.sleep(200); // 200 --> 0.2초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		super.run();
	}

}

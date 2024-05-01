package basic.ch23;

public class Mother extends Thread {

	BankAccount account;

	public Mother(BankAccount account) {
		// 객체가 될 때 맨 처음 동작하는 코드는 생성자이다.
		this.account = account;
	}

	@Override
	public void run() {
		// 5천원 출금 요청 - 다른 작업자
		account.withDraw(5_000);
		super.run();
	}

}

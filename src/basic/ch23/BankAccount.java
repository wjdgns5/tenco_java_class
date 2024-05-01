package basic.ch23;

public class BankAccount {

	private int money = 100_000;

	public int getMoney() {
		return money;
	}

	// 현재 잔액 10만원 .... 상태
	public void setMoney(int money) {
		this.money = money;
	}

	// 입금 기능
	// synchronized : 코드를 순차적으로 작동시킨다.
	public void saveMoney(int money) {

		synchronized (this) {

			int currentMoney = getMoney(); // 현재 잔액
			// 시간이 걸림
			try {
				Thread.sleep(3000); // Thread.sleep 3초 딜레이
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// 10만원 + 1만원 => 결과 11만원, 5천원은?
			setMoney(currentMoney + money); // 금액 set 설정
			System.out.println("입금 후 계좌 잔액 : " + getMoney());
		}

	}

	// 출금 기능
	// synchronized : 코드를 순차적으로 작동시킨다.
	public int withDraw(int money) {

		synchronized (this) {
			// 현재 잔액 10만원 ...
			int currentMoney = getMoney();
			// 시간이 걸림
			try {
				Thread.sleep(500); // Thread.sleep 0.5초 딜레이
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (currentMoney >= money) {
				// 방어적 코드 작성
				// 10만원 - 5천원 ==> 9만 5천원
				setMoney(currentMoney - money);
				System.out.println("출금 후 계좌잔액 : " + getMoney());
				return money;
			} else {
				System.out.println("계좌 잔액이 부족합니다.");
				return 0;
			}
		}
	}

}

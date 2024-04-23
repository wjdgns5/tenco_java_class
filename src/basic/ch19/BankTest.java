package basic.ch19;

public class BankTest {

	public static void main(String[] args) {

		Bank bank0 = new Bank("우리은행"); // 독립적인 생명주기를 가진다.
		Bank bank = new Bank("그린은행"); // 독립적인 생명주기를 가진다.
		Customer customer = new Customer("홍길동"); // 독립적인 생명주기를 가진다.

		// 연관관계라고 한다.
		customer.useBankService(bank);
		System.out.println("------------------------");
		// enum type 연습
		bank.proviedService(ServiceType.ACOUNT_INFO, customer);
		
	}

}

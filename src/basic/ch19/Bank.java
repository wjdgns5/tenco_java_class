package basic.ch19;

public class Bank {

	private String name;

	public Bank(String name) {
		this.name = name;
	} // 생성자

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 대표적인 Bank 기능 , 상호작용 --> 연관관계를 구성하고 있는 상황
	public void proviedService(ServiceType serviceType, Customer customer) {

		switch (serviceType) {
		case ACOUNT_INFO:
			System.out.println(customer.getName() + "계좌 정보 조회를 합니다.");
			break;
		case DEPOSIT:
			System.out.println(customer.getName() + "입금을 진행 합니다.");
			break;
		case WITHDRAW:
			System.out.println(customer.getName() + "출금을 진행 합니다.");
		default:
			System.out.println("해당 서비스는 제공하지 않습니다.");
		}

	}

	// 상호 작용
	public void showAccountInfo(Customer customer) {
		System.out.println("사용자 이름을 출력합니다.");
		System.out.println("이름 : " + customer.getName());
		customer.getName();
	}

}

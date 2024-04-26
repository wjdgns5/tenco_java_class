package basic.ch19;

public class Customer {
	
	private String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// 은행 서비스를 이용하는 메서드 - 연관관계
	public void useBankService(Bank bank) {
		bank.proviedService(ServiceType.DEPOSIT, this);
		System.out.println(bank.getName());
	}

}

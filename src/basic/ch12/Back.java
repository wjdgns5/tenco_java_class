package basic.ch12;

public class Back {
	
	static String bankName;
	private int Code;
	private int money;
	
	public Back() {
		this.Code = 1212;
		this.money = money;
	}
	
	public String getBankName() {
		System.out.println("bankName : " +bankName);
		return bankName;
	}
	
	public void setBankName(String name) {
		this.bankName = name;
	}
	
	public int GetCode() {
		return Code;
	}
	
	
	public void SetCode() {
		// 방어적 코드
		if(Code == 0) {
			System.out.println("잘못된 코드입니다.");
			return;
		} else {
			System.out.println("코드 번호는 " +Code +"입니다.");
		}
	}
	
	public int GetMoney() {
		return money;
	}
	
	public void SetMoney(int money) {
		// 방어적 코드
		if(money < 0) {
			System.out.println("잔액은 " +this.money +"이여서 부족합니다.");
			money = 0;
			return;
		} else {
			System.out.println("잔액은 " +this.money +"입니다.");
		}
	}
	
	
	
	

} // end of main

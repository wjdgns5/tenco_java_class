package basic.exercise;

public class PhoneBook {
	
	// 속성
	private String name; // 이름
	private String number; // 전화번호
	
	public PhoneBook(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}

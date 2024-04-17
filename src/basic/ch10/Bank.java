package basic.ch10;

// 은행
public class Bank {
	
	// 속성
	// 아무것도 지정하지 않으면 default "제어 지시자"이다.
	private String name; // 기본값 : null
	// 정보 은닉 : 외부에서는 확인 안되어야 하는 중요한 변수를 감춘다.
	private int balance; // 정보 은닉(private)
	
	// 입금하다.
	public void deposit(int money) {
		balance = balance + money;
		showInfo();
	} // end of deposit()
	
	// 출금하다.
	public int withdraw(int money) {
		// 방어적 코드를 작성한다.
		if(balance < money) {
			System.out.println("잘못된 요청입니다.");
			return 0; 
		}
		balance = balance - money;
		showInfo();
		return money;
	} // end of withdraw()
	
	// 현재 은행 잔액을 출력 하다.
	public void showInfo() {
		System.out.println("현재 잔액은 : " + this.balance + " 입니다.");
	} // end of showInfo()
	
	
	// 정보 은닉(private) 후에 getter, setter 메서드를 설계해 둘 수 있다.
	// get 메서드란 단순히 객체의 상태 변수를 리턴(return)하는 메서드 이다.
	
	// get 메서드를 사용 하려면 함수 이름에는 get+변수이름() 으로 시작한다.
	// 할 수 있다.
	
	public int getBalance() { // getter를 사용하면 private(은닉)되어있는
		return this.balance; // 값을 getBalance() 함수를 통해
	} // end of getBalance() // balance 에 저장되어 있는 값을 읽어 올 수있다.
	
	public String getName() {
		return this.name;
	} // end of  getName()
	
	
	// 멤버 변수에 접근해서 객체의 상태 값을 변경하게 하는 메서드 입니다.
	// 상태 값만 변경하면 되기 때문에 (리턴 타입 없음)
	
	public void setName(String inputName) {
		this.name = inputName; // // setter를 사용하면 private(은닉)되어있는
	} // 값에 대한 설정을 할 수 있다.
	
	public void setBalance(int money) {
		// 방어적 코드 작성하기
		if(money < 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
		this.balance = money;
		}
	}
	
	 // 코드 출처 ㅣ https://kephilab.tistory.com/54
} // end of class

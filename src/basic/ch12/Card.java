package basic.ch12;

public class Card {
	
	// 문제 : 카드 번호가 발급 될때마다
	// 문제 : 고유한 카드 번호를 가질 수 있도록 코드 설계해 주세요.
	//-----------------------------------------------------------

	// 멤버 변수, static 변수
	private String name; // 이름
	private  static int cardnumber; // 카드 번호
	
	// 멤버 함수
	public Card(String name) {
		this.name = name;
		cardnumber = 1;
	} // 생성자
	
	
	// getter
	public String getName() {
		System.out.println("이름 : " + name);
		return name;
	}
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	// getter
	public int getCardNumber() {
		System.out.println("카드번호 : " + cardnumber);
		return cardnumber;
	}
	// setter
	public void setCardNumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}
	// 메서드
	public void printwaitNumber() {
		getCardNumber();
		Card.cardnumber++;
	}
	
	
	// 코드 테스트 (메인 함수)
	public static void main(String[] args) {
		
		Card card1 = new Card("홍길동");
		Card card2 = new Card("이순신");
		Card card3 = new Card("User1");
		
		card1.getName();
		card1.printwaitNumber();
		
		
		card2.getName();
		card2.printwaitNumber();
		
		card3.getName();
		card3.printwaitNumber();
	
	} // end of main

} // end of class

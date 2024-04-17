package basic.ch10;
// 인터넷 사이트
public class InterNetSite {
	
	String name; // 사이트 이름
	int year; // 사이트 연도
	int speed; // 사이트 속도
	
	// 접속 속도
	public void Connect(int Speed) {
		Speed = Speed + speed;
		return;
	}; // end of Connect
	
	public String Name(String Name) {
		name = Name;
		return name;
	}; // end of Name
	
	public void Year(int Year) {
		year = Year;
	}; // end of Year
	
	// 속도 측정
	public int Gap(int Gap) {
		Gap = Gap - speed;
		return Gap;
	}
	
	public void ShowInfo() {
		System.out.println("이름 : " + name);
		System.out.println("접속 속도 : " +speed);
		System.out.println("년도 : " +year);
		System.out.println("속도 : " );
	}
}


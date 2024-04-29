package useful.ch03;

public class Password {

	private String pwd;
	
	// getter 
	public String getPwd() {
		return pwd; 
	}
	// setter 
	// throws : 자신을 호출한 상위 메소드로 에러를 던지는 역할
	public void setPwd(String pwd) throws PasswordException  {
		
		if(pwd == null) {
			// throw : 에러를 고의로 발생시킬 때 사용합니다.
			throw new PasswordException("비밀번호는 null 값일 수 없습니다");
		}
		
		if( pwd.length() < 5) {
			// throw : 에러를 고의로 발생시킬 때 사용합니다.
			throw new PasswordException("비밀번호는 5자 이상이어야 합니다.");
		}
		// 정규 표현식을 활용할 수 있다. 
		// pwd <== a~z, A~Z  ==> true 
		// pwd <== a, 10, !  ==> false
		// 사용자한테 비밀번호 설정시에 단 한글자라도 특수문자를 포함 시켜야
		// 예외 발생을 안하게 코드를 작성한 것이다.
		if(pwd.matches("[a-zA-Z]+")) {
			// throw : 에러를 고의로 발생시킬 때 사용합니다.
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야 합니다.");
		}
		// [...] : 대괄호는 문자열을 나타냄
		// a -z A-Z 모든 왈바벳 문자열을 말한다.
		// + : 바로 앞에 표현식이 하나 이상은 반복되어야 한다.
		// 즉, "Hello" --> true를 반환 한다.
		// "world" --> true를 반환 한다.
		// "A1", "bbb"(3글자) ---> false 반환
		this.pwd = pwd;
	}
}

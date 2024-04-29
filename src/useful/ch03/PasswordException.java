package useful.ch03;
/*
 * 사용자 정의 예외 클래스 생성 IllegalAccessException
 * 
 */
public class PasswordException extends RuntimeException {
	// RuntimeException : 정상적인 작동 중에 발생할 수 있는 예외의 슈퍼 클래스
	
	public PasswordException(String message) {
		super(message);
	}

}

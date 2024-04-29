package useful.ch03;

public class NickNameException extends RuntimeException {
	// RuntimeException : 정상적인 작동 중에 발생할 수 있는 예외의 슈퍼 클래스
	
	public NickNameException(String message) {
		super(message);
	}
	
}

package useful.ch03;

public class NickName {

	String nick;

	public NickName() {
	}

	// get
	public String getNickname() {
		return nick;
	}

	// set
	// throws : 자신을 호출한 상위 메소드로 에러를 던지는 역할
	public void setNickname(String nick) throws NickNameException {

		if (nick == null) {
			// throw : 에러를 고의로 발생시킬 때 사용합니다.
			throw new NickNameException("닉네임은 공백으로 설정할 수 없습니다.");
		}

		if (nick.length() < 3) {
			// throw : 에러를 고의로 발생시킬 때 사용합니다.
			throw new NickNameException("닉네임은 3글자 미만으로 지정할 수 없습니다.");
		}

		if (nick.matches("[a-z A-Z+]")) {
			// throw : 에러를 고의로 발생시킬 때 사용합니다.
			throw new NickNameException("비밀번호는 숫자, 특수문자를 포함해야 합니다.");
		}

		this.nick = nick;
	}

}
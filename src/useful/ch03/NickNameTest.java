package useful.ch03;

public class NickNameTest {

	public static void main(String[] args) {

		NickName nickname = new NickName();

		String inputNickname = null;
		inputNickname = "a3";
		try {
			nickname.setNickname(inputNickname);

		} catch (PasswordException e) {
			System.out.println("우리가 정의한 password 예외가 발생");
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}

	}

}

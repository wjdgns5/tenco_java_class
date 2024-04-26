package basic.exercise.interfaces;

public interface IUserInfoDao {
	
	// C R U D
	// public abstract 생략 가능
	// TODO - 매개변수 수정 예정
	
	// public abstract void insertUserInfo();
	void insertUserInfo(UserInfo info);
	
	// public abstract void updateUserInfo();
	void updateUserInfo(UserInfo info); // 단 수정이 되면 안되는 것은 제외
	
	// public abstract void deleteUserInfo();
	void deleteUserInfo(int id);
	
	// public abstract void selectUserInfo();
	void selectUserInfo(); // 전체 조회 

}

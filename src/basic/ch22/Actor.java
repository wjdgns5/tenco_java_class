package basic.ch22;

public class Actor implements Romeo {
	
	String name;
	
	public Actor(String name) {
		this.name = name;
	}
	
	@Override
	public void performAsRomeo() {
		System.out.println(name +" 가 오호 ~ 줄리엣 연극합니다.");
	}
}

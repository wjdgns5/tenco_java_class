package basic.exercise.toy;

public class product {
	String name;
	int price;
	
	public product(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println("상품명 : " + this.name);
		System.out.println("가격 : " + this.price);
	} // 상태창
}

package basic.ch10;

public class Hero {
	
	private String name;
	private int hp;
	private int power;
	private double defense;
	private boolean isDie;
	
	// getter, setter 메서드를 만들어 주세요.
	
	public void setName(String Name) {  
		this.name = Name;
	}
	
	public void setPower(int Power) { 
		this.power = Power;
	}

	public int getHp(int HP) { 
		this.hp = HP;
		return hp;
	}
	
	
	public void setDefense(double Defense) { 
		this.defense = Defense;
	}
	
	public boolean getIsDie() {
		boolean isDie = (this.hp<= 0) ? true : false;
		return isDie;
	}
	
	public void showInfo() {
		System.out.println("이름 : " +name);
		System.out.println("파워 : " +power);
		System.out.println("체력 : " +hp);
		System.out.println("방어 : " +defense);
		System.out.println("죽음 : " +getIsDie());
		System.out.println();
		
	}

}

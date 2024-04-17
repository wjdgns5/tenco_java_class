package basic.ch10;

public class HeroTset {
	
	public static void main(String[] args) {
		
		Hero hero = new Hero();
		
		hero.setName("모험가");
		hero.getHp(1);
		hero.setPower(12);
		hero.setDefense(170);
		hero.getIsDie();
		
		hero.showInfo();
		
		hero.setName("will");
		hero.getHp(0);
		hero.setPower(14);
		hero.setDefense(44);
		hero.getIsDie();
		
		hero.showInfo();
	}

}

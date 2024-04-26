package starcraft.ver05;

public class StarCraftTest1 {
	
	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();
		
		System.out.println("----------------------------");
		
		zealot1.attack(marine1);
		zergling1.attack(marine1);
		zergling1.attack(zealot1);
		
		marine1.showInfo();
	
		
		
		
	} // end of main

} // end of class

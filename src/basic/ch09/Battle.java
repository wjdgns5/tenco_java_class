package basic.ch09;

import java.util.Scanner;

public class Battle {
	// Code Start
	public static void main(String[] args) {

		Wizard wizard1 = new Wizard("Wizard", 80, 11);
		// wizard1.showInfo();

		System.out.println("------------");

		Archer archer1 = new Archer("Archer", 90, 9);
		// archer1.showInfo();

		System.out.println("------------");

		Warrior warrior1 = new Warrior("Warrior", 120, 3);
		// warrior1.showInfo();

		System.out.println("1. 법사 공격 2. 궁수 공격 3. 전사 공격");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean flag = true;

		while (flag) {
			if (a == 1) {
				wizard1.attack(17);
				wizard1.showInfo();
				if(wizard1.healthPoint <= 0) {
					flag = false;
				};
				
				
			} else if (a == 2) {
				archer1.attack(1);
				archer1.showInfo();
				if(archer1.healthPoint <= 0) {
					flag = false;
				};
				
			} else if (a == 3) {
				warrior1.attack(1);
				warrior1.showInfo();
				if(warrior1.healthPoint <= 0) {
					flag = false;
				};
			}
		}

	} // end of main

} // end of class

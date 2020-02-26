package com.company;

public class Main {

    public static void main(String[] args) {
	Soldier soldier = new Soldier("Russia", 10000);
	soldier.toDetermine("USA", "Force", 1);
		System.out.println(soldier.getInfo());
		Sniper sniper1 = new Sniper("KG", Military_type.AIR_FORCE, 20000, 25, "Лейтенант", new Mission("Syria", 1));
		sniper1.toDetermin("Force",5);
		System.out.println(sniper1.getInfo());
		Sniper sniper2 = new Sniper("EU", Military_type.GROUND_FORCE, 50000, 30, "Майор", new Mission("Turkey", 2));
		sniper2.toDetermin("Force",6);
		System.out.println(sniper2.getInfo());

    }
}

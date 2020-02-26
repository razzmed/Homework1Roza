package com.company;

public class Sniper extends Soldier {
    private int age;
    private String rank;
    private Mission mission;
    private Military_type mt;

    public Sniper(String nation, Military_type mt, int amount, int age, String rank, Mission mission) {
        super(nation, amount);
        this.age = age;
        this.rank = rank;
        this.mt = mt;
        this.mission = mission;
    }

    public Military_type getMt() {
        return mt;
    }
    public int getAge() {
        return age;
    }

    public String getRank() {
        return rank;
    }
    @Override
    public String getInfo(){
        return super.getInfo() + " " + age + " " + rank + " " + mission + " " + mt;
    }
}

package com.company;

public class Soldier extends Army {
private int amount;

    public Soldier(String nation,int amount) {
        super(nation);
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }


    public void toDetermine(String nation, String type, int code){
        System.out.println(nation + " " + " " + type + "" + " " +code);
    }

    public void toDetermin(String nation, int code){
        System.out.println(nation + code);
    }
    public void toDetermin(String type){
        System.out.println(type);
    }
    @Override
    public String getInfo(){
        return super.getInfo() + " количество: " + amount;
    }
}

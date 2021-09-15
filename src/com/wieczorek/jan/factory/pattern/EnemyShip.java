package com.wieczorek.jan.factory.pattern;

public abstract class EnemyShip {

    public String name;
    public double damageDone;

    public String getName() {
        return name;
    }

    public double getDamage() {
        return damageDone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(double damage) {
        this.damageDone = damage;
    }

    public void displayEnemyShip(){
        System.out.println(this.name + " is on the screen" );
    }

    public void attack(){
        System.out.println(this.name + " attacks and does " + this.damageDone + " damage");
    }






}


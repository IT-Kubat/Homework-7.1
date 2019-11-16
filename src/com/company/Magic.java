package com.company;

public class Magic extends Player {

    String attackType;

    public Magic(int health, String damage, String attackType) {
        super(health, damage);
        this.attackType = attackType;
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }


    @Override
    public void applySuperAbility() {
        System.out.println("Применил магическую силу");

    }
}
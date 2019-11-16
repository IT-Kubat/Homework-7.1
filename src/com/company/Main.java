package com.company;

public class Main {

    public static void main(String[] args) {
        Mental mental = new Mental(200, "40", 20);
        mental.applySuperAbility();
        Warrior warrior = new Warrior(200, "40", 20);
        warrior.applySuperAbility();
        Magic magic = new Magic(200, "40", "Magic");
        magic.applySuperAbility();
    }
}

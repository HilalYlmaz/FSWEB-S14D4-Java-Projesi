package com.workintech.abtraction.main;

import com.workintech.abtraction.rpg.Monster;
import com.workintech.abtraction.rpg.Werewolf;

public class Main {
    public static void main(String[] args){
        Monster werewolf = new Werewolf("wolf1", 600, 52);
        System.out.println(werewolf.attack());
        System.out.println((werewolf.getDamage()));
        System.out.println(werewolf.poison());
        System.out.println(werewolf.bleed());
    }
}

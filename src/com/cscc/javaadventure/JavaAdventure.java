package com.cscc.javaadventure;

import java.util.HashMap;

public class JavaAdventure {
    public static void main(String[] args) {

        System.out.println("Welcome to JavaAdventure!");

        Character myCharacter = new Character();

        for (String key : myCharacter.getAttributes().keySet() ) {
            System.out.println(key + " " + myCharacter.getAttributes().get(key));
        }

        System.out.println(myCharacter.getName());
        System.out.println(myCharacter.getDescription());
        System.out.println(myCharacter.getHealth());
    }
}

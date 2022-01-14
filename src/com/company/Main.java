package com.company;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[3]; //Die Groesse eines Arrays wird immer bei der Initialisierung festgelegt

        names[0] = "Michael";
        names[1] = "Isabella";
        names[2] = "Carina";

        /*
        System.out.println(names[0] + ", " + names[2] + ", und " + names[1] + " gehen zusammen Eis essen.");
        */

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}

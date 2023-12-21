package com.ahmetselimkisa.javalearning;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Merhaba Dünya!");
        // Variables

        //Integer-Long
        int age = 20;
        System.out.println(10*age);

        int x=5;
        int y=11;
        System.out.println(y/x);

        //Double-Float

        double z=5.0;
        double a=11.0;
        System.out.println(a/z);

        float myFloat = 10.0f;
        System.out.println(myFloat/3);

        //String
        String name="Ahmet Selim";
        String surname="KISA";

        System.out.println(name);
        System.out.println(surname);

        String fullname=name + " " + surname;
        System.out.println(fullname);

        // Final
        final int final_int = 5;
        System.out.println("Final int: " + final_int);
    }
}

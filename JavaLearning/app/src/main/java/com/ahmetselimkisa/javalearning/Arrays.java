package com.ahmetselimkisa.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {

        //Array

        String[] myStringArray = new String[3];
        myStringArray[0]="James";
        myStringArray[1]="James01";
        myStringArray[2]="James02";

        System.out.println(myStringArray[0]);
        System.out.println(myStringArray[1]);
        System.out.println(myStringArray[2]);

        int[] myNumberArray={1,2,3,4,5,6,7,8};
        System.out.println(myNumberArray[4]);

        //Lists

        ArrayList<String> myList= new ArrayList<>();
        myList.add("Ahmet");
        myList.add("Ahmet");
        myList.add("Selim");
        myList.add(1,"KISA");
        myList.add("Beyza");
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println(myList.get(3));
        System.out.println(myList.size());
        //Set
        HashSet<String> mySet=new HashSet<>();

        mySet.add("Ahmet");
        mySet.add("Ahmet");
        System.out.println(mySet.toString());
        System.out.println(mySet.size());

        // HashMap

        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("name", "James");
        myHashMap.put("instrument", "Guitar");

        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        HashMap<String, Integer> mySecondMap = new HashMap<>();
        mySecondMap.put("run", 100);
        mySecondMap.put("basketball", 200);

        System.out.println(mySecondMap.get("run"));
        System.out.println(mySecondMap.get("basketball"));




    }
}

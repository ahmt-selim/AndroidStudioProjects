package com.ahmetselimkisa.javalearning;

public class Loops {
    public static void main(String[] args) {

        //Döngüler
        //for
        int[] myNumbers={12,15,18,21,24};

        for(int i=0; i<myNumbers.length; i++){
            int x = myNumbers[i] /3*5;
            //System.out.println(x);
        }

        for(int number : myNumbers){
            System.out.println(number);
        }
        System.out.println("While Döngüsü:");
        //While

        int j=0;
        while(j<10){
            System.out.println(j);
            j++;
        }
    }
}

package com.ahmetselimkisa.javalearning;

public class Statement {

    public static void main(String[] args) {

        //Operatörler

        int x=5;
        System.out.println(x);
        x = x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        int y = 4;
        System.out.println(x>y);
        System.out.println(y>x);

        // and &&
        // or ||
        x=3;
        y=4;
        int z = 5;
        System.out.println(x<y && y<z);
        System.out.println(x<y || y<z);

        // if
        if (x<y){
            System.out.println("y xten daha büyük!");
        }
        else{
            System.out.println("y xten daha büyük değil");
        }

        //switch
        int day=6;
        String dayString="";
        switch (day){
            case 1:
                dayString="Monday";
                break;
            case 2:
                dayString="Tuesday";
                break;
            case 3:
                dayString="Wednesday";
                break;
            case 4:
                dayString="Thursday";
                break;
            case 5:
                dayString="Friday";
                break;
            default:
                dayString="Weekend";
                break;
        }
        System.out.println(dayString);


    }
}

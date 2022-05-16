package se.lexicon.sudipta;

//class name should start with capital letter for each word
public class Exercise1 {
    // ctrl + alt + L 0 reformat codes

    public static void main(String[] args) {
/*
        int i = 2020;
        int j = 2021;
        if (i % 4 == 0) {
            System.out.println("This is a leap year");
        } else {
            System.out.println("this is not good");

*/

        //Leap Year using if-else condition:

        int year = 2022;

        boolean isLeap = false;

        if (year % 4 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = true;
        } else if (year % 400 == 0) {
            isLeap = true;
        } else
            isLeap = false;


        if (isLeap == true) {
            System.out.println(year + " Is a leap year");
        } else {
            System.out.println(year + " Is not a leap year");
        }



    }


}




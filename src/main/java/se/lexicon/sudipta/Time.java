package se.lexicon.sudipta;

import java.util.Scanner;
// Hour :Minute :Second

public class Time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a time :");
        int num=sc.nextInt();
        int second=num % 60;
        int minute=(num/60) %60;
        int hour=(num /60) /60;


        System.out.println( hour +":"+minute+":"+second);




    }
}

package se.lexicon.sudipta;

import java.util.Scanner;
import java.util.Random;

public class Person {
    public static <number> void main(String[] args) {
        int maxRange = 500;
        int input = 0;
        //create objects
        Scanner san = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(maxRange);
        //logic to check the guess of the user and number of try for(int k=1; k<=500; k++)
 boolean b=false;
        int k=1;
        if (k<=500);{
        k=k++;
    //    break;
        }
            System.out.println("Please enter your Guess Number : ");
            input = san.nextInt();
            if (input == number) {
                System.out.println("Yes your guess is correct and your total guess is : "+k);

            }
       // break;
        if  (input > number) {
            System.out.println("Your Guess is too big ");

        }
         /*   else (input < number) {

                System.out.println("our Guess is too small.... : ");
                }
*/



        }


    }



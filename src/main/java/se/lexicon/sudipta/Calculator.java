package se.lexicon.sudipta;



public class Calculator {


    public static void main(String[] args) {

        Calculator cal = new Calculator();
        String txt="Hello world";
        System.out.println(txt.toUpperCase());

        System.out.println(cal.addition(2,4));
        System.out.println(cal.subtraction(2,4));
        System.out.println(cal.multiplication(2,4));
        System.out.println(cal.addition(5,4));

        System.out.println(cal.addition(2,7));

        System.out.println(cal.addition(2,33));

    }

    public  int addition(int num1, int num2) {
        return num1 + num2;
    }


    public  int subtraction(int num1, int num2) {
        return num1 - num2;
    }


    public  int multiplication(int num1, int num2) {
        return num1 * num2;

    }
}

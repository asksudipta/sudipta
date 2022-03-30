package se.lexicon.sudipta.string;

public class Substring {
    public static void main(String[] args) {
        String sentence="Ok this is not as long!";
        System.out.println("The full sentence is -- :" + "'" +sentence + "'");
        System.out.println("The part of the string is-- :" +"'"+ sentence.substring(11, 22)+ "'");
    }
}

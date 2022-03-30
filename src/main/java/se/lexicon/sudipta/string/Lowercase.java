package se.lexicon.sudipta.string;

public class Lowercase {
    public static void main(String[] args) {
        String sentence = "CAPS EQUALS SCREAMING";
        System.out.println("The original sentence is  --:" + sentence);

        sentence = sentence.toLowerCase();
        System.out.println("The Lowercase is  --:" + sentence);
    }
}

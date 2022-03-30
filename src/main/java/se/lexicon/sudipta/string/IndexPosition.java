package se.lexicon.sudipta.string;

public class IndexPosition {
    public static void main(String[] args) {

        System.out.println("The index number o is  : ");
        ex1();

        String position = "Long example sentence";
        for (int i = 6; i < position.length(); i = i++) {

            System.out.println("The character on Index position  6 is  :"+ position.charAt(i));
            break;
        }

    }

    public static void ex1() {
        String sentence = "Even longer example sentence";
        int index = sentence.indexOf("o");
        System.out.println(index);

    }

}

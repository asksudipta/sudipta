package se.lexicon.sudipta.Array;

public class ArrayExamples {

    public static void main(String[] args) {
        String name1 = "Ulf";
        String name2 = "Erik";
        String name3 = "Simon";
        String[] names = {name1, name2, name3};

        int[] numbers = {2,5,8,1,0,3};




    }

    public static class Arrays {
        public static void main(String[] args) {
            String[] stringArray = new String[3];
            int[] numbers = new int[4];
            char[] words = new char[3];

            int[] numbers2 = new int[]{2, 6, 3, 9};
            String[] stringArrays2 = new String[]{"test1,test2,test3"};
            String[] stringArrays3 = {"test1.test2.test3"};

            char[] words2 = {'j', 'h', 'k', 'a'};
            ex1();

        }


        public static void ex1() {
            String[] names = new String[3];
            names[0] = "Fredrik";
            names[1] = "Erik";

            System.out.println(names[0]);
            System.out.println(names[2]);
            System.out.println(names[1]);

            System.out.println(names.length);

        }
    }
}

package learnJava.challenges;

public class CountWords {

    public static void main(String[] args) {
        //System.out.println(countWords("Learning java is complicated"));
        String str = "Learning java is complicated";
        String[] words = str.split("\\+s");
        //String[] wordArray = new String[str.length()];
        for (String i : words){
            System.out.println(i);
        }

    }

    /*
      Create a method that takes a string and returns the word count. The string will be a sentence.
    */
    public static int countWords(String sentence) {
        String[] words = sentence.split("\\+s");
        int totalWords = 0;
        for (int i = 0; i < words.length; i++) {
            totalWords++;
        }
        return totalWords;
    }
}

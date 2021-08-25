package learnJava.challenges;

public class CountVowels {

    public static void main(String[] args) {
        System.out.println(countVowels("Hello"));
    }

    /*
    Create a function that takes a string and returns the number (count) of vowels contained within it.
    Steps.
    */
    public static int countVowels(String word) {
        int numberOfVowels = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' ||
                    word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                numberOfVowels++;
            }
        }
        return numberOfVowels;
    }
}

package learnJava.challenges;

public class OddOrEven {

    public static void main(String[] args) {

        sortEvenNum(50, 75);
        sortOddNum(11, 28);
    }

    //Checks and prints all the EVEN number from 1-100, inclusive.
    public static void sortEvenNum(int num1, int num2){
        System.out.print("Even numbers: ");
        for (int i=num1; i<=num2; i++){
            if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
    }

    //Checks and prints all the ODD number from 1-100, inclusive.
    public static void sortOddNum(int num1, int num2){
        System.out.print("\nOdd numbers: ");
        for (int i=num1; i<=num2; i++){
            if(i % 2 == 1){
                System.out.print(i + ", ");
            }
        }
    }
}

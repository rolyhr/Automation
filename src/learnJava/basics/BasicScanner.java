package learnJava.basics;

import java.util.Scanner;

public class BasicScanner {

    public static void main(String[] args){

        System.out.println(printFullName());

    }


    static String printFullName(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        scanner.close();

        return "My full name is " + firstName  + lastName + ".";
    }
}

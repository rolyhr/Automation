package learnJava.applications.bank.atm;

import java.io.IOException;

public class MainATM {

    public static void main(String[] args) throws IOException {
        Options chase = new Options();

//        int upperBound = 999999;
//        int lowerBound = 100000;
//        int number = lowerBound + (int)(Math.random() * ((upperBound - lowerBound) + 1));
//        System.out.println(number);
        chase.startATM();
    }
}

package learnJava.basics;

public class BasicCal {

    public static void main(String[] args) {
        BasicCal cal = new BasicCal();

        System.out.println("Adding: " + cal.add(2,2));
        System.out.println("Subtracting: " + cal.subtract(4,2));
        System.out.println("Multiplying: " + cal.multiply(2,2));
        System.out.println("Dividing: " + cal.divide(4,2));
    }


    //Adding two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    //Subtracting two numbers
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    //Multiplying two numbers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    //Divide two numbers
    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}

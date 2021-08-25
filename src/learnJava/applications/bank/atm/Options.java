package learnJava.applications.bank.atm;

import learnJava.applications.Colors;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends ATM{

    Scanner menuOption = new Scanner(System.in);
    Map<Integer, Integer> accountData = new HashMap<>();

    /*This method will provide menu options, and based on the selection from customer,
    each method will perform its action.*/
    public void startATM() throws IOException {
        System.out.println(Colors.BLUE_BOLD + "Welcome to Chase ATM" + Colors.RESET);
        System.out.println("\tOption 1: Login");
        System.out.println("\tOption 2: Exit");
        System.out.print(Colors.CYAN + "Make a selection from the top menu (i.e. For \"Option 2\", enter only \"2\"): " + Colors.RESET);
        int selection = menuOption.nextInt();

        switch (selection) {
            case 1:
                login();
                break;
            case 2:
                exit();
                break;
            default:
                System.out.println(Colors.RED_BACKGROUND_BRIGHT + "INVALID SELECTION!" + Colors.RESET);
                startATM();
        }
    }

    //Another Login Method
//    public void login(){
//        //Assume these are the clients with account & PIN that already exist in the database.
//        accountData.put(654321, 2211);
//        accountData.put(111111, 1111);
//        accountData.put(222222, 2222);
//
//        boolean flag = false;
//        do {
//            System.out.print("Enter Account Number: ");
//            int customerNum = menuOption.nextInt();
//            for (Map.Entry<Integer, Integer> key : accountData.entrySet()) {
//                while (customerNum != key.getKey()) {
//                    System.out.print("WARNING! \nEnter Valid Account Number: ");
//                    customerNum = menuOption.nextInt();
//                }
//                System.out.print("Enter PIN: ");
//                int customerPin = menuOption.nextInt();
//                while (customerPin != key.getValue()){
//                    System.out.print("WARNING! \nEnter Valid PIN: ");
//                    customerPin = menuOption.nextInt();
//                }
//                flag = true;
//                System.out.println("Internal Menu Called");
//            }
//        } while (flag);
//
//    }

    //This method will let users login to their account
    public void login() throws IOException {
        int x = 1;
        do {
            try {
                //Assume these are the clients with account & PIN that already exist in the database.
                accountData.put(654321, 2211);
                accountData.put(111111, 1111);
                accountData.put(222222, 2222);

                System.out.print(Colors.CYAN + "Enter Account Number: " + Colors.RESET);
                setCustomerNum(menuOption.nextInt());

                System.out.print(Colors.CYAN + "Enter PIN: " + Colors.RESET);
                setPinNum(menuOption.nextInt());
            } catch (Exception e) {
                System.out.println(Colors.RED_BACKGROUND_BRIGHT + Colors.BLACK_BOLD + "Invalid Characters, Only numbers are allowed!" + Colors.RESET);
                x = 2;
            }
            int cusNum = getCustomerNum();
            int cusPin = getPinNum();
            if (accountData.containsKey(cusNum) && accountData.get(cusNum) == cusPin) {
                internalMenu();
            }else {
                System.out.println(Colors.RED_BACKGROUND_BRIGHT + Colors.BLACK_BOLD + "Invalid Account Number or PIN!" + Colors.RESET);
            }
        } while (x == 1);
    }

    //Once the users verified their credentials, this method will be called from the LOGIN() method.
    public void internalMenu() throws IOException {
        System.out.println("\tOption 1: View Account Balance");
        System.out.println("\tOption 2: Deposit Money");
        System.out.println("\tOption 3: Withdraw Money");
        System.out.println("\tOption 4: Logout");
        System.out.print(Colors.CYAN + "Make a selection from the top menu (i.e. For \"Option 2\", enter only \"2\"): " + Colors.RESET);
        int accessMenu = menuOption.nextInt();

        switch (accessMenu){
            case 1:
                System.out.println(Colors.GREEN_BOLD_BRIGHT + "Account Balance: $" + decimalFormat.format(checkBalance()) + Colors.RESET);
                internalMenu();
                break;
            case 2:
                System.out.println(Colors.GREEN_BOLD_BRIGHT + "Account Balance: $" + decimalFormat.format(depositMoney(getDepositInput())) + Colors.RESET);
                internalMenu();
                break;
            case 3:
                System.out.println(Colors.GREEN_BOLD_BRIGHT + "Account Balance: $" + decimalFormat.format(withdrawMoney(getWithdrawInput())) + Colors.RESET);
                internalMenu();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println(Colors.RED_BACKGROUND_BRIGHT + Colors.BLACK_BOLD + "INVALID SELECTION!" + Colors.RESET);
                internalMenu();
        }
    }

    //This method will check for current balance
    public double checkBalance() {
        return currentBalance;
    }

    //This method will deposit money into the account
    public double depositMoney(double enterAmount) {
        return currentBalance = currentBalance + enterAmount;
    }

    //This method will withdraw money from account
    public double withdrawMoney(double enterAmount) {
        return currentBalance -= enterAmount;
    }

    //This method will exit out of the ATM application
    public void exit() throws IOException {
        System.out.println(Colors.GREEN_BACKGROUND_BRIGHT +
                Colors.BLACK_BOLD              +
                "Thank you for banking with us!"      +
                Colors.RESET);
        startATM();
    }
}

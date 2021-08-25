package learnJava.applications.bank.atm;

import learnJava.applications.Colors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ATM {

    private int customerNum, pinNum;
    double currentBalance = 0;
    double depositAmount, withdrawAmount;

    Scanner menuOption = new Scanner(System.in);

    //Format how the balance will print out
    String pattern = "###,##0.00";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public int getPinNum() {
        return pinNum;
    }

    public void setPinNum(int pinNum) {
        this.pinNum = pinNum;
    }

    //This method returns a double value to an argument for the depositMoney() method in Options class.
    public double getDepositInput(){
        System.out.print(Colors.CYAN + "Enter the amount you want to deposit: $" + Colors.RESET);
        this.depositAmount =  menuOption.nextDouble();

        while (depositAmount <= 0) {
            System.out.println(Colors.RED_BACKGROUND_BRIGHT + Colors.BLACK_BOLD + "WARNING! A positive amount is required." + Colors.RESET);
            System.out.print(Colors.CYAN + "Enter the amount you want to deposit: $" + Colors.RESET);
            this.depositAmount =  menuOption.nextDouble();
        }

        System.out.println(Colors.GREEN + "Deposited Amount: $" + decimalFormat.format(depositAmount));
        return depositAmount;
    }

    //This method returns a double value to an argument for the withdrawMoney() method in Options class.
    public double getWithdrawInput(){
        System.out.print(Colors.CYAN + "Enter the amount you want to withdraw: $" + Colors.RESET);
        this.withdrawAmount =  menuOption.nextDouble();

        while ((withdrawAmount > currentBalance) || (currentBalance <= 0)) {
            System.out.println(Colors.RED_BACKGROUND_BRIGHT + Colors.BLACK_BOLD + "WARNING! You do not have enough balance in your account." + Colors.RESET);
            System.out.print(Colors.CYAN + "Enter the amount you want to withdraw: $" + Colors.RESET);
            this.withdrawAmount =  menuOption.nextDouble();
        }
        System.out.println(Colors.RED_BRIGHT + "Withdrawn Amount: $" + decimalFormat.format(withdrawAmount) + Colors.RESET);
        return withdrawAmount;
    }
}

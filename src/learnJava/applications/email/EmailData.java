package learnJava.applications.email;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Scanner;

public class EmailData {

    private String firstName, lastName, dateOfBirth, deptName, email, password, backupEmail;
    private int securityPin;

    Scanner stdin = new Scanner(System.in);

    public void updateCredentials(){
        System.out.println("If you need to change your credentials, select one of the following option.");
        System.out.println("\tOption 1: Change Default Password");
        System.out.println("\tOption 2: Change Backup Email");
        System.out.print("Make a selection from the top menu (i.e. For \"Option 2\", enter only \"2\"): ");
        int selection = stdin.nextInt();

        switch (selection){
            case 1:
                changePassword();
                break;
            case 2:
                changeBackupEmail();
                break;
            default:
                System.out.println("INVALID SELECTION!");
                updateCredentials();
        }
    }

    public void newEmail(){
        newEmpData();
        formatEmail();
        System.out.println("Email created for: " + firstName + " " + lastName +
                "\n" + "Your Email is: " + email);
        generatePassword();
        System.out.println("Your default password is: " + password);
    }

    public void newEmpData(){
        System.out.println("Welcome to Geico! \nFill out the following information for new employee.");
        System.out.print("Enter First Name: ");
        this.firstName = stdin.nextLine();

        System.out.print("Enter Last Name: ");
        this.lastName = stdin.nextLine();

        System.out.print("Enter Date of Birth: ");
        this.dateOfBirth = stdin.nextLine();

        System.out.print("Enter the new employee department name: ");
        this.deptName = stdin.nextLine();

        System.out.print("Enter your security PIN: ");
        this.securityPin = Integer.parseInt(stdin.nextLine());

        System.out.print("Enter Backup Email: ");
        this.backupEmail = stdin.nextLine();
    }

    public void formatEmail(){
        String companyDomain = "geico.com";
        this.email = firstName.toLowerCase(Locale.ROOT) +
                "."                                    +
                this.lastName.toLowerCase(Locale.ROOT) +
                "."                                    +
                "@"                                    +
                this.deptName.toLowerCase(Locale.ROOT) +
                "."                                    +
                companyDomain.toLowerCase(Locale.ROOT);
    }

    public void generatePassword(){
        SecureRandom random = new SecureRandom();
        StringBuilder customString = new StringBuilder();

        final String chars = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789@!$%.&";
        int defaultPasswordLength = 10;

        for (int i = 0; i < defaultPasswordLength; i++) {
            int randomIndex = random.nextInt(chars.length());
            this.password = customString.append(chars.charAt(randomIndex)).toString();
        }
    }

    public void changePassword(){
        System.out.println("Verify the following information to change your password.");
        System.out.print("Enter your security PIN for the account: ");
        int pin = stdin.nextInt();
        int i = 1;
        while ((pin != this.securityPin) && (i <= 3)){
            switch (i) {
                case 1:
                    System.out.print("1 Failed Attempt! Enter valid security PIN: ");
                    pin = stdin.nextInt();
                    break;
                case 2:
                    System.out.print("2 Failed Attempt! Enter valid security PIN: ");
                    pin = stdin.nextInt();
                    break;
                default:
                    System.out.print("3 Failed Attempt! Your account will be locked if you enter invalid PIN: ");
                    pin = stdin.nextInt();
                    changePassword();
            }
            i++;
        }
        System.out.print("Enter your backup email for the account: ");
        String backupEmail = stdin.nextLine(); //THIS LINE OF CODE NEVER RUNS. SKIPS AND GOES STRAIGHT TO LINE 151
        int j = 1;
        while ((!(backupEmail.equals(this.backupEmail))) && j <= 3) {
            System.out.print("WARNING! Enter valid backup email: ");
            backupEmail = stdin.nextLine();
            if (backupEmail.equals(this.backupEmail)){
                System.out.print("Enter your new password: ");
                this.password = stdin.nextLine();
                System.out.println("Your new password has been changed to: " + this.password);
                updateCredentials();
            }
            j++;
        }
        changePassword();
    }

    //haven't finished writing this method yet.
    public void changeBackupEmail(){
        //to change email address, must verify security pin, DOB, & current primary email.
        System.out.println("Verify the following information to change your backup email.");
        System.out.println("");

        //Warned 3 times for invalid data, and prompt user after each warning message.
        //Locked the account after 4th try
    }
}

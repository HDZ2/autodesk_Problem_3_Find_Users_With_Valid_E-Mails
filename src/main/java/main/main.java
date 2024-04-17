package main;

import methods.validateEmail;

import java.util.Scanner;

public class main {

    /*
    *
    * This is the main class where I first ask how many emails are going to be entered and save it in to variable
    * Once that's set, I itirate and ask for each email and save it into email variable
    * Once the email is saved I call the function isEmailValid which I call up from validateEmail class
    * Once the result is obtained I print a message based on its value
    *
    * */
    
    public static void main(String[] args) {
        //Constructor to invoke the isvalidEmail function
        validateEmail validEmail = new validateEmail();

        //Setups up scanner
        Scanner scanner = new Scanner(System.in);
        //ASk how many emails
        System.out.print("Enter the number of emails to be validated: ");

        //save number and move to next line
        int numEmails = scanner.nextInt();
        scanner.nextLine();

        // Iteriate for each email and call the function to validate it
        for (int i = 0; i < numEmails; i++) {
            //Ask for email
            System.out.print("Enter email " + (i + 1) + ": ");
            //Save email into variable
            String email = scanner.nextLine();

            //save output on varible
            boolean isValid = validEmail.isEmailValid(email);

            //Printout output
            System.out.println("Is "+email+" valid? "+ isValid);
        }
        // Close scanner
        scanner.close();
    }
}

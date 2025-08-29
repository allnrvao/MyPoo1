package run;

import java.util.Scanner;
import models.BankAccount;

public class BankAtm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear cuenta
        BankAccount account = new BankAccount("Allan", 1000);

        System.out.println("Welcome to Bank Atm, " + account.getNameUser());
        System.out.println("Your current balance is: " + account.getBalance());
        System.out.println("What do you want to do?\n1) Deposit     2) Withdrawal ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("How much do you want to deposit? ");
                int amount = sc.nextInt();
                account.deposit(amount);
                break;

            case 2:
                System.out.print("How much do you want to withdraw? ");
                int retiro = sc.nextInt();
                account.withdraw(retiro);
                break;

            default:
                System.out.println("Invalid option.");
                break;
        }

        sc.close();
    }
}

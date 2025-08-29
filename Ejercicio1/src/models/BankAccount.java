package models;

public class BankAccount {
    private String nameUser;
    private int balance;

    // Constructor vacío (para usar new BankAccount() sin parámetros)
    public BankAccount() {
        this.nameUser = "Default User";
        this.balance = 0;
    }

    // Constructor con parámetros
    public BankAccount(String nameUser, int balance) {
        this.nameUser = nameUser;
        this.balance = balance;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public int getBalance() {
        return balance;
    }

    // Método para depositar
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful\n New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Método para retirar
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful\n New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

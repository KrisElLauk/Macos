package io.codelex.classesandobjects.practice;

// Each BankAccount object represents one user's account
// information including name and balance of money.

public class BankAccount {
    public String name;
    public double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public final void deposit(double amount) {
        balance = balance + amount;
    }

    public final void withdraw(double amount) {
        balance = balance - amount;
    }

    public String toString() {
        if (balance < 0) {
            double negative = Math.abs(balance);
            System.out.printf(name + ", -$" + "%.2f\n", negative);
        } else {
            System.out.printf(name + ", $" + "%.2f\n", balance);
        }
        return null;
    }

    public static void main(String[] args) {

        BankAccount ben = new BankAccount("Ben", 17.250);
        ben.toString();
        ben.deposit(17.25);
        ben.toString();
        ben.withdraw(10);
        ben.toString();

        BankAccount john = new BankAccount("John", -5.50);
        john.toString();
        john.deposit(10);
        john.toString();

    }
}

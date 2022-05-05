package io.codelex.classesandobjects.practice.Exercise_8;

public class SavingsAccount {

    private double balance;
    private double annualInterestRate;
    private double withdrawMoney;
    private double depositedMoney;
    private double totalInterest;


    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double withdraw(double withdrawMoney) {
        return balance -= withdrawMoney;
    }

    public double deposit(double depositedMoney) {
        return balance += depositedMoney;
    }

    public void monthlyInterest() {
        double monthlyInterest = (annualInterestRate / 12);
        totalInterest += (balance * monthlyInterest);
        balance += (balance * monthlyInterest);
    }

    @Override
    public String toString() {
        return "" + balance;
    }
}


//////////////////////NEPABEIGTS//////////////////
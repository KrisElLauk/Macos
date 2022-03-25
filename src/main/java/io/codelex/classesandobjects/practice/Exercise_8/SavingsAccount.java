package io.codelex.classesandobjects.practice.Exercise_8;

public class SavingsAccount {

    private double balance;
    private double annualInterestRate;
    private double withdrawMoney;
    private double depositedMoney;


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
        return balance - withdrawMoney;
    }

    public double deposit(double depositedMoney) {
        return balance + depositedMoney;
    }

    public double monthlyInterest() {
        return (annualInterestRate / 12) * balance + balance;
    }

    @Override
    public String toString() {
        return "" + balance;
    }
}


//////////////////////NEPABEIGTS//////////////////
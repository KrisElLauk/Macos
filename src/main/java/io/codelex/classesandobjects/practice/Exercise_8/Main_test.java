package io.codelex.classesandobjects.practice.Exercise_8;

import java.util.Scanner;

public class Main_test {

    public static void main(String[] args) {

        double deposit = 0;
        double withdraw = 0;
        double depositSum = 0;
        double withdrawSum = 0;
        double monthlyInterestRate = 0;
        double balance = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("How much money is in the account?: ");
        SavingsAccount account1 = new SavingsAccount(input.nextDouble());
        System.out.print("Enter the annual interest rate: ");
        account1.setAnnualInterestRate(input.nextDouble());
        System.out.print("How long has the account been opened?: ");
        int timeOpen = input.nextInt();

        for (int i = 1; i <= timeOpen; i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            deposit = input.nextDouble();
            account1.deposit(deposit);
            depositSum += deposit;
            System.out.print("Enter amount withdrawn for month " + i + ": ");
            withdraw = input.nextDouble();
            account1.withdraw(withdraw);
            withdrawSum += withdraw;
            account1.monthlyInterest();
            monthlyInterestRate = account1.getTotalInterest();
            balance = account1.getBalance();


        }
        System.out.printf("Total deposited: $%.2f", depositSum);
        System.out.printf("\nTotal withdrawn: $%.2f", withdrawSum);
        System.out.printf("\nInterest earned: $%.2f", monthlyInterestRate);
        System.out.printf("\nEnding balance: $%.2f", balance);
    }
}

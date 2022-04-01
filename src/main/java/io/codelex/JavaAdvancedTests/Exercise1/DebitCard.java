package io.codelex.JavaAdvancedTests.Exercise1;

public class DebitCard extends Card {

    double balance;

    public DebitCard(long cardNumber, String fullName, int CCV, double balance) {
        super(cardNumber, fullName, CCV);
        this.balance = balance;
    }

    public double getBalance() {
        if (balance > 10000) {
            System.out.println("Warning: Too much money!");
        }
        return balance;
    }

    @Override
    double withdraw(double withdraw) {
        try {
            if (balance < withdraw) {
                throw new NotEnoughFundsException("Error!");
            }
        } catch (NotEnoughFundsException e) {
            System.out.println("Not enough funds in card to withdraw the amount of money!");
            return balance;
        }
        return balance = -withdraw;
    }

    @Override
    double deposit(double deposit) {
        if (balance > 10000) {
            System.out.println("Warning: Too much money!");
        }
        return balance += deposit;
    }
}

package io.codelex.JavaAdvancedTests.Exercise1;

public abstract class Card {

    private long cardNumber;
    private String fullName;
    private int CCV;


    public Card(long cardNumber, String fullName, int CCV) {
        this.cardNumber = cardNumber;
        this.fullName = fullName;
        this.CCV = CCV;
    }

    abstract double withdraw(double withdraw) throws NotEnoughFundsException;

    abstract double deposit(double deposit) throws NotEnoughFundsException;
}

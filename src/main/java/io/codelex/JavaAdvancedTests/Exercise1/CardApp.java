package io.codelex.JavaAdvancedTests.Exercise1;

public class CardApp {

    public static void main(String[] args) throws NotEnoughFundsException {

        CreditCard bobby = new CreditCard(4481324512341234L, "Bob Curtis", 784, 300);
        DebitCard john = new DebitCard(4454123152341234L, "John Crack", 431, 7800);

        System.out.println(bobby.getBalance());
        bobby.withdraw(250);
        System.out.println(bobby.getBalance());
        bobby.withdraw(60);
        System.out.println(bobby.getBalance());
        bobby.deposit(100);
        System.out.println(bobby.getBalance());

        System.out.println();

        System.out.println(john.getBalance());
        john.deposit(3000);
        System.out.println(john.getBalance());

    }
}

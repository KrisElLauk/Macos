package io.codelex.oop.Exercise_2;

public class Customer extends Person {

    String customerId;
    int purchaseCount;

    public Customer(String firstName, String lastName, String id, int age, String customerId, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.customerId = customerId;
        this.purchaseCount = purchaseCount;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    String getInfo() {
        return getFirstName() + " " + getLastName() + " " + customerId + " (" + purchaseCount + " purchases).";
    }
}

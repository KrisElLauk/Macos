package io.codelex.oop.Exercise_2;

abstract class Person {

    private String firstName;
    private String lastName;
    private String id;
    private int age;

    public Person(String firstName, String lastName, String id, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    abstract String getInfo();
}

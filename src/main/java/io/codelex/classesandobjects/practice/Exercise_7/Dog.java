package io.codelex.classesandobjects.practice.Exercise_7;

public class Dog {

    String name;
    String sex;
    String father;
    String mother;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public void parents(String mother, String father) {
        this.father = father;
        this.mother = mother;
        System.out.println(name + " has " + mother + " as mother, and " + father + " as father.");
    }

    public void fathersName() {

        if (father == null) {
            System.out.println("Unknown");
        } else {
            System.out.println(father);
        }
    }

    public void hasSameMotherAs(Dog dog) {

        if (!(dog.mother.equals(dog.mother))) {
            System.out.println("Does not have same mother.");
        } else {
            System.out.println("Has same mother.");
        }
    }

    @Override
    public String toString() {
        return name + ", " + sex;
    }
}

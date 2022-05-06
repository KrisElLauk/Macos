package io.codelex.classesandobjects.practice.Exercise_7;

public class DogTest {

    public static void main(String[] args) {

        Dog max = new Dog("Max", "male");
        Dog rocky = new Dog("Rocky", "male");
        Dog sparky = new Dog("Sparky", "male");
        Dog buster = new Dog("Buster", "male");
        Dog sam = new Dog("Sam", "male");
        Dog lady = new Dog("Lady", "female");
        Dog molly = new Dog("Molly", "female");
        Dog coco = new Dog("Coco", "female");

        System.out.println(max);
        System.out.println(rocky);
        System.out.println(sparky);
        System.out.println(buster);
        System.out.println(sam);
        System.out.println(lady);
        System.out.println(molly);
        System.out.println(coco);
        System.out.println();

        max.parents("Lady", "Rocky");
        coco.parents("Molly", "Buster");
        rocky.parents("Molly", "Sam");
        rocky.parents("Lady", "Sparky");
        System.out.println();
        
        coco.fathersName();
        sparky.fathersName();
        System.out.println();

        coco.hasSameMotherAs(rocky);
        max.hasSameMotherAs(coco);

    }
}

package io.codelex.oop.Exercise_7_8;

public class ComputerApp {

    public static void main(String[] args) {

        Computer computer = new Computer("Intel i5-2400", "8GB", "Gigabyte GeForce 1050Ti", "Dell", "D2000");
        System.out.println(computer);

        String getGpu = computer.getGraphicsCard();
        System.out.println(getGpu);

        Laptop laptop = new Laptop("AMD Ryzen 5 4600", "16GB", "AMD Radeon RX 6600", "Asus", "AS320", "Battery 9000");
        System.out.println(laptop);

        String getBattery = laptop.getBattery();
        System.out.println(getBattery);
    }


}

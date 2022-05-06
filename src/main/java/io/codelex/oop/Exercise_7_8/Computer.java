package io.codelex.oop.Exercise_7_8;

import java.util.Objects;

public class Computer {

    private final String processor;
    private final String ram;
    private final String graphicsCard;
    private final String company;
    private final String model;

    public Computer(String processor, String ram, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Computer)) {
            return false;
        }
        Computer computer = (Computer) obj;
        return getProcessor().equals(computer.getProcessor())
                && getRam().equals(computer.getRam())
                && getGraphicsCard().equals(computer.getGraphicsCard())
                && getCompany().equals(computer.getCompany())
                && getModel().equals(computer.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsCard, company, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

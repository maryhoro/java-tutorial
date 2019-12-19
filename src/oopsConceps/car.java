package oopsConceps;

public class car {
    private String model;
    private int year;
    private String color;
    private String make;

    /*public car(String make) {
        this.make = make;
    }*/


    public void increaseSpeed() {
        System.out.println("Increasing the speed");
    }

    public car createNewCar() {
        return new car();
    }

}
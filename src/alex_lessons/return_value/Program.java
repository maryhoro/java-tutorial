package alex_lessons.return_value;

public class Program {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Distance travelled before fuelling: " + car.getDistanceTravelled());
        car.addFuel(6);
        car.start();
        System.out.println("Distance travelled after fuelling: " + car.getDistanceTravelled());
    }

}

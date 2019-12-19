package alex_lessons.return_value;

// A car which travels 30 miles per gallon
class Car {
    private int fuel;               // in gallons
    private int speed;              // in miles per hour
    private int distanceTravelled;  // in miles

    void addFuel(int howMuch) {
        fuel = fuel + howMuch;
    }

    void start() {
        while (fuel > 0) {
            distanceTravelled = distanceTravelled + 30;
            fuel = fuel - 1;
        }
    }

    int getDistanceTravelled() {
        return distanceTravelled;
    }
}

package alex_lessons.singleton;

public class Engine {
    int speed; // miles per hour
    int fuel;  // gallons

    void start() {
        if (fuel > 0) {
            speed = 60;
        }
    }
}

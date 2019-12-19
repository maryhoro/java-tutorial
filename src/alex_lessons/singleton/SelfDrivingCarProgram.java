package alex_lessons.singleton;

public class SelfDrivingCarProgram {
    public static void main(String[] args) {
        Engine engine = new Engine(); // THIS IS A SINGLETON
        // Engine engine2 = new Engine(); THIS LINE WOULD MAKE IT NOT A SINGLETON ANY LONGER
        engine.start();
    }
}

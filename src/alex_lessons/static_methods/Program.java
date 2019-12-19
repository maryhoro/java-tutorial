package alex_lessons.static_methods;

// This class defines EXACTLY two methods: "main" and "sum".
// In this program there are exactly two method calls "System.out.println" and "sum".
public class Program {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        System.out.println("Sum of " + x + " and " + y + " is " + sum(x, y));
    }

    static int sum(int a, int b) {
        return a + b;
    }
}

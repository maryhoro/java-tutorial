package alex_lessons.methods;

public class Program {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.a = 5;
        s.b = 6;
        System.out.println("Sum of " + s.a + " and " + s.b + " is " + s.result());
    }
}

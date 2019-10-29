package mariaTasks;

public class EvenOdd {


    public static boolean calculator(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println( calculator(0));
    }
}

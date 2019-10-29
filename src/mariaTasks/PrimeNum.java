package mariaTasks;

public class PrimeNum {
    public static void main(String[] args) {

        System.out.println(prime(7));


    }

    private static boolean prime(int n) {
        for (int i = 2; i < n; n++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}



package mariaTasks;

import java.util.Arrays;

public class computeAverage {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        System.out.println(computeAverage(a));
        System.out.println(Arrays.toString(collapse.collapseIt(a)) );
    }

    public static double computeAverage(int[] a) {
        double result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        result = result / a.length;
        return result;

    }
}
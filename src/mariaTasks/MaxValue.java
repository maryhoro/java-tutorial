package mariaTasks;

public class MaxValue {


    static int [] a = new int [] {17, 7, -1, 26, 3, 123,9};


    public static int maxValue (int [] a) {
        int max = a [0];
        for (int i = 1; i < a.length; i ++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        return max;
    }

    public static void main(String[] args) {

        System.out.println(maxValue(a));
    }
}

//   Method accepts an array of integers as a parameter and returns the maximum value in the array.
//   For example, if an array named a passed stores {17, 7, -1, 26, 3, 9}, the call of maxValue(a) should return 26.
//   You may assume that the array contains at least one element. Your method should not modify the elements of the array.



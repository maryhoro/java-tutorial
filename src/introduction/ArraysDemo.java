package introduction;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] myIntArray1 = {100, 90};
        // myIntArray1 = new int[10];

        //myIntArray1[0] = 100;
        //myIntArray1[1] = 90;

        System.out.println("0 index: " + myIntArray1[0]);
        System.out.println("1st index: " + myIntArray1[1]);
        //System.out.println("2nd index: " + myIntArray1[2]);

        String[] myStringArray1 = {"bmw", "audi", "honda"};
        System.out.println("0 index: " + myStringArray1[0]);
        System.out.println("1st Index: " + myStringArray1[1]);
        System.out.println("2nd Index: " + myStringArray1[2]);

        int len1 = myIntArray1.length;
        int len2 = myStringArray1.length;

        System.out.println("Int array lenght: " + len1);
        System.out.println("String array length: " + len2);


    }

}

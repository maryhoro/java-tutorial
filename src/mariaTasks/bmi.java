package mariaTasks;

import java.util.Scanner;


public class bmi {

    public static double bmiCount(double weight, double height) {
        double b = 2;
        return weight / (Math.pow(height, b)) * 703;
    }

    public static int classCount(double index) {
        if (index < 18.5) {
            return 1;
        } else if (index < 25) {
            return 2;
        } else if (index < 30) {
            return 3;
        } else
            return 4;

    }

    public static void main(String[] args) {
        Scanner MyScan = new Scanner(System.in);
        double userHeight1;
        double userWeight1;
        double userHeight2;
        double userWeight2;


        System.out.println("Person 1's information:");
        System.out.print("height (in inches) ? ");
        userHeight1 = MyScan.nextDouble();
        System.out.print("weight (in pounds)? ");
        userWeight1 = MyScan.nextDouble();
        System.out.printf("BMI = %.1f%n", bmiCount(userWeight1, userHeight1));
        System.out.println("Class " + classCount(bmiCount(userWeight1, userHeight1)));
        System.out.println();

        System.out.println("Person 2's information:");
        System.out.print("height (in inches) ? ");
        userHeight2 = MyScan.nextDouble();
        System.out.print("weight (in pounds)? ");
        userWeight2 = MyScan.nextDouble();
        System.out.printf("BMI = %.1f%n", bmiCount(userWeight2, userHeight2));
        System.out.println("Class " + classCount(bmiCount(userWeight2, userHeight2)));
        System.out.println();

        System.out.println("Have a nice day!");

    }
}

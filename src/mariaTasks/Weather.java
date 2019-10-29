package mariaTasks;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Weather {
    public static void main(String[] args) throws Exception {

        try {
            Scanner input = new Scanner(new File("/Users/maria/Desktop/weather.txt"));
            double num1 = input.nextDouble();

            while (input.hasNext()) {
                if (!input.hasNextDouble()) {
                    input.next();
                    continue;
                }  // to skip non-digits

                double num2 = input.nextDouble();
                double diff = num2 - num1;
                System.out.printf("%s to %s, change = %.1f%n", num1, num2,diff);
                num1 = num2;
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File not found  :(");

        }


    }


}

/*package head_first_java;

import java.util.Scanner;

public class game_test {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int hitTry = myScan.nextInt();
        System.out.println("Make a hit");

        //int numOfTries =+ 1;
        //System.out.println("number of tries = " + numOfTries);

        int startIndex = (int) (Math.random() * 5);
        int[] ship = {startIndex, startIndex + 1, startIndex + 2};
        // [3, 4, 5]

        for (int i : ship) {
            System.out.println(i);
        }// foreach loop


        int guesses = 0;
        if (winOrNot) {
            guesses =+1;
        }

        if (guesses == 3) {
            System.out.println("You won!");
        } else if (guesses < 3) {
            System.out.println("Try to kill it");
        }

    }




    public  static boolean winOrNon(int hitTry, int startIndex) {
        if (hitTry == startIndex || hitTry == startIndex +1 || hitTry == startIndex +2) {
            guesses =+1;
            System.out.println("You hit it!");
            return true;
        } else {
            System.out.println("You missed it. Try again.");
            return false;
        }
    }


}
}
 */

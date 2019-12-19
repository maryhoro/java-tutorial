package head_first_java;

import java.util.Scanner;

public class ButtleShip {


    public static void main(String[] args) {
        int numOfTries = 0;
        boolean allShipsAreKilled = false;
        int maxShipLocation = 100;
        int shipLength = 3;
        int shipStart = (int) (Math.random() * (maxShipLocation - shipLength + 1));
        int[] ship = new int[shipLength];


        while (!allShipsAreKilled) {
            System.out.println("Please, shoot! Type a number from 0 to " + maxShipLocation);
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            if (number < 0 || number > maxShipLocation) {
                System.out.println("Number should be from 0 to " + maxShipLocation);
                continue;
            }
            int result = check(number, maxShipLocation, shipStart, shipLength, ship);
            switch (result) {
                case 0:
                    System.out.println("Hit");
                    break;
                case 1:
                    System.out.println("Missed");
                    break;
                case 2:
                    allShipsAreKilled = true;
                    System.out.println("All ships are Killed");
                    break;
                default:
                    throw new RuntimeException("Result not supported");

            }
            numOfTries++;
        }
        System.out.println("Number of tries " + numOfTries);
    }


    private static int check(int number, int maxShipLocation, int shipStart, int shipLength, int[] ship) {
        if (number < 0 || number > maxShipLocation) {
            throw new RuntimeException("Input not supported");
        }
        number -= shipStart;
        if (number < 0 || number >= shipLength) {
            return 1;
        }
        ship[number] = 1;
        if (killed(ship))
            return 2;
        return 0;
    }

    private static boolean killed(int[] ship) {
        for (int value : ship) {
            if (value == 0) {
                return false;
            }
        }
        return true;
    }


}


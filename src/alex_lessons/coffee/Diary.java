package alex_lessons.coffee;

import java.time.MonthDay;

public class Diary {
    public static void main(String[] args) {
        /*  Meal breakfast = new Meal();
        Meal lunch = new Meal();
        Meal dinner = new Meal();

        breakfast.fat = 330;
        breakfast.carbs = 407;
        breakfast.protein = 200;

        System.out.println("total calories " + breakfast.calories());

        String a = "This is a test string";
        System.out.println("<<<" + a.substring(1, 9) + ">>>");



        String temp;
        int degree = 78;

        if (degree < 40) {
            temp = "low";
        } else {
            if (degree < 100) {
                temp = " warmer";
            } else {
                if (degree < 200) {
                    temp = "hot";
                } else {
                    temp = "very hot";
                }
            }
        }


        if (degree < 40) {
            temp = "low";
        } else if (degree < 100) {
            temp = " warmer";
        } else if (degree < 200) {
            temp = "hot";
        } else {
            temp = "very hot";
        }


        System.out.println("maria ordered coffee " + temp + " temperature");

         */

        String weekday = "Monday";
        String task = "drink coffee";

        for (int i = 1; i <= 5; i ++){
            System.out.println(i);
        }
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if (aSmile == true && bSmile == true) {
            return true;
        } else if (aSmile == false && bSmile == false) {
            return true;
        } else {
            return false;
        }
       /* public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            if (aSmile && bSmile) {
                return true;
            }
            if (!aSmile  && !bSmile) {
                return true;
            }
            return false;
        }*/
    }


    public boolean posNeg(int a, int b, boolean negative) {
        if (a < 0 && b < 0 && negative) {
            return true;
        }
        if ((a < 0 && b < 0) && !negative) {
            return false;
        }
        if ((a < 0 || b < 0) && negative) {
            return false;
        }
        if ((a < 0 || b < 0) && !negative) {
            return true;
        }
        return false;
    }

    public boolean posNeg2(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return a * b < 0;
        }
    }
}


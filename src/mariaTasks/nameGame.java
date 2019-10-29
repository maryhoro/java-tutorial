package mariaTasks;
import java.util.Scanner;


public class nameGame {

    public static void bananaGame (String name, String subName) {

        System.out.println(name + ", " + name + ", " + "bo-B" + subName);
        System.out.println("Banana-fana fo-F" + subName);
        System.out.println("Fee-fi-mo-M" + subName);
        System.out.println(name.toUpperCase() + "!");


        /* using a + operator (string concatenation)

        String result = name + ", " + name + ", " + "bo-B" + subName + "\n" +
                "Banana-fana fo-F" + subName + "\n" +
                "Fee-fi-mo-M" + subName + "\n" +
                name.toUpperCase() + "!";

         */


       /* using a string builder (string concatenation)

        StringBuilder builder = new StringBuilder();
        builder.append(name + ", " + name + ", " + "bo-B" + subName + "\n").append("jajaja");

        System.out.println(builder.toString());

        */
    }




    public static void main(String[] args) {
        Scanner MyScan = new Scanner(System.in);


        System.out.print("What is your name? ");
        String fullName = MyScan.nextLine();
        int space = fullName.indexOf(' ');

            if (fullName.startsWith("maria")) {

                System.out.println("name cannot be Maria");
            } else {


                String firstName = fullName.substring(0, space);
                String subFirst = firstName.substring(1, space);

                String lastName = fullName.substring(space + 1);
                String subLast = lastName.substring(1);


                bananaGame(firstName, subFirst);
                System.out.println();
                bananaGame(lastName, subLast);


      /* using a String split

       bananaGame(parts[0], parts[0].substring(1));
        System.out.println();
        bananaGame(parts[1], parts[1].substring(1));


       */
            }

    }
}

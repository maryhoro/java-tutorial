/*
package mariaTasks;


import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReversiblePoem {

    public static String reversedPoem() {
        try {
            Scanner myScan = new Scanner(new File("/Users/maria/Desktop/reversePoem.txt"));

            ArrayList<String> poem = new ArrayList<String>();

            while (myScan.hasNextLine()) {
                poem.add(myScan.nextLine());
            }
            for (int i = poem.size() - 1; i >= 0; i--) {
                System.out.println(poem.get(i));
            }
return new String(poem);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found :(");
        }


    }

    public static void main(String[] args) {


    }




}

 */
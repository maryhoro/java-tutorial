package mariaTasks;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;


public class Election {
    public static void main(String[] args) throws Exception {

        int win1 = 0;
        int win2 = 0;

        Scanner read = new Scanner(new File("/Users/maria/Desktop/polls.txt"));

        while (read.hasNextLine()) {
            String line = read.nextLine(); //CT 56 31 7 Oct U. of Connecticut

            Scanner tokens = new Scanner(line);

            tokens.next();
            int vote1 = tokens.nextInt();
            int vote2 = tokens.nextInt();
            int eVote = tokens.nextInt();

            if (vote1 > vote2) {
                win1 += eVote;
            } else if (vote1 < vote2) {
                win2 += eVote;
            } else {
                win2 += 0;
            }
        }
        System.out.println("Candidate 1: " + win1);
        System.out.println("Candidate 2: " + win2);



    }


}

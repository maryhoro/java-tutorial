package mariaTasks;

public class Reverse {

    public static  char [] reverse (String str){

        char [] letter =str.toCharArray();
        int first = 0;
        int last = str.length() - 1;
        while (first < last) {
            char c = letter [first];
            letter [first] = letter [last];
            letter [last] = c;
            first ++; last --;
        }
        return letter;
    }

    public static void main(String[] args) {

        System.out.println( reverse( "K horokhorina"));
    }
}



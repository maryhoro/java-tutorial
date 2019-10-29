package mariaTasks;

public class stutter {

    public static String repeat (String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            String letter = s.substring(i, i + 1);
            result += letter;
            result += letter;
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println( repeat("hello!"));

        System.out.println( Reverse.reverse( "K horokhorina"));
    }
}

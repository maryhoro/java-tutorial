package mariaTasks;

public class PrintBackward {

    public static String printBackward(String s) {
        char[] res = new char[s.length()];
        for (int i = s.length() - 1, j = 0; i >= 0; i--, j++) {
            res[j] = s.charAt(i);
        }
        return new String(res);

    }


    public static String martyReverse(String s) {
        String letter = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            letter += s.substring(i, i + 1);
        }
        return letter;
    }

    public static void main(String[] args) {
        System.out.println(martyReverse("maria"));
        System.out.println(printBackward("hello"));
    }

}

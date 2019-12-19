package alex_lessons.string_api;

public class SimpleString {
    private char[] letters;

    public SimpleString(char[] ltrs) {
        letters = new char[ltrs.length];
        for (int i = 0; i < ltrs.length; i++) {
            letters[i] = ltrs[i];
        }
        // letters = Arrays.copyOf(ltrs, ltrs.length);
    }

    public char charAt(int i) {
        return letters[i];
    }
}

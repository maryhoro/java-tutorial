package mariaTasks;

public class collapse {

    public static int [] collapseIt (int [] a) {
        if (a.length % 2 == 0) {

            int[] b = new int[(a.length / 2)];
            int j = 0;
            for (int i = 0; i < a.length; i += 2) {
                b[j] = a[i] + a[i + 1];
                j++;
            }
            return b;
        } else {
            int[] b = new int[a.length / 2  + 1];
            int j = 0;
            for (int i = 0; i < a.length - 1; i += 2) {
                b[j] = a[i] + a[i + 1];
                j++;
            }
            b [b.length - 1] = a [a.length - 1];
            return b;
        }

    }
    // alex's addition
    /*
    public static int [] collapse (int [] a) {

    if (a.length == 0) return a;
    int j = 0;
    boolean isEven = a.length % 2 == 0;
    int b_length = isEven ? a.length / 2 : a.length / 2 + 1;
    int[] b = new int [b_length];
    for (int i = 0; i < a.length - 2; i += 2) {
      b [j] = a [i] + a[i + 1];
      j++;
    }
    b[b.length -1] = isEven ? a[a.length - 1] + a[a.length - 2] : a[a.length - 1];
    return b;
}
 */



}

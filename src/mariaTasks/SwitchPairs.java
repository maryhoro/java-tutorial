package mariaTasks;

public class SwitchPairs {


    public static char[] switchIt(String s) {


            String pair;
            char[] result = new char[s.length()];
            for (int i = 0; i < s.length(); i += 2) {
                pair = s.substring(i, i + 2);
                char[] reversedPair = pair.toCharArray();
                int first = 0;
                int last = 1;
                char c;

                c = reversedPair[first];
                reversedPair[first] = reversedPair[last];
                reversedPair[last] = c;
    
                result[i] = reversedPair[first];
                result[i + 1] = reversedPair[last];
            }

            return result;
    }

    public static String switchPairs(String str) {
        char[] arr = str.toCharArray();

        for(int i = 0; i <= arr.length - 2; i += 2) {
            char temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        return new String(arr);
    }



    // a = reversedPair[first]
    // b = c
    // c = result[i]
       /* int a = 4;
        int b = a;
        int c = b;

        int a = 4;
        int c = a; */


    char[] toCharArray(String s) {
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[i] = s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(switchIt("marink"));

    }
}

package mariaTasks;

public class DaysInMonth {

    public static int daysInMonth(int m) {
        if (m == 2)
            return 28;
        else if (m == 4 || m == 6 || m == 9 || m == 11)
            return 30;
        return 31;
    }

    public static void main(String[] args) {
        System.out.println(daysInMonth(3));
    }
}

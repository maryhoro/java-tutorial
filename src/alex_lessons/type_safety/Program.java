package alex_lessons.type_safety;

public class Program {
    public static void main(String[] args) {
        Apple granny_smith = new Apple();
        granny_smith.sugar = 5;

        Apple red_delicious = new Apple();
        red_delicious.sugar = 4;

        Pear bosc = new Pear();
        bosc.sugar = 7;

        Pear comice = new Pear();
        comice.sugar = 8;

        granny_smith = red_delicious; // compiles
        bosc = comice; // compiles
        // granny_smith = comice; OUCH! DOES NOT COMPILE BECAUSE OF TYPE SAFETY

        // somehow sort and print the top
    }
}

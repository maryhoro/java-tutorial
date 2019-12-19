package alex_lessons.coffee;

public class AlexTypes {
    public static void main(String[] args){
        Coffee capuccino = new Coffee();
        capuccino.milk = 5;
        capuccino.sugar = 1;
        Coffee latte = new Coffee();
        latte.milk = 100;
        latte.sugar = 20;
        Coffee americano = capuccino;

        System.out.println(capuccino.ounces() + latte.ounces());
/*
        String name = "Maria";
        String name1 = "Maria";
        ounces(4);
        System.out.println(capuccino.sugar);
        addSugar(capuccino);
        System.out.println(capuccino.sugar);


        int oz = 1;
        System.out.println(oz);
        addSugar(oz);
        System.out.println(oz);
*/

    }

    public static void addSugar(Coffee coffee) {
        coffee.sugar = coffee.sugar + 1;
    }

    public static void addSugar(int ounces) {
        ounces = ounces + 4;
    }
}

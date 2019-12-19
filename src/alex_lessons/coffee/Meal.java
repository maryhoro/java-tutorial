package alex_lessons.coffee;

public class Meal {
    int carbs;
    int fat;
    int protein;

    /* How it looks to the compiler:

    int calories(Meal this) {
        return this.carbs + this.fat + this.protein;
    }

     */
    int calories() {
        return carbs + fat + protein;
    }

}


package lesson7;

public class Main {

    public static void main(String[] args)
    {
        Cat[] cats = {
                new Cat("Барсик", 6),
                new Cat("Снежок", 7),
                new Cat("Мотя", 4)
        };

        Plate plate = new Plate(18);

        for (Cat cat : cats)
        {
            cat.eat(plate);
        }

        plate.addFood(10);

        for (Cat cat : cats)
        {
            cat.eat(plate);
        }
    }
}

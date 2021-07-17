package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.hasFood(appetite) && !satiety) {
            System.out.println(name + " кушает");
            plate.foodReduction(appetite);
            satiety = true;
        } else if (!plate.hasFood(appetite)) {
            System.out.println(name + " нехватает еды!");
        } else if (satiety) {
            System.out.println(name + " наелся!");
        }
    }
}

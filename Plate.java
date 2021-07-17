package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void foodReduction(int appetite) {
        if (hasFood(appetite)) {
            food -= appetite;
        } else {
            System.out.println("Котики не смогут наестся!");
        }
    }

    public boolean hasFood(int appetite)
    {
        return appetite < food;
    }

    public void addFood(int moreFood) {
        food += moreFood;
    }
}

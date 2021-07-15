public class Cat extends Animal {
    public Cat(String name, float maxRun) {
        super(name, maxRun, Integer.MIN_VALUE);
    }

    @Override
    public void swim(float desiredDistance) {
        System.out.println("Кошки не умеют плавать!");
    }
}
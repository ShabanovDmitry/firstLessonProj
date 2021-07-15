public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Алиса", 200);
        Dog dog = new Dog("Шарик",500, 10);

        cat.run(150);
        cat.swim(5);

        dog.run(550);
        dog.swim(9);
    }
}
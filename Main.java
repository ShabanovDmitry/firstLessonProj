public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Алиса", 150, "кошки не умеют плавать!");
        Dog dog = new Dog("Макс", 50, 7);
        String catCan = " пробежала ";
        String catCant = " не может пробежать ";
        String dogCan = " пробежал ";
        String dogCant = " не может пробежать ";
        String dogCanSwim = " проплыл ";
        String dogCantSwim = " не может проплыть ";


        if (cat.run > 200 && dog.run > 500 && dog.swim > 10) {
            System.out.println(cat.name + catCant + cat.run + cat.cantSwim);
            System.out.println(dog.name + dogCant + dog.run + dogCantSwim + dog.swim + " м.");
        }

        if (cat.run > 200 && dog.run > 500 && dog.swim <= 10) {
            System.out.println(cat.name + catCant + cat.run + cat.cantSwim);
            System.out.println(dog.name + dogCant + dog.run + dogCanSwim + dog.swim + " м.");
        }

        if (cat.run > 200 && dog.run <= 500 && dog.swim > 10) {
            System.out.println(cat.name + catCant + cat.run + cat.cantSwim);
            System.out.println(dog.name + dogCan + dog.run + dogCantSwim + dog.swim + " м.");
        }

        if (cat.run > 200 && dog.run <= 500 && dog.swim <= 10) {
            System.out.println(cat.name + catCant + cat.run + cat.cantSwim);
            System.out.println(dog.name + dogCan + dog.run + dogCanSwim + dog.swim + " м.");
        }

        if (cat.run <= 200 && dog.run > 500 && dog.swim > 10) {
            System.out.println(cat.name + catCan + cat.run + cat.cantSwim);
            System.out.println(dog.name + dogCant + dog.run + dogCantSwim + dog.swim + " м.");
        }

        if (cat.run <= 200 && dog.run > 500 && dog.swim <= 10) {
            System.out.println(cat.name + catCan + cat.run + cat.cantSwim);
            System.out.println(dog.name + dogCant + dog.run + dogCanSwim + dog.swim + " м.");
        }

        if (cat.run <= 200 && dog.run <= 500 && dog.swim > 10) {
            System.out.println(cat.name + catCan + cat.run + cat.cantSwim);
            System.out.println(dog.name + dogCan + dog.run + dogCantSwim + dog.swim + " м.");
        }

        if (cat.run <= 200 && dog.run <= 500 && dog.swim <= 10) {
            System.out.println(cat.name + catCan + cat.run + cat.cantSwim);
            System.out.println(dog.name + dogCan + dog.run + dogCanSwim + dog.swim + " м.");
        }
    }
}

public class Animal {
    protected String name;
    private float maxRun;
    private float maxSwim;


    public Animal(String name, float maxRun, float maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(float desiredDistance) {
        if (desiredDistance > maxRun) {
            System.out.println(name + " не может пробежать " + desiredDistance);
            System.out.println("Максимальная длина забега " + maxRun);
        } else {
            System.out.println(name + " успешно преодолевает дистанцию забега " + desiredDistance);
        }
    }

    public void swim(float desiredDistance) {
        if (desiredDistance > maxSwim) {
            System.out.println(name + " не может проплыть " + desiredDistance);
            System.out.println("Максимальная длина заплыва " + maxSwim);
        } else {
            System.out.println(name + " успешно преодолевает дистанцию заплыва " + desiredDistance);
        }
    }
}
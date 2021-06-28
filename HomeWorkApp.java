public class HomeWorkApp {
    public static void main(String[] args) {
        //Урок №1
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        //Урок №2
        checkSum(10, 9);
        checkTrue(10);
        checkFalse(10);
        printMessage(4, "Задание №4");
        years(2021);
    }

    //Урок №1

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(){
        int a = 42;
        int b = -62;
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;
        if (value <= 0) {
            System.out.println("Красный");
        }
        boolean a = (value > 0 & value <= 100);
        if (a) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 12;
        int b = 71;
        if (a >= b) {
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
    }

    //Урок №2

    public static boolean checkSum(int a, int b) {
        int c = a + b;
        return (c >= 10 & c <= 20);
    }

    public static void checkTrue(int b) {
        boolean P = b >= 0;
        if (P == true) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean checkFalse(int b) {
        boolean P = b >= 0;
        return (!P);
    }

    public static void printMessage(int count, String message) {
        int number = 0;
        while (number < count) {
            System.out.println(message);
            number++;
        }
    }

    public static boolean years(int y) {
        return (y % 4 == 0 & (y % 400 == 0 | y % 100 != 0));
    }
}

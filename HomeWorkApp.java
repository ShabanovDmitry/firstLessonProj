import java.util.Arrays;
import java.util.Scanner;

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
        //Урок №3
        change();
        hundred();
        doubling();
        diagonals();
        lenInitialValue();
        maxMin();
//        checkBalance();
        changeOfPlaces();
    }

    //Урок №1

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
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
        boolean a = (value > 0 && value <= 100);
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
        } else {
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
        return (y % 4 == 0 && (y % 400 == 0 || y % 100 != 0));
    }

    //Урок №3

    public static void change() {
        int[] arr = {1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void hundred() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = (i + 1);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void doubling() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = (arr[i] * 2);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void diagonals() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == (arr.length - j - 1)) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            String text = Arrays.toString(arr[i]);
            System.out.println(text);
        }
    }

    public static void lenInitialValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите len: ");
        int len = sc.nextInt();
        System.out.println("Введите initialValue: ");
        int initialValue = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void maxMin() {
        int max = -100;
        int min = 100;
        int[] arr = {1, 8, 4, 2, 10, 11, -1, 3, 5, -23, 7, 21};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальное:" + max);
        System.out.println("Минимальное:" + min);
    }

// 7  задание ещё не понял как делать
//    public static boolean checkBalance() {
//        int a = 0;
//       int b = 0;
//        int[] arr = {2, 3, 4, 1, 3, 1, 3, 3};
//        int c = arr.length;
//        for (int i = 0; i < arr.length; i++) {
//            a = a + arr[i];
//            b = b + arr[arr.length - 1];
//        }
//        return (a == b);
//    }

    public static void changeOfPlaces() {
        int a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = sc.nextInt();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Заполните массив:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        if (n > 0) {
            for (int j = 0; j < n; j++) {
                a = arr[arr.length - 1];
                for (int i = 1; i < arr.length; i++) {
                    arr[arr.length - i] = arr[arr.length - i - 1];
                }
                arr[0] = a;
            }
        }
        if (n < 0) {
            for (int j = 0; j > n; j--) {
                a = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = a;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
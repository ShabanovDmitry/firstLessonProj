import java.util.Arrays;
import java.util.Random;
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
        //Урок №4
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победа человека");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            if (checkWin(DOT_O)) {
                System.out.println("Победа искуственного интеллекта");
                break;
            }
            aiTurn();
            printMap();
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Конец игры");
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

    //Урок №4

    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand =new Random();
    public static boolean checkWin(char symb) {
        for (int i = 0; i < SIZE; i++) {
            if(map[i][0] == symb && map[i][1] == symb && map[i][2] == symb) return true;
//            if(map[i][0] == symb && map[i][1] == symb && map[i][2] == symb && map[i][3] == symb) return true; // Для 4 фишек
            if(map[0][i] == symb && map[1][i] == symb && map[2][i] == symb) return true;
//            if(map[0][i] == symb && map[1][i] == symb && map[2][i] == symb && map[3][i] == symb) return true; // Для 4 фишек
        }
        boolean right, left;
        right = true;
        left = true;
        for (int i = 0; i < SIZE; i++) {
            right = (map[i][i] == symb);
            left = (map[SIZE - i - 1][i] == symb);
        }
        if (right || left) return true;
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер сделал ход в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
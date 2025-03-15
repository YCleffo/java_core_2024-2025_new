package Lb9.irl;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        fillArray(array, 0, scanner);

        System.out.print("Массив: ");
        printArray(array, 0);

        scanner.close();
    }

    public static void fillArray(int[] array, int index, Scanner scanner) {
        if (index < array.length) {
            array[index] = scanner.nextInt();
            fillArray(array, index + 1, scanner);
        }
    }

    public static void printArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            printArray(array, index + 1);
        }
    }
}

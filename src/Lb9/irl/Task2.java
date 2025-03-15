package Lb9.irl;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.print("Двоичное представление: ");
        toBinary(number);
        System.out.println();
    }

    public static void toBinary(int n) {
        if (n > 1) {
            toBinary(n / 2);
        }
        System.out.print(n % 2);
    }
}

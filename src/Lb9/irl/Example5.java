package Lb9.irl;

public class Example5 {
    //    public static void main(String[] args) {
//        System.out.println(fact(5));
//    }
//
//    public static int fact(int n) {
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        } else {
//            return fact(n - 2) + fact(n - 1);
//        }
//    }

//    public static void main(String[] args) {
//        int number = 5;
//        System.out.println("Факториал " + number + " = " + fact(number));
//    }
//
//    public static int fact(int n) {
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * fact(n - 1);
//        }
//    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Число Фибоначчи " + n + " = " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        System.out.println("Вызов fibonacci(" + n + ")");
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

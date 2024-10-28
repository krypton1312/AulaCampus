package recursia.ejemplo;

public class RecursiaEjemplo {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(potencia(5, 4));
        System.out.println(sumatorio(5));
        System.out.println(multiplic(5, 3));
        System.out.println(division(10, 2));
        System.out.println(resto(12, 5));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static double potencia(double x, double y) {
        if (y == 0) {
            return 1;
        } else {
            return x * potencia(x, y - 1);
        }
    }

    public static int sumatorio(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumatorio(n - 1);
        }
    }

    public static double multiplic(double x, double y) {
        if (y == 0) {
            return 0;
        } else if (y == 1) {
            return x;
        } else {
            return x + multiplic(x, y - 1);
        }
    }

    public static int division(int x, int y) {
        if (y == 0) {
            return -1;
        } else if (x < y) {
            return 0;
        } else {
            return 1 + division(x - y, y);
        }
    }

    public static int resto(int x, int y) {
        if (y < 0) {
            return -1;
        }
        if (x < y) {
            return x;
        } else {
            return resto(x - y, y);
        }
    }

}

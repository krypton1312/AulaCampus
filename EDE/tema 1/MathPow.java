public class MathPow{
    public static void main(String[] args) {
        System.out.println(mathPower(6,2));
        System.out.println(div(6,3));
        System.out.println(sust(50,23));
        System.out.println(mult(4,5));
    }

    static int mathPower(int x, int y) { 
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
    static int div(int x, int y) {
        return x / y;
    }
    static int sust(int x, int y) {
        return x - y;
    }
    static int mult(int x, int y) {
        return x * y;
    }
}
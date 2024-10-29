package sumatorioarray;
public class SumatorioArray {
    public static void main(String[] args) {
        int[] num = {3,4,9};
        System.out.println(suma(num));
    }
    
    public static int suma(int[] n) {
        return suma(n, 0);
    }

    private static int suma(int[] n, int index) {
        if (index == n.length) {
            return 0;
        } else {
            return n[index] + suma(n, index + 1);
        }
    }
}

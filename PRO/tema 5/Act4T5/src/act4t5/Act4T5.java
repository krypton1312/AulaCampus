package act4t5;

import java.util.Scanner;

public class Act4T5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        s.nextLine();
        int num2 = s.nextInt();
        s.nextLine();
        String operacion = s.nextLine();
        int num3 = 0;
        switch (operacion) {
            case "+":
                num3 = num1 + num2;
                break;
            case "-":
                num3 = num1 - num2;
                break;
            case "*":
                num3 = num1 * num2;
                break;
            default:
                break;
        }
        System.out.println(Integer.toBinaryString(num3));
        System.out.println(Integer.toOctalString(num3));
        System.out.println(Integer.toHexString(num3));
        s.close();
    }
}

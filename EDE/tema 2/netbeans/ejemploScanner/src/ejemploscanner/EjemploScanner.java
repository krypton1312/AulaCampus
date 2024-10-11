package ejemploscanner;
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = 0;
        try{
            a = scan.nextInt();
            scan.nextLine();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(a);
        scan.close();
    }
}

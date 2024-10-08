public class Act8T2 {
    public static void main(String[] args) {
        System.out.print("Numero: ");
        int num= Integer.parseInt(System.console().readLine()); 
        while(num != 0)
        {
            if (num % 2 == 0) {
                System.out.println("Par");
            }
            else
            {
                System.out.println("Impar");
            }
            System.out.print("Numero: ");
            num= Integer.parseInt(System.console().readLine());
        }
        
    }
}

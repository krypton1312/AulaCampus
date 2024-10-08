public class Act9T2 {
    public static void main(String[] args) {
        int cant = 0;
        System.out.print("Numero: ");
        int num= Integer.parseInt(System.console().readLine()); 
        while(num != 0)
        {
            if (num > 0) {
                System.out.println("Positivo");
            }
            else
            {
                System.out.println("Negativo");
            }
            System.out.print("Numero: ");
            num= Integer.parseInt(System.console().readLine());
            cant++;
        }
        System.out.println("Se ingresaron " + cant + " numeros.");
        
    }
}

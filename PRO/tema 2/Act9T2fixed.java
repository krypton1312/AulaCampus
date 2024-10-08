public class Act9T2fixed {
    public static void main(String[] args) 
    {
        System.out.print("Numero: ");
        int num = Integer.parseInt(System.console().readLine());
        boolean negativo = false;
        int cont = 0;
        while(!negativo){
            System.out.print("Numero: ");
            num = Integer.parseInt(System.console().readLine());
            cont++;
            if(num < 0)
            {
                negativo = true;
            }
        }
        System.out.println("Se ingresaron " + cont + "numeros.");
    }
}

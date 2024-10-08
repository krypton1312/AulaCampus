public class Act51T2 {
    public static void main(String[] args) {
        System.out.println("Numeros: ");  
        double total=0;
        int cont = 0;
        while (total < 10000) {
            double numero = Double.parseDouble(System.console().readLine());
            total+=numero;
            cont++;
        }
        System.out.println("Numeros intoducidos: " + cont);
        System.out.println("Suma total: " + total);
        System.out.println("Media: " + (total/cont));
    } 
}

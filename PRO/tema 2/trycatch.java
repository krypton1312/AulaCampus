public class trycatch {
    public static void main(String[] args) {
        int dividendo = 10;
        int divisor = 0;
        int resultado = 0;
        try{
            resultado = dividendo/divisor;
        }
        catch(ArithmeticException ex){
            System.out.println("Error: Division por cero");
            System.exit(0);
        }
        System.out.println(resultado);
    }
}

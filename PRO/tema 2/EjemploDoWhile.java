public class EjemploDoWhile {
    public static void main(String[] args) {
        int contador = 1;
        int suma = 0;
        do
        {
            System.out.print("Numero: ");
            int num= Integer.parseInt(System.console().readLine()); 
            suma += num; 
            contador++;
        } while(contador <= 3);
        System.out.println("La suma es: " + suma);
    }
}

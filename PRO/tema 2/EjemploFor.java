public class EjemploFor {
    public static void main(String[] args) {
        int suma = 0;
        for(int contador = 1;contador <= 3; contador++)
        {
            System.out.print("Numero: ");
            int num= Integer.parseInt(System.console().readLine()); 
            suma += num; 
        }
        System.out.println("La suma es: " + suma);
    }
}

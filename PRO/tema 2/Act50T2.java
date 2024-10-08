public class Act50T2 {
    public static void main(String[] args) {
        System.out.print("Unos numeros:");
        int numero = Integer.parseInt(System.console().readLine());
        int cont = 0; int contImpar=0; int impar = 0; int mayorPar = 0;

        while (numero >=0) {
            cont++;
            if (numero % 2 == 1) {
                contImpar++;
                impar += numero;
            } else {
                if (numero > mayorPar) {
                    mayorPar = numero;
                }
            }
            numero = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Se ingresaron " + cont + " numeros.");
        System.out.println("El promedio de los numeros impares ingresados es " + (double)impar / contImpar + ".");
        System.out.println("El numero mayor par ingresado es " + mayorPar + ".");
    }
}
public class Act19T2 {
    public static void main(String[] args) {
        System.out.println("Indroduce 10 sueldos:");
        double[] sueldo = new double[11];
        int mas1000=0;
        int suma = 0;
        for (int i = 1; i <= 10; i++) {

            System.out.print("Sueldo " + i + ": ");
            sueldo[i] = Double.parseDouble(System.console().readLine());
            suma += sueldo[i];
            if (sueldo[i] > 1000) {
                mas1000++;
            }
        }
        System.out.println("La suma de los sueldos es: " + suma);
        System.out.println("El numero de sueldos que superan el 1000 es: " + mas1000);
    }
}
public class Act63T2 {
    public static void main(String[] args) {
        System.out.println("Intoduce precio, cantidad, IVA% , descuento%.");
        System.out.print("Ejemplo: 5 10 20 30: ");
        String[] parts = System.console().readLine().split(" ");
        double[] datos = new double[4];
        for (int i = 0; i < 4; i++) {
            datos[i] = Double.parseDouble(parts[i]);
            if (i == 2 || i == 3) {
                datos[i] = Double.parseDouble(parts[i]) / 100; 
            }
        }
        System.out.println("Precio final: " + impFinal(datos));
    }
    public static double impFinal(double[] datos) {
        double precio = datos[0] * datos[1];
        double iva = precio + (precio * datos[2]);
        double impFinal = iva - (iva * datos[3]);
        return impFinal;
    }
}

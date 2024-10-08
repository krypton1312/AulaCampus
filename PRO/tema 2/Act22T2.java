public class Act22T2 {
    public static void main(String[] args) {
        // int codigo;
        double vendido = 0;
        double vendidoTotal = 0;
        double FactTotal = 0;
        double precio = 0;
        int mas600 = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Factura " + (i+1));
            // System.out.print("Intoduce el codigo: ");
            // int codigo = Integer.parseInt(System.console().readLine());
            System.out.print("Introduce la cantidad de litros: ");
            vendido = Double.parseDouble(System.console().readLine());
            System.out.print("Introduce el precio por litro: ");
            precio = Double.parseDouble(System.console().readLine());
            vendidoTotal+=vendido;
            FactTotal+=vendido*precio;
            if ((vendido*precio) > 600) {
                mas600++;
            }
        }
        System.out.println("\nFacturacion total: " + FactTotal);
        System.out.println("Cantidad de litros vendidos: " + vendidoTotal);
        System.out.println("Facturas mas de 600: " + mas600);
    }
}


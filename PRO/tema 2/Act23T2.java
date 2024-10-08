public class Act23T2 {
    public static void main(String[] args) {
        int codigo;
        double vendido = 0;
        double vendidoTotal = 0;
        double FactTotal = 0;
        double precio = 0;
        int mas600 = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Factura " + (i+1));
            System.out.print("Intoduce el codigo de 1 a 3: ");
            codigo = Integer.parseInt(System.console().readLine().replace(',', '.'));
            System.out.print("Introduce la cantidad de litros: ");
            vendido = Double.parseDouble(System.console().readLine().replace(',', '.'));
            switch (codigo) {
                case 1:
                    precio = 0.6;
                    break;
                case 2:
                    precio = 3;
                    break;
                case 3:
                    precio = 1.25;
                    break;
            }
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
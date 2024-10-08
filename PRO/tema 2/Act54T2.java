public class Act54T2 {
    public static void main(String[] args) {
        System.out.print("Base imponible de producto: ");
        double baseImponible = Double.parseDouble(System.console().readLine());

        System.out.print("Tipo de IVA: ");
        String tipoIva = System.console().readLine();
        System.out.print("Codigo promocional: ");
        String codigoPromocional = System.console().readLine();
        double IVA;
        double descuento;
        switch (tipoIva) {
            case "reducido":
                IVA = 0.10;
                break;
            case "superreducido":
                IVA = 0.04;
                break;
            default:
                IVA = 0.21;
        }
        switch (codigoPromocional) {
            case "mitad":
                descuento = baseImponible * 0.5;
                break;
            case "meno5":
                descuento = baseImponible - 5;
                break;
            case "5porc":
                descuento = baseImponible *0.05;
            default:
                descuento = 0;
                break;
        }
        System.out.println("Descuento por el codigo: -" + descuento);
        System.out.println("Importe IVA: " + ((baseImponible - descuento)* IVA));
        System.out.println("Importe total: " + ((baseImponible - descuento) + ((baseImponible - descuento) * IVA)));
    }
}
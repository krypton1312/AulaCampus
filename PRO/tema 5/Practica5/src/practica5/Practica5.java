package practica5;
import objetos.Impresora;
public class Practica5 {
    public static void main(String[] args) {
        Impresora[] impresoras = {
            new Impresora(true, "láser", false, "C001", "HP", "LaserJet Pro", "Impresora rápida para oficina", 250.99),
            new Impresora(false, "inyección de tinta", true, "C002", "Canon", "PIXMA G6020", "Impresora multifuncional con tinta recargable", 199.50),
            new Impresora(true, "láser", true, "C003", "Brother", "HL-L2350DW", "Impresora compacta con conectividad inalámbrica", 149.99)
        };

        System.out.println("Impresora 1 con IVA: " + impresoras[0].importeFinal(21));
        System.out.println("Impresora 2 con IVA y descuento: " + impresoras[1].importeFinal(21, 10));
        System.out.println("Impresora 3 con IVA y los dos descuentos: " + impresoras[2].importeFinal(21, 10, true));
        
        
        Impresora imp = new Impresora();
        System.out.println(imp.toString());
    }
}

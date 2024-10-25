package practica4;
import inmueble.Inmueble;
import inmueble.chalet.Chalet;
import inmueble.vivenda.Vivenda;
public class Practica4 {
    public static void main(String[] args) {
        Vivenda vivienda1 = new Vivenda("VIV001", "Piso", "Calle Mayor 10", "Madrid", 85.5, 3, 2, 1, 200000.0, "3º", true, true);
        Vivenda vivienda2 = new Vivenda("VIV002", "Casa", "Avenida Central", "Barcelona", 120.0, 4, 3, 2, 350000.0, "Baja", false, true);
        Chalet chalet1 = new Chalet("CHA001", "Chalet", "Camino del Sol 25", "Valencia", 150.0, 5, 3, 2, 450000.0, 500.0, true, true);
        Chalet chalet2 = new Chalet("CHA002", "Chalet", "Avenida del Mar 12", "Alicante", 180.0, 4, 3, 1, 550000.0, 600.0, true, false);
        
        
        
        System.out.println(vivienda1);
        System.out.println(vivienda2);
        System.out.println(chalet1);
        System.out.println(chalet2);
    }

}

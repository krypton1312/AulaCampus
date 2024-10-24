package tienda;
import almacen.Producto;

public class Tienda {
    public static void main(String[] args) {
        Producto miProducto = new Producto("1", "Lampara", 100);
        System.out.println(miProducto.toString());
        System.out.println(miProducto.muestaProducto());
    }
}

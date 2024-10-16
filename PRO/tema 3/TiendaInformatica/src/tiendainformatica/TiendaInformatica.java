package tiendainformatica;

import Objetos.Portatiles;

public class TiendaInformatica {
    public static void main(String[] args) {
        Portatiles miPortatil = new Portatiles();
        miPortatil.setCodigo(4);
        miPortatil.setDescripcion("Lenovo I5");
        miPortatil.setPrecio(560.45);
        miPortatil.mostrarDatos();
        Portatiles.muestraNumDefectuosos();
        Portatiles tuPortatil = new Portatiles(5,"Asus I5", 900.45);
        tuPortatil.setDefectuoso(true);
        tuPortatil.mostrarDatos();
        Portatiles.muestraNumDefectuosos();
    }
}

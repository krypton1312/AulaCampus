package tiendainformatica;

import Objetos.Portatiles;

public class TiendaInformatica {
    public static void main(String[] args) {
        Portatiles miPortatil = new Portatiles();
        miPortatil.setCodigo(4);
        miPortatil.setDescripcion("Lenovo I5");
        miPortatil.setPrecio(560.45);
        miPortatil.mostrarDatos();
        miPortatil.muestraNumDefectuosos();
        Portatiles tuPortatil = new Portatiles();
        tuPortatil.setCodigo(5);
        tuPortatil.setDescripcion("Asus I5");
        tuPortatil.setPrecio(900.45);
        tuPortatil.setDefectuoso(true);
        tuPortatil.mostrarDatos();
        tuPortatil.muestraNumDefectuosos();
    }
}

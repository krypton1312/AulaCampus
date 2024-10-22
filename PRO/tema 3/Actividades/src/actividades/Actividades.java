package actividades;

import java.util.HashSet;
import objetos.Consumo;
import objetos.Finanzas;
import objetos.Proveedor;
import objetos.Producto;
import objetos.Cuenta;
import objetos.Medico;
import objetos.Libro;

public class Actividades {

    public static void main(String[] args) {
        /* ej 4
        Finanzas fin = new Finanzas();
        fin.setDolar(100);
        fin.dolaresToEuros();

        System.out.println(fin.getEuro());
        
        fin.setConfig(1.59);
        fin.dolaresToEuros();
        System.out.println(fin.getEuro());
         */

 /* ej 10
        Consumo cons = new Consumo(500, 25, 150, 75, 1.5);
        
        cons.mostrarDatos();
        System.out.println(cons.getTiempo());
        System.out.println(cons.consumoEuros());
        System.out.println(cons.consumoMedio());
         */
 /* ej 12
        Proveedor prov = new Proveedor("123", "Discema", "Precios buenos", "123", "calle 123", 67183849, "Valencia", 46000, "discemagmail.com");
        prov.setSector("bebidas");
        System.out.println("Sector: " + prov.getSector() + "\n");
        System.out.println("Correo valido: " + prov.verificaCorreo());
        prov.setCorreo("discema@gmail");
        System.out.println("Correo valido: " + prov.verificaCorreo() + "\n" + "\n");
        prov.muestraDatos();
         */
 /* ej 15
        Producto productoHardware = new Producto(
            "HW1234",
            "Tarjeta gráfica GTX 1660",
            "Tarjeta gráfica de alto rendimiento para juegos",
            "Hardware",
            0.85,
            299.99,    
            20
        );
        Producto productoSoftware = new Producto(
            "SW5678",
            "Microsoft Office 2024",
            "Suite ofimática para productividad",
            "Software",
            0.0,
            149.99,
            1000
        );
        productoHardware.aumentaStock(12);
        productoSoftware.disminuyeStock(5);
        
        productoHardware.muestraDatos();
        System.out.println("\n\n\n");
        
        productoSoftware.muestraDatos();
        System.out.println("\n\n\n");
        
        productoSoftware.ivaProducto(1.21);
        productoHardware.ivaProducto(1.21);
        
        System.out.println("IVA de " + productoHardware.getNombreProducto() + " es: " + productoHardware.getIVA() + " y precio final es: " + (productoHardware.getIVA() + productoHardware.getPrecio()));
        System.out.println("IVA de " + productoSoftware.getNombreProducto() + " es: " + productoSoftware.getIVA() + " y precio final es: " + (productoSoftware.getIVA() + productoSoftware.getPrecio()));
         */
 /*ej 17
        Cuenta cuentaParticular1 = new Cuenta("Jose");
        
        Cuenta cuentaEmpresa1 = new Cuenta("Ryan Corp", 300);
        
        System.out.println(cuentaParticular1.getTitular());
        System.out.println(cuentaEmpresa1.getCantidad());
       
        cuentaParticular1.ingresar(1000);
        cuentaEmpresa1.retirar(500);
        
        cuentaEmpresa1.muestraDatos();
        cuentaParticular1.muestraDatos();
         */
 
/* ej 18
        Medico medicoDigestivo = new Medico(
                "MD001", "Juan Pérez", "12345678A", "Calle Salud, 15", "600123456",
                "Madrid", "12/05/1975", "Digestivo", 4500.00);
        Medico medicoTraumatologo = new Medico(
                "MD002", "Ana García", "87654321B", "Avenida Medica, 23", "600987654",
                "Barcelona", "24/08/1980", "Traumatología", 7000);
        
        medicoDigestivo.setSueldo(5000);
        System.out.println(medicoDigestivo.getSueldo());
        medicoTraumatologo.setDni("42933038N");
        System.out.println(medicoTraumatologo.getDni());
        
        medicoDigestivo.retencionMedico(30);
        medicoTraumatologo.retencionMedico(20);
        System.out.println(medicoDigestivo);
        System.out.println(medicoTraumatologo);
        */
        
        Libro libroInformatica = new Libro("GregInf", "yehor", "krypton", 50, false);
        System.out.println(libroInformatica.getTitulo());
        libroInformatica.setEditorial("anonimo");
        libroInformatica.prestamo();
        libroInformatica.prestamo();
        libroInformatica.devolucion();
        
    }
}

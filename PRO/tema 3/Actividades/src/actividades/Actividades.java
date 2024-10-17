package actividades;
import objetos.Consumo;
import objetos.Finanzas;


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
        
        Consumo cons = new Consumo(500, 25, 150, 75, 1.5);
        
        cons.mostrarDatos();
        System.out.println(cons.getTiempo());
        System.out.println(cons.consumoEuros());
        System.out.println(cons.consumoMedio());
        
    }
}

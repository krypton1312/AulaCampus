package act57t7;

import java.util.HashMap;

public class Act57T7 {
    public static void main(String[] args) {
        HashMap<String, Double> moneda = new HashMap();
        moneda.put("Dolar Americano" , 0.81);
        moneda.put("Franco Suizo" , 0.85);
        moneda.put("Libra Esterlina" , 1.14);
        moneda.put("Corona Danesa", 0.13);
        moneda.put("Peso Mexicano", 0.04);
        moneda.put("Dolar Singapur", 0.62);
        moneda.put("Real Brasil", 0.24);
        
        System.out.println("El valor de la Libra Esterlina: " + moneda.get("Libra Esterlina") + "\n");
        
        for(String clave: moneda.keySet()){
            System.out.println("Moneda: " + clave + ", su valor: " + moneda.get(clave));
        }
        
        System.out.println("\nEl numero de divisas del Map son:" + moneda.size());
        
        moneda.remove("Peso Mexicano");
        
        System.out.println("Peso Mexicano existe: " + moneda.containsKey("Peso Mexicano"));
        
        System.out.println("Euro existe: " + moneda.containsKey("Euro"));
        
        System.out.println("Valor 0.85 existe: " + moneda.containsValue(0.85));
        System.out.println("Valor 0.33 existe: " + moneda.containsValue(0.33));
        
        System.out.println("Map esta vacio: " + moneda.isEmpty());
        
        moneda.clear();
        
        System.out.println("Map esta vacio: " + moneda.isEmpty());
    }
}

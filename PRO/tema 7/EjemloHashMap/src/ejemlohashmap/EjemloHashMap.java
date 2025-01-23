package ejemlohashmap;

import java.util.HashMap;

public class EjemloHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> notas = new HashMap();
        notas.put("120983", 6.4);
        notas.put("322324", 7.4);
        notas.put("234324", 8.4);
        System.out.println("Nota 120983 = " + notas.get("120983"));
        
        System.out.println("Alumnos: " + notas.size());
        
        // .keySet recuperar todas las claves
        
        for(String clave: notas.keySet()){
            System.out.println("DNI: " + clave + " " + notas.get(clave));
        }
        
        // .values todos los valores
        
        for(Double nota: notas.values()){
            System.out.println("Nota: " + nota);
        }
        
        // .isEmpty() vacio
        System.out.println("Vacio: " + notas.isEmpty());
        
        // .remove()
        
        notas.remove("322324");
        
        // .containsKey()
        // .clear
    }
}

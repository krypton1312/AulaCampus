package ejemplostring;

import java.util.Arrays;

public class EjemploString {
    public static void main(String[] args) {
        String cadena = "Esto es una prueba";
        
        System.out.println("Caracteres: " + cadena.length() + ".");
        
        String nombre = "Luis";
        String apellidos = "Sanz Solis";
        String nombreCompleto = nombre.concat(" ").concat(apellidos);
        System.out.println("Nombre: " + nombreCompleto);
        
        String cadena1 = "Esto es una prueba1";
        System.out.println("Iguales: " + cadena.equals(cadena1));
        
        System.out.println(cadena.toUpperCase());
        
        String[] array = cadena.split(" ");
        System.out.println(Arrays.toString(array));
        
        System.out.println(cadena.replace("e", "turi parurum"));
        
        System.out.println("hola".equalsIgnoreCase("HOLA"));
        
        System.out.println("mensje de bienvenida".substring(5, 20));
        
        System.out.println("Comenieza:" + cadena.startsWith("Esto"));
        
        System.out.println("Termina:" + cadena.startsWith("prue"));
        
        System.out.println("           324324 + 32423       ".trim());
        
        System.out.println("qwertyuiop".charAt(2));
        
        System.out.println(cadena.contains("es"));
        
        System.out.println(cadena.indexOf("e"));
        System.out.println(cadena.lastIndexOf("e"));
        
        System.out.println(Arrays.toString(cadena.toCharArray()));
        
        int numero = 123213;
        String numeroT = String.valueOf(numero);
    }
}   

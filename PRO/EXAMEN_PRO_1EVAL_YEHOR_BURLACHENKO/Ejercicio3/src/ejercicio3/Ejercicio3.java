package ejercicio3;
import objetos.*;
public class Ejercicio3 {
    public static void main(String[] args) {
        Fruta[] frutas = new Fruta[3];

        frutas[0] = new Manzana("Manzana" , "Inglaterra" , 3, "28/11/2024" , "Golden");
        frutas[1] = new Manzana("Manzana" , "PaisesBajos" , 5, "10/10/2025" , "Green");
        frutas[2] = new Manzana("Manzana" , "Moldova" , 1, "05/10/2023" , "Yellow");
        
        
        for(int i = 0; i < frutas.length; i++){
            System.out.println(frutas[i].toString());
        }
        
        ((Manzana)frutas[1]).setVariedad("Nueva varidad");
        System.out.println(frutas[1].toString()); 
        
        System.out.println(frutas[0].precioFinal(true));
        System.out.println(frutas[1].precioFinal(50));
        System.out.println(frutas[2].precioFinal(0.50));
        
    }  
}

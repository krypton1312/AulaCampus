package simulacrorefactorizar;
import java.util.Scanner;
public class SimulacroRefactorizar {
    public static void main(String[] args) {
        // Algoritmo que pide un peso en kilos y lo 
        Scanner teclado=new Scanner(System.in);
        // convierte en gramos multiplicando por 1000 y
        // a onzas multiplicando por 35,274
        String m;
        Double k;
        double g; 
        double o;
        System.out.print("Introduce kilos: ");
        k = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Introduce opcion de menu (1 - gramos o 2 - onzas) : ");
        m = teclado.nextLine();
        g = k*1000;
        o = k*35.274;
        if(m.equals("1")){
            System.out.println("El peso convertido es " + g);
        } else if(m.equals("2")){
            System.out.println("El peso convertido es " + o);            
        }   
    } 
}

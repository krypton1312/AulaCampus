package act4;

import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Introduce el dia de la semana en formano numerico (1-7)");
        int dia = tec.nextInt();
        tec.nextLine();
                
        if(dia < 7){
            if(dia%2 == 0){
                System.out.println("Dia par");
            }else{
                System.out.println("Dia impar");
            }
        }else{
            System.out.println("Dia incorrecto");
        }
    }
}

public class Act10T2 {
    public static void main(String[] args) {
        int numero = (int)(Math.random() * 10) + 1;
        boolean result = false;
        System.out.print("Adivina un numero entre 0 y 10: ");
        while (!result) {
            int userNum = Integer.parseInt(System.console().readLine());
            if (userNum == numero) {
                result = true;
                System.out.println("Has adivinido!");
            } else if (userNum < numero) {
                System.out.println("El numero que buscas es mayor.");
            }
            else {
                System.out.println("El numero que buscas es menor.");
            }   
        }

        // int userNum = Integer.parseInt(System.console().readLine());
        // while(numero != userNum)
        // {
        //     if(numero>userNum)
        //     {
        //         System.out.println("El numero que buscas es mayor.");
        //     }
        //     else if (numero<userNum) {
        //         System.out.println("El numero que buscas es menor.");
        //     }
        //     userNum = Integer.parseInt(System.console().readLine());
        // }
        // System.out.println("Has adivinado!");
    }
}

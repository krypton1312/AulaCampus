public class Act13T2 {
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        int userNum = Integer.parseInt(System.console().readLine());
        for(int contador = 1;contador <= userNum; contador++)
        {
            System.out.println(contador);
        }
        
    }
}

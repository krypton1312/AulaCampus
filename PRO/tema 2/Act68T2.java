public class Act68T2 {
    public static void main(String[] args) {
        System.out.println("Introduce 3 numeros: ");
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.println("Numero mayor es: " + numMayor(num));
    }
    public static int numMayor(int num[]){
        int mayor = num[0];
        for (int i = 1; i < num.length; i++) {
            if (num[i] > mayor) {
                mayor = num[i];   
            }
        }
        return mayor;

    }
}

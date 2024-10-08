public class Act24T2 {
    public static void main(String[] args) {
        int susp = 0;
        int aprob = 0;
        for(int i = 0; i < 6; i++) {
            System.out.println("Nota " + (i+1) + ":");
            double nota = Double.parseDouble(System.console().readLine());
            if(nota < 5 && nota > 0)
            {
                susp++;
            }
            else if (nota > 4 && nota < 11) {
                aprob++;
            }
            else{
                System.out.println("la nota entre 1 y 10");
                i--;
            }

        }
        System.out.println("Aprobados: " + aprob);
        System.out.println("Suspendidos: " + susp);
    }
}
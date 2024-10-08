public class Act36T2 {
    public static void main(String[] args) {
        System.out.print("Nota del primer control: ");
        double nota1 = Double.parseDouble(System.console().readLine().replace(',', '.'));
        System.out.print("Nota del segundo control: ");
        double nota2 = Double.parseDouble(System.console().readLine().replace(',', '.'));
        double media = (nota1 + nota2) / 2;

        if (media < 5) {
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            String recuperacion = System.console().readLine();
            if (recuperacion.equals("apto")) {
                media = 5;
                System.out.println("Tu nota es: " + media);
            } else if (recuperacion.equals("no apto")) {
                {
                    media = 1;
                    System.out.println("Tu nota es: " + media);
                }
            } else {
                System.out.println("Tu nota es: " + media);
            }
        }
    }
}

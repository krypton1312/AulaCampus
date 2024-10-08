public class Act26T1 {
	public static void main(String [] args) {
		System.out.println("La nota del primer examen: ");
		double nota1 = Double.parseDouble(System.console().readLine());
		System.out.println("La nota deseada: ");
		Double nota2 = Double.parseDouble(System.console().readLine());

		double notaFinal =  (nota2 - nota1*0.4) / 0.6;
		
		System.out.println("Tienes que sacar un: " + notaFinal);
	}
}
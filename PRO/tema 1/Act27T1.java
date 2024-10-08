public class Act27T1 {
	@SuppressWarnings("unused")
	public static void main(String [] args) {
		System.out.println("Fecha 1.\n Dia: ");
		int dia1 = Integer.parseInt(System.console().readLine());
		System.out.println("Mes: ");
		int mes1 = Integer.parseInt(System.console().readLine());
		System.out.println("Año: ");
		int year1 = Integer.parseInt(System.console().readLine());
		System.out.println("La nota deseada: ");
		Double nota2 = Double.parseDouble(System.console().readLine());
		Double nota1 = Double.parseDouble(System.console().readLine());

		double notaFinal =  (nota2 - nota1*0.4) / 0.6;
		
		System.out.println("Tienes que sacar un: " + notaFinal);
	}
}
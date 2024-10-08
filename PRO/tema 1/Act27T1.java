public class Act27T1 {
	public static void main(String [] args) {
		System.out.println("Fecha 1.\n Dia: ");
		int dia1 = Ineger.parseInt(System.console().readLine());
		System.out.println("Mes: ");
		int mes1 = Ineger.parseInt(System.console().readLine());
		System.out.println("Año: ");
		int year1 = Ineger.parseInt(System.console().readLine());
		System.out.println("La nota deseada: ");
		Double nota2 = Double.parseDouble(System.console().readLine());

		double notaFinal =  (nota2 - nota1*0.4) / 0.6;
		
		System.out.println("Tienes que sacar un: " + notaFinal);
	}
}
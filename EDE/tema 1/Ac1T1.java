public class Ac1T1 {
	public static void main(String [] args) {
		System.out.println("Introduzca 2 numeros.");

		String num1 = System.console().readLine();
		String num2 = System.console().readLine();
		
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num2);
		String numChange = num1;
		num1 = num2;
		num2 = numChange;
		System.out.println("Intercambio:");
		System.out.println("Num1: " + num1);
		System.out.println("Num2: " + num2);
		
	}
}
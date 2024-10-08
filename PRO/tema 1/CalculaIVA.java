public class CalculaIVA {
	public static void main(String [] args) {
		System.out.println("Precio sin IVA: ");
		double precio = Double.parseDouble(System.console().readLine());
		double IVA = precio*0.10;
		System.out.println("Precio con IVA: " + (IVA + precio));
	}
}
import java.util.Scanner;

public class ac1ej1 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String euro;

		System.out.print("Euros: ");
		euro = scanner.nextLine();
		double pesetas = Double.parseDouble(euro) * 166.386;
		System.out.println("Pesetas: " + pesetas);
	}
}
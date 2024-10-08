import java.util.Scanner;

public class ac1ej2 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String pesetas;

		System.out.print("Pesetas: ");
		pesetas = scanner.nextLine();
		double euro = Double.parseDouble(pesetas) / 166.386;
		System.out.println("Euro: " + euro);
		scanner.close();
	}
}
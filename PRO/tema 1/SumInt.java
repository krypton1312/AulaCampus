public class SumInt {
	public static void main(String [] args) {
		System.out.println("Num1: ");
		String num1T = System.console().readLine();
		System.out.println("Num2: ");
		String num2T = System.console().readLine();
		int num1 = Integer.parseInt(num1T);
		int num2 = Integer.parseInt(num2T);
		System.out.println("Suma: " + (num1+num2));
	}
}
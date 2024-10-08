public class NumMayor {
	public static void main(String [] args) {
		System.out.println("Introduce 2 numeros");
		int num1 = Integer.parseInt(System.console().readLine());
		int num2 = Integer.parseInt(System.console().readLine());
		if(num1 == num2)
		{
			System.out.println("Los numeros son iguales.");
		}
		else if(num1 < num2)
		{
			System.out.println(num1 + " es menor que " + num2);
		}
		else
		{
			System.out.println(num1 + " es mayor que " + num2);
		}

	}
}
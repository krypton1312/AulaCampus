public class Par {
	public static void main(String [] args) {
		System.out.println("Introduce un numero");
		String num1 = System.console().readLine();
		try {
		if(Integer.parseInt(num1) % 2 == 0)
		{
			System.out.println("Es par");
		}
		else if (Integer.parseInt(num1) % 2 == 1)
		{
			System.out.println("Es impar");
		}
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Te he pedido numero.");
		}
	}
}
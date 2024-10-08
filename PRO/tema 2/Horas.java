public class Horas {
	public static void main(String [] args) {
		System.out.println("Cuantas horas ha trabajado: ");
		int horas = Integer.parseInt(System.console().readLine());
		int pagar = 0;
		if(horas <= 40)
		{
			pagar = 12 * horas;
		}
		else if(horas > 40) 
		{
			int resto = horas - 40;
			pagar = 12 * 40 + resto*16;
			
		}
		else
		{
			System.out.println("Error");
		}
		System.out.println(pagar);

	}
}
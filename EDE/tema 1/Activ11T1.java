public class Activ11T1 {
	public static void main(String [] args) {
		System.out.println("Tienes el titulo de bachiller? ");
		String ans = System.console().readLine();

		if(ans.equals("Si") || ans.equals("si") || ans.equals("Si.") || ans.equals("si."))
		{
			System.out.println("Puedes entrar a GS");
		}
		else if(ans.equals("No") || ans.equals("no") || ans.equals("No.") || ans.equals("no."))
		{
			System.out.println("Has aprobado la prueba de acceso?");
			
			if(ans.equals("Si") || ans.equals("si") || ans.equals("Si.") || ans.equals("si."))
			{
				System.out.println("Puedes entrar a GS");
			}
			else if(ans.equals("No") || ans.equals("no") || ans.equals("No.") || ans.equals("no."))
			{
				System.out.println("No puedes entrar a GS");
			}

		}
	}
}
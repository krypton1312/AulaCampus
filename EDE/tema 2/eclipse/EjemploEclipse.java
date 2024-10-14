import java.util.Scanner;

public class EjemploEclipse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = 0;
		while(key!=3) {
			System.out.println("actividades de 1 a 2, 3 - salir");
			key = sc.nextInt(); 
			sc.nextLine();
			switch (key) {
				case 1:
					act7(sc);
					break;
				case 2:
					act8(sc);
					break;
				case 3:
					System.out.println("program finished");
					break;
			}
		}
		sc.close();
	}
	
	public static void act7(Scanner sc){
		System.out.println("Escribe palabra, para acabar escribe 'fin'");
		int cont = 0;
		String text = sc.nextLine();
		while(!text.equals("fin")) {
			cont++;
			text = sc.nextLine();
		}
		System.out.println("Cantidad de palabras: " + cont + "\n");
	}
	public static void act8(Scanner sc) {
		System.out.println("Introduce los nombres de los premiados");
		String nombre = sc.nextLine();
		int cont = 0;
		while(!nombre.equals("fin")) {
			nombre = sc.nextLine();
			cont++;
		}
		if (cont > 0) {
			double premioPorPersona = 1000 / cont;
			System.out.println("La cantidad que corresponde a cada persona: " + premioPorPersona + "\n");
		}
		else {
			System.out.println("Bote. El premio se acumula para el próximo sorteo.\n");
		}
	}
}	
	
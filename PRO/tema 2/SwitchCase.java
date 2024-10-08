public class SwitchCase {
	public static void main(String [] args) {
		System.out.print("Sueldo: ");
		double sueldo = Double.parseDouble(System.console().readLine());
		System.out.print("Categoria laboral: ");
		int catLaboral = Integer.parseInt(System.console().readLine());
		double retention;
		switch(catLaboral){
			case 1: retention = sueldo * 0.10; break;
			case 2: retention = sueldo * 0.25; break;
			case 3: retention = sueldo * 0.20; break;
			case 4: retention = sueldo * 0.25; break;
			default: retention = sueldo * 0.30;
		}
		System.out.println("Retention: " + retention);
		System.out.println("Sueldo final: " + (sueldo-retention));
	}
}
	
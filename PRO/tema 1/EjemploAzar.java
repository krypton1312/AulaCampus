public class EjemploAzar {
	public static void main(String[] args) {
		double numero = Math.random();
		System.out.println(numero);

		int dominoI = (int)(Math.random()*7);
		int dominoD = (int)(Math.random()*7);
		System.out.println(dominoI + " " + dominoD);

		int dado = (int)(Math.random()*6)+1;
		System.out.println(dado);

		int edad = (int)(Math.random()*48)+18;
		System.out.println(edad);
		
		int sueldo = (int)(Math.random()*1301)+1500;
		System.out.println(sueldo);

	}
}
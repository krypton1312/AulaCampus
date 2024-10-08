public class Act10T1 {
	public static void main(String [] args) {
		int ASIIcode = (int)(Math.random()*26)+65;
		char letra = (char)ASIIcode;
		boolean check = (letra=='A') || (letra=='E') || (letra=='O')|| 					(letra=='I') || (letra=='U');
		String result;
		if(check)
		{
			result = "vocal.";
		}
		else
		{
			result = "consonante.";
		}
		System.out.println("La lentra es" + letra + " y es " +  result);
	}
}
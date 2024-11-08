package act4t3;

public class Multiplo {
	public boolean esMultiplo(int num1, int num2) {
		return num2 % num1 == 0;
	}
	
	public boolean noEsMultiplo(int num1, int num2) {
		return num2 % num1 > 0;
	}
	
}

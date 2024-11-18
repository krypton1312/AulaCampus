package ejemplowrappers;
public class EjemploWrappers {
    public static void main(String[] args) {
        // crear Wrapper int y double
        
        Integer num = new Integer(100);
        Double numDec = new Double(70.4);
        Integer valor = new Integer("92");
        Integer numHex = Integer.valueOf("FA", 16);
        System.out.println("HumHex: " + numHex);
        
        // convenir String a int o double
        
       String enteroD = "23";
       String decimalD = "43.66";
       int entero = Integer.parseInt(enteroD);
       double decimal = Double.parseDouble(decimalD);
       System.out.println(entero);
       System.out.println(decimal);
       
       // convertir de Wrapper a tipo simple
       
       int valorInt = valor.intValue(); 
       double numDouble = numDec.doubleValue();
       
       // conventir Wrapper en String
       
       String binario = Integer.toString(45, 2);
       System.out.println("binario: " + binario);
       
       
       // conventir int to long en Hexadecimal
       
       int numeroEntero = 10923837;
       String convBinario = Integer.toBinaryString(numeroEntero);
       String convOctal = Integer.toOctalString(numeroEntero);
       String convHexadecimal = Integer.toHexString(numeroEntero);
       System.out.println(convBinario + "\n" + convOctal + "\n" + convHexadecimal);
       
    }
}

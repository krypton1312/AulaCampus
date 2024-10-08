public class Act59T2 {
    public static void main(String[] args) {
        String[] coche = new String[3];
        System.out.print("Marca: ");
        coche[0] = System.console().readLine();
        System.out.print("Modelo: ");
        coche[1] = System.console().readLine();
        System.out.print("Precio: ");
        coche[2] = System.console().readLine();
        double precio = 0;
        try{
            precio = Double.parseDouble(coche[2]); 
        }catch(NumberFormatException ex){
                System.out.println("error parsing");
                System.exit(0);
        }
        System.out.println("Precio con IVA: " + (precio*1.21));
    }
}

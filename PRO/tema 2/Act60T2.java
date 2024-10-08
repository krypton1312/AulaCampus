public class Act60T2 {
    public static void main(String[] args) {
        String[] act = {"Ana", "Robert", "Luis", "John"};
        int i = 0;

        try {
            i = Integer.parseInt(System.console().readLine());
        }catch(NumberFormatException e){
            System.out.println("Debes introducir un número entero");
            System.exit(0);
        }
        
        try {
            System.out.println(act[i]);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}

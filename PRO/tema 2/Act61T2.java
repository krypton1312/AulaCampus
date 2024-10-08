@SuppressWarnings("unused")
public class Act61T2 {
    public static void main(String[] args) {
        int codigo = 0;
        double total = 0;
        int cont = 0;
        while(codigo >= 0){
            int nota = 0;
            try{
                System.out.print("Codigo: ");
                codigo = Integer.parseInt(System.console().readLine());
                if(codigo < 0) break;
                System.out.print("Nombre: ");
                String nombre = System.console().readLine();
                System.out.print("Nota: ");
                nota = Integer.parseInt(System.console().readLine());
            }catch(Exception e){
                System.out.println("Error: " + e);
                System.out.println("Intenta de nuevo");
                continue;
            }
            total+=nota;
            cont++;
        }
        System.out.println("Nota promedia de los alumnos: " + (total/cont));
    }
}

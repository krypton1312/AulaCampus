public class ArrayEjemplo {
    public static void main(String[] args) {
        String[] nombre = new String[3];
        nombre[0] = "Luis";
        nombre[1] = "Ana";
        nombre[2] = "Rosa";

        for(int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i]);
        }

        try{
            System.out.println(nombre[8]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indice fuera de rango");
        }
    }
}

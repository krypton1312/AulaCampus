package ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        int edad_persona1 = (int) (Math.random() * 101);
        int edad_persona2 = (int) (Math.random() * 101);
        System.out.println(edad_persona1 + " "+ edad_persona2);
        System.out.println(mayoresDeEdad(edad_persona1, edad_persona2));
    }
    public static boolean mayoresDeEdad(int persona1, int persona2){
        return (persona1 > 17 && persona2 > 17);
    }
}

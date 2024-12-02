package act20;
import objetos.Alumno;

public class Act20 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("1", "Luis", "Mas Ros", "05/10/1990", "7.5");
        System.out.println(alumno1);
        System.out.println("Su edad:" + alumno1.getEdad());
    }
}

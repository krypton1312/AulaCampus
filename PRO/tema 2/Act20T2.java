public class Act20T2 {
    public static void main(String[] args) {
        int edadAlumno; double alturaAlumno;
        int edadMedia = 0; double alturaMedia= 0;
        int contadorAlumnosEdad = 0; int contadorAlumnosAltura= 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Alumno " + i + ":");
            System.out.print("Edad: ");
            edadAlumno = Integer.parseInt(System.console().readLine());
            System.out.print("Altura: ");
            alturaAlumno = Double.parseDouble(System.console().readLine());
            alturaMedia+= alturaAlumno;
            edadMedia+= edadAlumno;
            if (edadAlumno>18){
                contadorAlumnosEdad++;
            }
            if (alturaAlumno > 1.75) {
                contadorAlumnosAltura++;
            }
        }
        System.out.println("Edad media: " + (double) edadMedia / 5);
        System.out.println("Altura media: " + (double) alturaMedia / 5);
        System.out.println("Alumnos con edad mayor a 18: " + contadorAlumnosEdad);
        System.out.println("Alumnos con altura superior a 1.75m: " + contadorAlumnosAltura);

    }
}

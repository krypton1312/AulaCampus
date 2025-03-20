package practica3;
import java.util.Scanner;

public class Persona {
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    // <editor-fold defaultstate="collapsed" desc="constructores">
    public Persona(){
    }
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public Persona(String nombre, int edad, int dni, char sexo,
                    double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="setters">
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setDNI(int dni){
        this.dni = dni;
    }
    public void setSexo(char sexo){
        this.sexo=sexo;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura(double altura){
        this.altura =  altura;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="getters">
    public String getNombre(){
        return this.nombre;
    }
    public int getDNI(){
        return this.dni;
    }
    public int getEdad(){
        return this.edad;
    }
    public char getSexo(){
        return this.sexo;
    }
    public double getPeso(){
        return this.peso;
    }
    public double getAltura(){
        return this.altura;
    }
    // </editor-fold>

    public void pedirTodosDatos(Scanner sc){
        System.out.print("Nombre: ");
        this.nombre = sc.nextLine();
        System.out.print("Edad: ");
        this.edad = sc.nextInt(); sc.nextLine();
        System.out.print("DNI sin letra: ");
        this.dni = sc.nextInt(); sc.nextLine();
        System.out.print("Sexo(H/M): " + sexo);
        this.sexo = sc.next().charAt(0);
        System.out.print("Peso(kg): ");
        this.peso = sc.nextDouble(); sc.nextLine();
        System.out.print("Altura(m): ");
        this.altura = sc.nextDouble(); sc.nextLine();
    }
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni + generaLetraDNI());
        comprobarSexo(sexo);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " m");
    }
    
    public int calcularMC(){
        double formula = (peso/(altura*altura));
        if(formula < 20){
            return -1;
        }
        else if(formula >= 20 && formula <= 25){
            return 0;
        }
        else{
            return 1;
        }
    }
    public boolean esMayorDeEdad(){
        if(this.edad > 17){
            return true;
        }
        else{
            return false;
        }
    }
    public void comprobarSexo(char sexo){
        if(sexo != 'M' || sexo != 'H'){
            this.sexo = 'H';
        }
    }
    public char generaLetraDNI(){
        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letra[(this.dni)%23];       
    }
    
    
}

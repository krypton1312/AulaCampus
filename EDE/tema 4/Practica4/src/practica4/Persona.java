package practica4;

/**
 * Clase Persona que permite trabajar con instancias de tipo Persona
 * @author YEHORBURLACHENKO
 * @see <a href="https://github.com/krypton1312/AulaCampus"> Mi GitHub </a>
 * @version 1.0 4 diciembre 2024
 */
public class Persona {
    /**
     * Atributo privado que almacena el nombre completo de la persona
     */
    private String nombre;
    /**
     * Atributo privado que almacena la edad de la persona
     */
    private int edad;
    /**
     * Atributo privado que almacena 
     * el identificador de la Persona(un DNI) sin letra
     */
    private int dni;
    /**
     * Atributo privado que almacena el sexo de la Persona 
     * (H - hombre, M - mujer)
     */
    private char sexo;
    /**
     * Atributo privado que almacena el peso en kg de la persona
     */
    private double peso;
    /**
     * Atributo privado que almacena la altura en metros 
     */
    private double altura;
    /**
     * UMBRAL_BAJO es una constante privada que almacena el IMC bajo 
     * para utilizarlo en clase calculaIMC()
     * @see calcularIMC()
     */
    private final double UMBRAL_BAJO = 20;
    /**
     * UMBRAL_BAJO es una constante privada que almacena el IMC alto 
     * para utilizarlo en funcion calculaIMC()
     * @see calcularIMC()
     */
    private final double UMBRAL_ALTO = 25;
    /**
     * LETRAS es una contante privada, que almaceda todas las letras
     * posibles del DNI. Se utiliza en funcion generaLetraDNI()
     * @see generaLetraDNI()
     */
    private final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    
    /**
     * Permite construir personas pasandole todos los datos
     * <pre>Uso: Persona miPersona = new Persona("Juan", 18, 12345678, 'M', 75, 1.85)</pre>
     * @param nombre String Nombre completo de la persona
     * @param edad int Edad de la persona
     * @param dni int DNI sin letra de la persona
     * @param sexo char Sexo de la persona
     * @param peso double Peso en kg de la persona
     * @param altura double Altura en metros de la persona
     */
    public Persona(String nombre, int edad, int dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    /**
     * Permite construir personas pasandole nombre, edad y sexo
     * <pre>Uso: Persona miPersona = new Persona("Juan", 18,  'M')</pre>
     * @param nombre String Nombre completo de la persona
     * @param edad int Edad de la persona
     * @param sexo char Sexo de la persona
     */
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    /**
     * Permite construir una instancua de persona sin datos
     * <pre>Uso: Persona miPersona = new Persona()</pre>
     */
    public Persona() {
    }

    /**
     * Permite recuperar el nombre de la persona
     * <pre>Uso: nombre = miPersona.getNombre()</pre>
     * @return String Nombre completo de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite asignar valor al nombre completo de la persona
     * <pre>Uso: miPersona.setNombre("Joan")</pre>
     * @param nombre String Nombre completo de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Permite recuperar a la edad de la persona
     * <pre>Uso: edad = miPersona.getEdad()</pre>
     * @return int Edad de la persona
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Permite asignar valor a la edad de la persona
     * <pre>Uso: miPersona.setEdad(19)</pre>
     * @param edad int Edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Permite recuperar el DNI de la persona
     * <pre>Uso: dni = miPersona.getDNI()</pre>
     * @return int DNI de la persona
     */
    public int getDni() {
        return dni;
    }

    /**
     * Permite asignar valor al DNI de la persona
     * <pre>Uso: miPersona.setDNI(87654321)</pre>
     * @param dni int DNI de la persona
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * Permite recuperar la primera letra del sexo de la persona
     * (H - homnre, M - mujer)
     * <pre>Uso: sexo = miPersona.getSexo()</pre>
     * @return char Sexo de la primera letra del sexo de la persona
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * Permite asignar valor al sexo de la persona
     * <pre>Uso: miPersona.setSexo('M')</pre>
     * @param sexo Char la primera letra del sexo de la persona
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    /**
     * Permite recuperar el peso de la persona en kg
     * <pre>Uso: peso = miPersona.getPeso()</pre>
     * @return double Peso en kg de la persona
     */
    public double getPeso() {
        return peso;
    }
    
    /**
     * Permite asignar valor al peso de la persona en kg
     * <pre>Uso: miPersona.setPeso(55.5)</pre>
     * @param peso double Peso en kg de la persona
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
    /**
     * Permite recuperar la altura de la persona en metros
     * <pre>Uso: altura = miPersona.getAltura()</pre>
     * @return double Altura en metros de la persona
     */
    public double getAltura() {
        return altura;
    }
    
    /**
     * Permite asignar valor la altura de la persona en metros
     * <pre>Uso: miPersona.setAltura(1.45)</pre>
     * @param altura double Altura de la persona en metros
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Metodo sobreescritro que muestra los datos de la persona
     * <pre>Uso: miPersona.toString() </pre>
     * @return String Datos de la persona
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    /**
     * Metodo que calcula el IMC de la persona. Le pasamos dos contantas como
     * umbral alto y bajo.
     * <pre>Uso: imc = miPersona.calcularIMC()</pre>
     * @return int:
     *         -1 si el IMC es menor que el umbral bajo (UMBRAL_BAJO),
     *          0 si el IMC está entre los umbrales (inclusive),
     *          1 si el IMC es mayor que el umbral alto (UMBRAL_ALTO).
     * @see #UMBRAL_ALTO
     * @see #UMBRAL_BAJO
     */
    public int calcularIMC(){
        double imc = (this.peso / (this.altura * this.altura));
        if(imc > UMBRAL_BAJO){
            return -1; 
        }else if(imc <= UMBRAL_ALTO){
            return 0;
        }else{
            return 1;
        }
    }
    /**
     * Metodo que verifica si la persona es mayor de edad.
     * <pre>Uso: esMayorDeEdad = miPersona.esMayorDeEdad()</pre>
     * @return boolean:
     *         true si edad de la persona es mayor o igual a 18, 
     *         false si es menor que 18.
     * 
     */
    public boolean esMayorDeEdad(){
        return this.edad >= 18;
    }
    
    /**
    * Genera la letra correspondiente al número de DNI.
    * Usa una constante de tipo String con las letras del DNI.
    * <pre>Uso: letraDNI = miPersona.generaLetraDNI()</pre>
    * @return char: La letra asociada al DNI según su módulo 23.
    * @see #LETRAS
    */
    public char generaLetraDNI(){
        return LETRAS.charAt(this.dni%23);
    }
}

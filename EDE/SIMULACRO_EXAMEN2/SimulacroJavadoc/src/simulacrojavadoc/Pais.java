package simulacrojavadoc;
/**
 * Clase Pais, que permite trabajar con instancias de tipo Pais
 * @author Yehor Burlachenko
 * @see <a href="https://github.com/krypton1312/AulaCampus">Mi GitHub</a>
 * @version 1.01 24 de febrero 2025
 */
public class Pais {
    /**
     * identificadorPais es el ID del pais
     */
    private int identificadorPais;
    /**
     * nombrePais es el nombre del pais
     */
    private String nombrePais;
    /**
     * nombreCapital es el nombre de la capital del pais
     */
    private String nombreCapital;
    /**
     * superficie es el superficie del pais
     */
    private int superficie;
    
    /**
     * Constructor que permite crear instancias de la clase Pais,
     * pasandole todos los datos.
     * <pre>Uso: Pais miPais = new Pais(1, "Francia", "Paris", 21312);</pre>
     * @param identificadorPais int es el ID del pais
     * @param nombrePais String es el nombre del pais
     * @param nombreCapital String es el nombre de la capital del pais
     * @param superficie int es el superficie del pais
     */
    public Pais(int identificadorPais, String nombrePais, String nombreCapital, int superficie) {
        this.identificadorPais = identificadorPais;
        this.nombrePais = nombrePais;
        this.nombreCapital = nombreCapital;
        this.superficie = superficie;
    }
    /**
     * Permite recuperar el identificador del Pais
     * <pre>Uso: int id = miPais.getIdentificadorPais();</pre>
     * @return int Identificador del pais
     */
    public int getIdentificadorPais() {
        return identificadorPais;
    }
    /**
     * Permite asignar  valor a identificador del pais
     * <pre>Uso: miPais.setIdentificadorPais(5)</pre>
     * @param identificadorPais int Identificador del pais
     */
    public void setIdentificadorPais(int identificadorPais) {
        this.identificadorPais = identificadorPais;
    }
    /**
     * Permite recuperar el nombre del pais
     * <pre>Uso: nombre = miPais.getNombrePais();</pre>
     * @return String Nombre del pais
     */
    public String getNombrePais() {
        return nombrePais;
    }
    /**
     * Permite asignar valor el nombre del pais
     * <pre>miPais.setNombre("Noruega");</pre>
     * @param nombrePais String Nombre del aps
     */
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    /**
     * Permite recuperar el nombre de la capital del pais
     * <pre> nombreCapital = miPais.getNombreCapital();</pre>
     * @return String Nombre de la capital
     */
    public String getNombreCapital() {
        return nombreCapital;
    }
    /**
     * Permite asignar el valor al nombre de la capital del pais
     * <pre>Uso: miPais.setNombreCapital("Madrid");</pre>
     * @param nombreCapital String Nombre de la capital del pais
     */
    public void setNombreCapital(String nombreCapital) {
        this.nombreCapital = nombreCapital;
    }
    /**
     * Permite recuperar el superficie del pais
     * <pre>Uso: superficie = miPais.getSuperficie();</pre>
     * @return int Superficie del pais
     */
    public int getSuperficie() {
        return superficie;
    }
    /**
     * Permite asignar el superficie del pais
     * <pre>Uso: miPais.setSuperficie(123);</pre>
     * @param superficie int Superficie del pais
     */
    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
    /**
     * Metodo sobreescrito que muestra los datos del pais
     * <pre>Uso: miPais.toString();</pre>
     * @return Todos los datos del pais
     */
    @Override
    public String toString() {
        return "Pais{" + "identificadorPais=" + identificadorPais + ", nombrePais=" + nombrePais + ", nombreCapital=" + nombreCapital + ", superficie=" + superficie + '}';
    }
    /**
     * Calcula la densidad de poblacion
     * <pre>Uso: densidad = miPais.densidadPoblacion(144);</pre>
     * @param habitantes int Cantidad de los habitantes del pais
     * @return double Densidad de poblacion
     */
    public double densidadPoblacion(int habitantes){
        return habitantes/this.superficie;
    }
    /**
     * Calcula superficie en metros
     * <pre>Uso: superficieMetros = miPais.superficieMetros();</pre>
     * @return long Superficie en metros
     */
    public long superficieMetros(){
        return this.superficie*1000;
    }
}

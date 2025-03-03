package ejercicio2ext4b;
/**
 * Clase que permite crear instancias de tipo Chalet
 * @author YEHORBURLACHENKO
 * @version 1.01 25 de febrero 2025
 */
public class Chalet {
    /**
     * Es el codigo del chalet
     */
    private String codInmueble;
    /**
     * Es la direccion del chalet
     */
    private String direccion;
    /**
     * Es la poblacion donde esta ubicado el chalet
     */
    private String poblacion;
    /**
     * Es el superficie en metros del chalet
     */
    private int metrosSuperficie;
    /**
     * Es la parcela en metros del chalet
     */
    private int metrosParcela;
    /**
     * Es la cantidad de habitacion del chalet
     */
    private int numHabitaciones;
    /**
     * Es el numero de banyos del chalet
     */
    private int numBanyos;
    /**
     * Es el numero de plazos en el garaje del chalet
     */
    private int numPlazasGaraje;
    /**
     * Es el precio del chalet
     */
    private double precio;
    /**
     * Si el chalet tiene la pisciona
     */
    private boolean piscina;
    /**
     * Si el chalet tiene el paellero
     */
    private boolean paellero;
    
    // Documentat los métodos
    /**
     * El constructor de la clase chalet, que permite crear instancias
     * pasandole todos los datos. 
     * <pre>Uso: Chalet miChalet = new Chalet("1", "Calle Santander 1", "Santander", 300, 500, 6, 3, 5, 953554.55, true, true);</pre>
     * @param codInmueble String Codigo del chalet
     * @param direccion String Direccion del chalet
     * @param poblacion String Poblacion del chalet
     * @param metrosSuperficie int Superficie del chalet en metros
     * @param metrosParcela int Parcela en metros del chalet
     * @param numHabitaciones int Numero de habitaciones del chalet 
     * @param numBanyos int Numero de banyos del chalet
     * @param numPlazasGaraje int Numero de plazas en garaje del chalet
     * @param precio double Precio del chalet
     * @param piscina boolean Si el chalet tiene piscina
     * @param paellero boolean Si el chalet tiene paellero
     */
    public Chalet(String codInmueble, String direccion, String poblacion, int metrosSuperficie, int metrosParcela, int numHabitaciones, int numBanyos, int numPlazasGaraje, double precio, boolean piscina, boolean paellero) {
        this.codInmueble = codInmueble;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.metrosSuperficie = metrosSuperficie;
        this.metrosParcela = metrosParcela;
        this.numHabitaciones = numHabitaciones;
        this.numBanyos = numBanyos;
        this.numPlazasGaraje = numPlazasGaraje;
        this.precio = precio;
        this.piscina = piscina;
        this.paellero = paellero;
    }
    /**
     * Permite recuperar el codigo del chalet
     * <pre>Uso: codigo = miChalet.getCodInmueble();</pre>
     * @return String Codigo del chalet
     */
    public String getCodInmueble() {
        return codInmueble;
    }
    /**
     * Permite asignar el valor al codigo del chalet
     * <pre>Uso: miChalet.setCodInmueble("44");</pre>
     * @param codInmueble String Codigo del chalet
     */
    public void setCodInmueble(String codInmueble) {
        this.codInmueble = codInmueble;
    }
    /**
     * Permite recuperar la direccion del chalet
     * <pre>Uso: direccion = miChalet.getDireccion();</pre>
     * @return String Direccion del chalet
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Permite asignar el valor a la direecion del chalet
     * <pre>Uso: miChalet.setDireccion("Avenida Real 12");</pre>
     * @param direccion String direccion del chalet
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Permite recuperar la poblacion del chalet
     * <pre>Uso: poblacion = miChalet.getPoblacion();</pre>
     * @return String Poblacion del chalet
     */
    public String getPoblacion() {
        return poblacion;
    }
    /**
     * Permite asignar el valor a la poblacion del chalet
     * <pre>Uso: miChalet.setPoblacion("Silla");</pre>
     * @param poblacion String Poblacion del chalet
     */
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    /**
     * Permite recuperar el superficie en metros del chalet
     * <pre>Uso: superficie = miChalet.getMetrosSuperficie();</pre>
     * @return int Superficie en metros del chalet
     */
    public int getMetrosSuperficie() {
        return metrosSuperficie;
    }
    /**
     * Permite asignar el valor al superficie en metros del chalet
     * <pre>Uso: miChalet.setMetrosSuperficie(505);</pre>
     * @param metrosSuperficie int Superficie en metros del chalet
     */
    public void setMetrosSuperficie(int metrosSuperficie) {
        this.metrosSuperficie = metrosSuperficie;
    }
    /**
     * Permite recuperar la parcela en metros del chalet
     * <pre>Uso: parcela = miChalet.getMetrosParcela();</pre>
     * @return int Parcela en metros del chalet
     */
    public int getMetrosParcela() {
        return metrosParcela;
    }
    /**
     * Permite asignar el valor a la parcela en metros del chalet
     * <pre>Uso: miChalet.setMetrosParcela(404);</pre>
     * @param metrosParcela int Parcela en metros del chalet
     */
    public void setMetrosParcela(int metrosParcela) {
        this.metrosParcela = metrosParcela;
    }
    /**
     * Permite recuperar el numero de habitaciones del chalet
     * <pre>Uso: habitaciones = miChalet.getNumHabitaciones();</pre>
     * @return int Numero de habitaciones del chalet
     */
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    /**
     * Permite asignar el valor al numero de habitaciones del chalet
     * <pre>Uso: miChalet.setNumHabitaciones(7);</pre>
     * @param numHabitaciones int Numerode habitacion del chalet
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    /**
     * Permite recuperar el numero de banyos del chalet
     * <pre>Uso: banyos = miChalet.getNumBanyos();</pre>
     * @return int Numero de banyos del chalet
     */
    public int getNumBanyos() {
        return numBanyos;
    }
    /**
     * Permite asignar el valor al numero de banyos del chalet
     * <pre>Uso: miChalet.setNumBanyos(5);</pre>
     * @param numBanyos int Numerode banyos del chalet
     */
    public void setNumBanyos(int numBanyos) {
        this.numBanyos = numBanyos;
    }
    /**
     * Permite recuperar el numero de plazas del garaje del chalet
     * <pre>Uso: plazas = miChalet.getNumPlazasGaraje();</pre>
     * @return int Numero de plazas del garaje del chalet
     */
    public int getNumPlazasGaraje() {
        return numPlazasGaraje;
    }
    /**
     * Permite asignar el valor al numero de plazas del garaje del chalet
     * <pre>Uso: miChalet.setNumPlazasGaraje(0);</pre>
     * @param numPlazasGaraje int Numero de plazas del garaje del chalet
     */
    public void setNumPlazasGaraje(int numPlazasGaraje) {
        this.numPlazasGaraje = numPlazasGaraje;
    }
    /**
     * Permite recuperar el precio del chalet
     * <pre>Uso: precio = miChalet.getPrecio();</pre>
     * @return double Precio del chalet
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Permite asignar el valor al precio del chalet
     * <pre>Uso: miChalet.setPrecio(500234);</pre>
     * @param precio double Precio del chalet
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /**
     * Permite recuperar si el chales tiene piscina
     * <pre>Uso: piscina = miChalet.isPiscina();</pre>
     * @return boolean Si el chales tiene piscina
     */
    public boolean isPiscina() {
        return piscina;
    }
    /**
     * Permite asignar el valor a la piscina del chalet
     * <pre>Uso: miChalet.setPiscina(false);</pre>
     * @param piscina boolean Si el chales tiene piscian
     */
    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }
    /**
     * Permite recuperar si el chales tiene paellero
     * <pre>Uso: paellero = miChalet.isPaellero();</pre>
     * @return boolean Si el chales tiene paellero
     */
    public boolean isPaellero() {
        return paellero;
    }
    /**
     * Permite asignar el valor al paellero del chalet
     * <pre>Uso: miChalet.setPaellero(false);</pre>
     * @param paellero boolean Si el chales tiene paellero
     */
    public void setPaellero(boolean paellero) {
        this.paellero = paellero;
    }
    /**
     * Metodo sobreescrito para recuperar todos los datos
     * <pre>Uso: miChales.toString();</pre>
     * @return String Todos los datos del chates
     */
    @Override
    public String toString() {
        return "Chalet{" + "codInmueble=" + codInmueble + ", direccion=" + direccion + ", poblacion=" + poblacion + ", metrosSuperficie=" + metrosSuperficie + ", metrosParcela=" + metrosParcela + ", numHabitaciones=" + numHabitaciones + ", numBanyos=" + numBanyos + ", numPlazasGaraje=" + numPlazasGaraje + ", precio=" + precio + ", piscina=" + piscina + ", paellero=" + paellero + '}';
    }
    /**
     * Metodo que calcula IVA del chalet
     * @param porcentaje double Procentaje del IVA
     * @return double Precio con IVA
     */
    public double calcularIva(double porcentaje){
        return this.precio*porcentaje;
    }
    /**
     * Metodo que calcula la comision del chalet,
     * sabiendo los datos que tiene se amplica cierta comision 
     * @param cliente boolean Si la persona es cliente
     * @return double Comision del chalet
     */
    public double calcularComision(boolean cliente){
        double comision = this.precio * 0.10;
        if(this.piscina){
            comision+=1000;
        }
        if(this.paellero){
            comision+=500;
        }
        if(cliente){
            comision-=750;
        }     
        return comision;
    }
}

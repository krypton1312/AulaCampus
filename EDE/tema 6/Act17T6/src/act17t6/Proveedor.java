package act17t6;
import java.util.ArrayList;
import java.util.Scanner;
public class Proveedor {
    Scanner sc = new Scanner(System.in);
    private String CIF;
    private String nombreEmpresa;
    private String descripcion;
    private String sector;
    private String direccion;
    private int telefono;
    private String poblacion;
    private int codPostal;
    private String correo;
    private ArrayList<Producto> productos;

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Proveedor(String CIF, String nombreEmpresa, String descripcion, String sector, String direccion, int telefono, String poblacion, int codPostal, String correo, ArrayList<Producto> productos) {
        this.CIF = CIF;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcion = descripcion;
        this.sector = sector;
        this.direccion = direccion;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.codPostal = codPostal;
        this.correo = correo;
        this.productos = productos;
    }
    
    
    public String getCIF() {
        return CIF;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getSector() {
        return sector;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public int getCodPostal() {
        return codPostal;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public void setCodPostal(int codPostal) {
        this.codPostal = codPostal;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
   

    public void muestraDatos() {
        System.out.println("CIF: " + getCIF());
        System.out.println("Nombre de la Empresa: " + getNombreEmpresa());
        System.out.println("Descripción: " + getDescripcion());
        System.out.println("Sector: " + getSector());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Teléfono: " + getTelefono());
        System.out.println("Población: " + getPoblacion());
        System.out.println("Código Postal: " + getCodPostal());
        System.out.println("Correo: " + getCorreo());
    }
    
    public boolean verificaCorreo(){
        if(this.correo.contains("@")){
            return true;
        }else{
            return false;
        }
    }
}

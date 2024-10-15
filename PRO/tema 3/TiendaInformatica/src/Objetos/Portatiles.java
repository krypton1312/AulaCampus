package Objetos;

public class Portatiles {
    private int codigo;
    private String descripcion;
    private double precio;
    private boolean defectuoso;
    private static int numDefectuosos = 0;
   
    public Portatiles(){
        this.defectuoso=false;
    }
    public Portatiles(int codigo, String descripton, double precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.defectuoso=false;
    }
    // Setters
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void setDefectuoso(boolean defectuoso){
        if(this.defectuoso!=defectuoso){
            this.defectuoso = defectuoso;
            if(this.defectuoso){
                numDefectuosos++;
            }
            else{
                numDefectuosos--;
            }
        }
    }
    // Getters
    public int getCodigo(){
        return this.codigo;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public double getPrecio(){
        return this.precio;
    }
    
    public void mostrarDatos(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("Precio: " + this.precio);
        System.out.println("Defectuso: " + this.defectuoso);
    }
    public static void muestraNumDefectuosos(){
        System.out.println("Numero defectuosos: " + numDefectuosos);
    }
}

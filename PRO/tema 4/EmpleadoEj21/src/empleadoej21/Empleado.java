package empleadoej21;

public class Empleado implements Calculacion{
    private String codigo;
    private String nombre;
    private String apellido;
    private double sueldo;
    private int numHijos;
    private boolean desplazamiento;
    private int categoriaLaboral;

    public Empleado(String codigo, String nombre, String apellido, double sueldo, int numHijos, boolean desplazamiento, int categoriaLaboral) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.numHijos = numHijos;
        this.desplazamiento = desplazamiento;
        this.categoriaLaboral = categoriaLaboral;
        setSueldo(calculaPlus());
        setSueldo(calculaRetencion());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public boolean isDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(boolean desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public int getCategoriaLaboral() {
        return categoriaLaboral;
    }

    public void setCategoriaLaboral(int categoriaLaboral) {
        this.categoriaLaboral = categoriaLaboral;
    }
    @Override
    public double calculaRetencion(){
        switch(this.categoriaLaboral){
            case 1: 
                return this.sueldo - (this.sueldo * 0.1);
            case 2:
                return this.sueldo - (this.sueldo * 0.15);
            case 3: 
                return this.sueldo - (this.sueldo * 0.2);
            case 4:
                return this.sueldo - (this.sueldo * 0.3);
            default:
                return sueldo;
        }
    }
    @Override
    public double calculaPlus(){
        if(this.numHijos == 0 && !desplazamiento){
            return this.sueldo + (this.sueldo * 0.03);
        }else if(this.numHijos > 0 && !desplazamiento){
            return this.sueldo + (this.sueldo * 0.05);
        }else if(this.numHijos == 0 && desplazamiento){
            return this.sueldo + (this.sueldo * 0.08);
        }else if(this.numHijos > 0 && desplazamiento){
            return this.sueldo + (this.sueldo * 0.1);
        }
        return this.sueldo;
    }
    
    @Override
    public String toString() {
        return "Empleado{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + ", numHijos=" + numHijos + ", desplazamiento=" + desplazamiento + ", categoriaLaboral=" + categoriaLaboral + '}';
    }
    
}

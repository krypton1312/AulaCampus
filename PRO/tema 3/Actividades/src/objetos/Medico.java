package objetos;

public class Medico {

    private String codMedico;
    private String nombre;
    private String dni;
    private String direccion;
    private String telefono;
    private String poblacion;
    private String fechaNacimiento;
    private String especialidad;
    private double sueldo;

    public Medico(String codMedico, String nombre, String dni, String direccion, String telefono, String poblacion, String fechaNacimiento, String especialidad, double sueldo) {
        this.codMedico = codMedico;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.fechaNacimiento = fechaNacimiento;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public Medico() {
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void retencionMedico(double porcentajeRetencion) {
        double retencion = this.sueldo * (porcentajeRetencion / 100);
         this.sueldo -= retencion;
    }

    @Override
    public String toString() {
        return "Medico{" + "codMedico=" + codMedico + ", nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + ", telefono=" + telefono + ", poblacion=" + poblacion + ", fechaNacimiento=" + fechaNacimiento + ", especialidad=" + especialidad + ", sueldo=" + sueldo + '}';
    }
    
}

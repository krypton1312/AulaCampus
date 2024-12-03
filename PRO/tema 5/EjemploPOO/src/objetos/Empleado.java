package objetos;

public final class Empleado extends Persona {
    private double sueldo;

    public Empleado(double sueldo, String nombre, String apellidos) {
        super(nombre, apellidos);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public double calculaSueldoFinal(double bonus){
        return getSueldo() + bonus;
    }
    
    public double calculaSueldoFinal(double bonus, double retencion){
        return (getSueldo() + bonus) - (bonus * retencion / 100);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nEmpleado{" + "sueldo=" + sueldo + '}';
    }
    
}

package objetos;

public class Vehiculo {
    private String matricula;
    private int velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", velocidad=" + velocidad + '}';
    }
    
    public void acelerar(int velocidad) {
        if (velocidad < 0) {
            System.out.println("ERROR, acelero no puede ser negativo, intenta de nuevo");
        }else{
            setVelocidad(getVelocidad() + velocidad);
        }
    }
}

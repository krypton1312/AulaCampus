package objetos;

public class Coche {
    private String matricula;
    private int velocidad;
    private int marcha;

    public Coche(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
        this.marcha = 0;
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
        this.velocidad += Math.abs(velocidad);
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = Math.abs(marcha);
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", velocidad=" + velocidad + ", marcha=" + marcha + '}';
    }
    
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidad += incremento;
        }
    }

    public void frenar(int decremento) {
        if (decremento > 0 && velocidad >= decremento) {
            velocidad -= decremento;
        }
    }
    
    protected void cambiaMarcha(int nuevaMarcha) {
       if (nuevaMarcha >= 0) {
            marcha = nuevaMarcha;
       }
    }
}

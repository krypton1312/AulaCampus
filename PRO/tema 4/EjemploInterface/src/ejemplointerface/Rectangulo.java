package ejemplointerface;

public class Rectangulo implements Figura {
    private double lado;
    private double altura;

    public Rectangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado=" + lado + ", altura=" + altura + '}';
    }
    
    @Override
    public double area(){
        return lado*altura;
    }
}

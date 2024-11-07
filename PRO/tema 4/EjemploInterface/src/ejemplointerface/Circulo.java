package ejemplointerface;

public class Circulo implements Figura {
    private double radius;

    public Circulo(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radius=" + radius + '}';
    }
    
    @Override
    public double area(){
        return Math.pow(radius, 2) * PI;
    }
}

package objetos;

public class Camion extends Vehiculo {
    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    public Remolque getRemolque() {
        return remolque;
    }
    
    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }
   
    public void quitaRemolque(){
        this.remolque = null;
    }
    
    @Override
    public void acelerar(int velocidad){
        if (velocidad < 0) {
            System.out.println("ERROR, acelero no puede ser negativo, intenta de nuevo");
        }else if(this.remolque == null || getVelocidad() + velocidad > 99){
            System.out.println("no se puede acelerar mas");
        }
        else{
            setVelocidad(getVelocidad() + velocidad);
        }
    }

    @Override
    public String toString() {
        if(remolque != null){
            return "Camion{" + "matricula=" + getMatricula()+ " " + remolque + " velocidad=" + getVelocidad() + '}';
        }else{
            return "Camion{" + "matricula=" + getMatricula()+ " " + remolque + " velocidad=" + getVelocidad() + '}';
        }
    }
}

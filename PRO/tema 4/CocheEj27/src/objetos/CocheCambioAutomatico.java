package objetos;
public class CocheCambioAutomatico extends Coche {

    public CocheCambioAutomatico(String matricula) {
        super(matricula);
    }

    @Override
    public void acelerar(int incremento) {
        super.acelerar(incremento);
        ajustarMarcha();
    }

    @Override
    public void frenar(int decremento) {
        super.frenar(decremento);
        ajustarMarcha();
    }

    private void ajustarMarcha() {
        if (getVelocidad() >= 0 && getVelocidad() < 20) {
            setMarcha(1);
        } else if (getVelocidad() >= 20 && getVelocidad() < 40) {
            setMarcha(2);
        } else if (getVelocidad() >= 40 && getVelocidad() < 60) {
            setMarcha(3);
        } else if (getVelocidad() >= 60) {
            setMarcha(4);
        }
    }
}


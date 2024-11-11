package objetos;

public class CocheCambioManual extends Coche {

    public CocheCambioManual(String matricula) {
        super(matricula);
    }

    @Override
    public void cambiaMarcha(int nuevaMarcha) {
        if (nuevaMarcha >= 0) {
            setMarcha(nuevaMarcha);
        }
    }
}

package objetos;

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellidos, int id, String estado_civil, String curso) {
        super(nombre, apellidos, id, estado_civil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return super.toString() + "\nEstudiante{" + "curso=" + curso + '}';
    }
    
}

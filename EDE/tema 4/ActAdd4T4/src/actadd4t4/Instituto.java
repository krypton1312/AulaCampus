package actadd4t4;

/**
 * Clase Instituto que nos permite guardar datos del instituto.
 *
 * @author YEHORBURLACHENKO
 * @version 1.0.0 Dieciembre 18 del 2024
 * @see <a href="https://github.com/krypton1312">Mi GitHub</a>
 */
public class Instituto {

    /**
     * Nombre es el nombre del instituto.
     */
    private String nombre;
    /**
     * Direccion es la direccion del instituto.
     */
    private String direccion;
    /**
     * AlumnisMatriculados es la cantidad de alumnos matriculados en el
     * instituto.
     */
    private int alumnosMatriculados;

    /**
     * Constructor que nos permite crear instacias con todos los datos pasados
     * por paramentro.
     * <pre>Uso: Instituto miInsituto = new Instituto("Aula Campus", "direccion", 500)
     * </pre>
     *
     * @param nombre String es el nombre del institulo
     * @param direccion String es la direccion del instituto
     * @param alumnosMatriculados int es la cantidad de alumnos matriculados
     */
    public Instituto(String nombre, String direccion, int alumnosMatriculados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.alumnosMatriculados = alumnosMatriculados;
    }

    /**
     * Permite recuperar el nombre del Instituto.
     * <pre>Uso: miInstituto.getNombre()</pre>
     *
     * @return String nombre del institulo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite asignar valor al nombre del Instituto.
     * <pre>Uso: miInstituto.setNombre()</pre>
     *
     * @param nombre String nombre del insituto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite recuperar la direccion del Instituto.
     * <pre>Uso: miInstituto.getDireccion()</pre>
     *
     * @return String direccion del institulo
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Permite asignar valor al direccion del Instituto.
     * <pre>Uso: miInstituto.setDireccion()</pre>
     *
     * @param direccion String direccion del insituto
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Permite recuperar la cantidad de alumnos matriculados del Instituto.
     * <pre>Uso: miInstituto.getAlumnosMatriculados()</pre>
     *
     * @return int la cantidad de alumnos matriculados del instituto
     */
    public int getAlumnosMatriculados() {
        return alumnosMatriculados;
    }

    /**
     * Permite asignar valor a la cantidad de alumnos matriculados del Instituto.
     * <pre>Uso: miInstituto.setDireccion()</pre>
     *
     * @param alumnosMatriculados int cantidad de alumnos matriculados del insituto
     */
    public void setAlumnosMatriculados(int alumnosMatriculados) {
        this.alumnosMatriculados = alumnosMatriculados;
    }

    /**
     * Permite aumentar la cantidad de alumnos matrculados del Instituto.
     * <pre> Uso: miInstituto.matriculaAlumno()</pre>
     */
    public void matriculaAlumno() {
        alumnosMatriculados++;
    }
    /**
     * Permite disminuir la cantidad de alumnos matrculados del Instituto.
     * <pre> Uso: miInstituto.bajaAlumno()</pre>
     */
    public void bajaAlumno() {
        if (alumnosMatriculados > 0) {
            alumnosMatriculados--;
        }
    }
    /**
     * Permite cerrar el Curso y asogna el valor de los matriculados a 0.
     * <pre> Uso: miInstituto.cerrarCurso()</pre>
     */
    public void cerrarCurso() {
        alumnosMatriculados = 0;
    }
    /**
     * Metodo sobreescrito que muestra los datos del instituto
     * <pre>Uso: miInstituto.toString() </pre>
     * @return String Datos del instituto
     */
    @Override
    public String toString() {
        return "Instituto{" + "nombre=" + nombre + ", direccion=" + direccion
                + ", alumnosMatriculados=" + alumnosMatriculados + '}';
    }
}

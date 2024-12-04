package ejemplojavadoc;
/**
 * Clase Alumno que permite trabajar con instancias de tipo Alumno
 * @author YEHORBURLACHENKO
 * @see <a href="https://github.com/krypton1312/AulaCampus"> Mi GitHub </a>
 * @version 1.0 4 diciembre 2024
 */
public class Alumno {
    /**
     * Nia es el identificador del alumno
     */
    private int nia;
    /**
     * Nombre del alumno del ciclo
     */
    private String nombre;
    /**
     * Curso en el que esta matriculando
     */
    private String curso;
    /**
     * Nota media del alumno en el curso
     */
    private double nota;

    /**
     * Permite construir alumnos pasandole todos los datos
     * <pre>Uso: Alumno miAlumno = new Alumno(122, "Luis", "DAM", 6.5)</pre>
     * @param nia int Identifia al alumno
     * @param nombre String Nombre completo del alumno
     * @param curso String Curso en el que esta matriculado
     * @param nota double Nota media de curso
     */
    public Alumno(int nia, String nombre, String curso, double nota) {
        this.nia = nia;
        this.nombre = nombre;
        this.curso = curso;
        this.nota = nota;
    }
    
    /**
     * Permite asignar valor al identificador del alumno
     * <pre>Uso: miAlumno.setNia(12312)</pre>
     * @param nia int Identificador del alumno
     */
    public void setNia(int nia) {
        this.nia = nia;
    }
    
    /**
     * Permite asignar valor al nombre completo del alumno
     * <pre>Uso: miAlumno.setNombre("Joan")</pre>
     * @param nombre String Nombre completo del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite asignar valor al Curso
     * <pre>Uso: miAlumno.setCurso("ASIR")</pre>
     * @param curso String Curso en el que esta matriculano
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    /**
     * Permite asignar valor a la nota
     * <pre>Uso: miAlumno.setNota(9.5)</pre>
     * @param nota double Nota media del alumno
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

    /**
     * Permite recuperar el nia del alumno
     * <pre>Uso: nia = miALumno.getNia()</pre>
     * @return int Identificador del alumno
     */
    public int getNia() {
        return nia;
    }

    /**
     * Permite recuperar el nombre del alumno
     * <pre>Uso: nombre = miALumno.getNombre()</pre>
     * @return String Nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite recuperar el curso del alumno
     * <pre>Uso: curso = miALumno.getCurso()</pre>
     * @return String Curso en el que esta matriculano
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Permite recuperar la nota del alumno
     * <pre>Uso: nota = miALumno.getNota()</pre>
     * @return double Nota media del alumno
     */
    public double getNota() {
        return nota;
    }

    /**
     * Metodo sobreescrito que muestra los datos del alumno
     * <pre>Uso: miAlumno.toString() </pre>
     * @return String Datos del alumno
     */
    @Override
    public String toString() {
        return "Alumno{" + "nia=" + nia + ", nombre=" + nombre + ", curso=" + curso + ", nota=" + nota + '}';
    }
    
    /**
     * Aumenta la nota un pasado como parametro
     * <pre>Uso notaFinal = miAlumno.notaExtra(1.2)</pre>
     * @param aumento doble Valor que aumentamos
     * @return double Nota Final
     * @exception ArithmeticException Excepcion division por 0
     * @deprecated No se aconseja su uso
     * @see notaExtraFinal(int)
     */
    public double notaExtra(double aumento){
        return this.nota + aumento;
    }
    
    /**
     * Calcula la nota final de forma mejorada
     * <pre>Uso: notaFinal = miAlumno.notaExtraFinal(15)</pre>
     * @param porcentaje int Porcentaje de alumento
     * @return double Nota final del alumno 
     */
    public double notaExtraFinal(int porcentaje){
        return this.nota * (1 + (porcentaje/100));
    }
}

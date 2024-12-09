package act7t4;
/**
 * Clase Calculadora que proporciona métodos para realizar operaciones matemáticas básicas y avanzadas.
 * Contiene métodos para suma, resta, multiplicación, división, potencia, factorial и sumatorio.
 * @author YEHORBURLACHENKO
 * @see <a href="https://github.com/krypton1312/AulaCampus"> Mi GitHub </a>
 * @version 1.0
 */
public class Calculadora {

    /**
     * Realiza la suma de dos números.
     * @param a Primer número.
     * @param b Segundo número.
     * @return Resultado de la suma.
     */
    public double suma(double a, double b) {
        return a + b;
    }

    /**
     * Realiza la resta de dos números.
     * @param a Primer número.
     * @param b Segundo número.
     * @return Resultado de la resta.
     */
    public double resta(double a, double b) {
        return a - b;
    }

    /**
     * Realiza la multiplicación de dos números.
     * @param a Primer número.
     * @param b Segundo número.
     * @return Resultado de la multiplicación.
     */
    public double multiplicacion(double a, double b) {
        return a * b;
    }

    /**
     * Método obsoleto para realizar la división.
     * @param a Dividendo.
     * @param b Divisor.
     * @return Resultado de la división.
     * @deprecated Usar el método {@link #dividir(double, double)}.
     */
    @Deprecated
    public double division(double a, double b) {
        return a / b;
    }

    /**
     * Realiza la división de dos números, controlando la división por cero.
     * @param a Dividendo.
     * @param b Divisor.
     * @return Resultado de la división.
     * @throws ArithmeticException Si el divisor es 0.
     */
    public double dividir(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return a / b;
    }

    /**
     * Calcula la potencia de un número elevado a otro.
     * @param base Base de la potencia.
     * @param exponente Exponente de la potencia.
     * @return Resultado de la potencia.
     */
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    /**
     * Calcula el factorial de un número.
     * @param n Número del cual se desea calcular el factorial.
     * @return Factorial del número.
     * @throws IllegalArgumentException Si el número es negativo.
     */
    public double factorial(double n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        double resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * Calcula el sumatorio de un número hasta n.
     * @param n Límite superior del sumatorio.
     * @return Sumatorio desde 1 hasta n.
     * @throws IllegalArgumentException Si el número es negativo.
     */
    public double sumatorio(double n) {
        if (n < 0) {
            throw new IllegalArgumentException("El sumatorio no está definido para números negativos.");
        }
        return n * (n + 1) / 2;
    }
}

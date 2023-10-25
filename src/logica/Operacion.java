package logica;

/**
 * @author Jorge Monzón
 * @project personal-calculadora-java
 */
public class Operacion {

    Double numero1;
    Double numero2;
    Double resultado;

    public Operacion(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = 0.0;
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public Double suma(Double numero1, Double numero2) {

        try {

            resultado = numero1 + numero2;

            return resultado;

        } catch (ArithmeticException  e) {
            System.err.println("No es un valor valido" + e.getMessage());

            return resultado;
        }

    }

    public Double resta(Double numero1, Double numero2) {

        try {

            resultado = numero1 - numero2;

            return resultado;

        } catch (ArithmeticException  e) {
            System.err.println("No es un valor valido" + e.getMessage());

            return resultado;
        }

    }

    public Double multiplicacion(Double numero1, Double numero2) {

        try {

            resultado = numero1 * numero2;

            return resultado;

        } catch (ArithmeticException  e ) {
            System.err.println("No es un valor valido" + e.getMessage());

            return resultado;
        }

    }

    public Double division(Double numero1, Double numero2) {

        try {

            resultado = numero1 / numero2;

            return resultado;

        } catch (ArithmeticException  e) {
            System.err.println("No es un valor valido" + e.getMessage());

            return resultado;
        }

    }
}

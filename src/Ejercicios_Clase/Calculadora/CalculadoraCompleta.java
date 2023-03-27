package Ejercicios_Clase.Calculadora;

public class CalculadoraCompleta {
    public static Integer suma(Integer A, Integer B) {
        return A + B;
    }

    public static Integer resta(Integer A, Integer B) {
        return A - B;
    }

    public static Integer multiplicacion(Integer A, Integer B) {
        return A * B;
    }

    public static Integer division(Integer A, Integer B) {
        return A / B;
    }

    public static Integer factorial(Integer n) {
        int i = 1;
        int factorial = 1;
        while (i <= n) {
            factorial = factorial + 1;
        }
        return factorial;
    }

    public static Integer mayor(Integer a, Integer b) {
        return (a > b) ? a : b;
        /**
         * Forma corta de hacerlo ya que podríamos hacerlo mediante un if.
         * */
    }

    public static Integer mayor(Integer a, Integer b, Integer c) {
        Integer result = a;
        if (a > b && a > c) {
            result = a;
        } else if (b > a && b > c) {
            result = b;
        } else {
            result = c;
        }
        return result;
        // Se podría hacer de una forma parecida a este aunque este no está completo [return (a > b && b > c && a > c)? a : b;]
        // Forma corta de hacerlo ya que podríamos hacerlo mediante un if
    }
}

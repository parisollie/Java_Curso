
public class Factorial {

    public static void main(String[] args) {
        Factorial objFactorial = new Factorial();
        System.out.println("El factorial de 4 mediante método recursivo es: " 
                + objFactorial.factorialRecursivo(4));
        System.out.println("El factorial de 4 mediante método cíclico es: "
                + objFactorial.factorialCiclo(4));

    }
    /*
     * 4! = 1*2*3*4=24
     * Creando el método factorial de manera recursiva.
     */

    public int factorialRecursivo(int n) {
        // Validando el que el numero sea positivo.
        if (n < 0) {
            return 0;
        } else {
            // Caso base
            if (n == 0) {
                // Ya sabemos que el factorial es 1
                return 1;
            } else {
                // Dominio (problema -1)
                return n * factorialRecursivo(n - 1);
            }
        }
    }

    // Creando método factorial mediante ciclo.
    public int factorialCiclo(int n) {
        int factor = 1;
        if (n < 0) {
            return 0;
        } else {
            while (n != 0) {
                factor = n * factor;
                n--;
            }
            return factor;
        }
    }

}

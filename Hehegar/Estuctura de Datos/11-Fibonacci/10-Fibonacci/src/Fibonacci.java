/*Los dos primeros números son 1, luego 2(1+1), luego 3(1+2), 5(2+3) y
así sucesivamente: 1, 1, 2, 3, 5, 8, 13, 21.... */
public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci objFibonacci = new Fibonacci();
        System.out.println("La sucesión Fibonacci de 12 mediante recursividad "
                + objFibonacci.fibonacciRecursivo(12));
        System.out.println("La sucesión Fibonacci de 12 mediante ciclo " 
                + objFibonacci.fibonacciCiclilo(12));
    }

    // Creando el método recursivo para la sucesón Fibonacci.
    public int fibonacciRecursivo(int n) {
        if (n == 1 || n == 2) {
            // Case base (respuesta explícita)
            return 1;
        } else {
            // Dominio(problema -1)
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);

        }
    }

    // Creando el método ciclico para la sucesón Fibonacci.
    public int fibonacciCiclilo(int n) {
        int fibo = 0, primero = 1, segundo = 0;
        while (n > 0) {
            fibo = primero + segundo;
            primero = segundo;
            segundo = fibo;
            n--;
        }
        return fibo;
    }

}

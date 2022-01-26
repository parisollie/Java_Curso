
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);

		Calculadora calcula = new Calculadora();
		int suma = calcula.sumar(a,b);
		int resta = calcula.restar(a,b);
		int multiplicacion = calcula.multiplicar(a,b);
		int modulo = calcula.modulo(a,b);
		
		System.out.println("Los resultados son: ");
		System.out.println("Suma: "+suma);
		System.out.println("Resta: "+resta);
		System.out.println("Multiplicacion: "+multiplicacion);
		System.out.println("Modulo: "+ modulo);

        
    }
    
}

public class PropagaExcepcion {

	public static int miMetodo(int a, int b){
		int c = a/b;
		return c;
	}

	public static void main(String[] args) {
		try{
			int division = miMetodo(10, 0);
			System.out.println(division);
		} catch(ArithmeticException e) {
			System.out.println("Excepcion aritmetica arrojada: " );
			e.printStackTrace();
		}
	}
}


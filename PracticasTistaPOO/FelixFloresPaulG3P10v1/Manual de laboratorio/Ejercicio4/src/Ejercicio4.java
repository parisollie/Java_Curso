
public class Ejercicio4 {

    
    public static void main(String[] args) {
        
    try {
            float equis = 5 / 2;
            System.out.println("Equis = " + equis);

        
    }
    catch (ArithmeticException e

    
        ){
            System.out.println("Error: dividir entre cero");

    }

    
        finally {
            System.out.println("A pesar de todo se ejecuta el bloque finally");
    }

}
}
    


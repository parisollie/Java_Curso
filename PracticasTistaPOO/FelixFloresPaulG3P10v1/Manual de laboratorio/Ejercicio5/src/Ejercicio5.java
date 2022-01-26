
public class Ejercicio5 {

    public static void main(String[] args) {
        try {
            float equis = 5 / 0;
            System.out.println("Equis = " + equis);

        
    }
    catch (ArithmeticException e){
            System.out.println("Error: dividir entre cero");

    }catch (Exception e){
            System.out.println("Error:excepcion general");

    }finally {
            System.out.println("A pesar de todo se ejecuta el bloque finally");
    }

}
}


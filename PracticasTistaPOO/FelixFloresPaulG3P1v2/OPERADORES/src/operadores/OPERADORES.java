

import java.util.Scanner;

/**
 *
 * @author andro
 */
public class OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in); // Para guardar los datos System.in es para que me lea los datos,le llamamos entrada

        float numero1,numero2,suma,resta,mul,div,modulo;
        int nummer = 10,x = 5,a = 5,b ;

        System.out.println("Digite 2 numeros: ");

        numero1 = entrada.nextFloat();
        numero2 = entrada.nextFloat();

        suma = numero1 + numero2;
        resta = numero1 - numero2;
        mul = numero1 * numero2;
        div = numero1/numero2;
        modulo = numero1%numero2;
        nummer =nummer+5; // nummer+=5
        x++; // x+=1 Incremento,x-- Decremento

        b = a++; // primero  b se le asigna a y entonces a se incrementa
                 //++a primero se incrementa a y despues se le asigna a b


        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+mul);
        System.out.println("La divicion es: "+div);
        System.out.println("El modulo es: "+modulo);
        System.out.println(nummer);
        System.out.println(x);
        System.out.println(b);
    }

}


package Operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author andro
 */
public class Metodos {
    //Atributos
   
    //Métodos ( Todas las acciones que podemos realizar en las clases
    
    
    
    //Método apra sumar numeros
    public int sumar(int numero1, int numero2){
        int suma = numero1+numero2;
        return suma ;//Me regresa el valor de suma
    }
    public int resta(int numero1, int numero2){
       int  restar = numero1-numero2;
        return restar ;
    }
    public int multiplicacion(int numero1, int numero2){
        int multiplicar = numero1*numero2;
        return multiplicar;
    }
    public int divicion(int numero1, int numero2){
        int dividir = numero1/numero2;
        return dividir;
    }
    public void mostrarresultados(int suma,int resta,int multiplicacion,int divicion){
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La divicion es: "+divicion);
    }
}

    


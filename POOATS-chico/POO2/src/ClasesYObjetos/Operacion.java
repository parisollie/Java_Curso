
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    
    //Atributos Variables Globales
    int numero1;
    int numero2;
    int suma;
    int multiplicacion;
    int divicion ;
    int resta ;
    //Métodos ( Todas las acciones que podemos realizar en las clases
    
    //Método para pedirle al usuario que digite 2 numeros
    public void leerNumeros(){ // Quiero que el metodo sea publico y no retorna nada,porque lo que quiero es pedir ds numeros por eso es void
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
    }
    
    //Método apra sumar numeros
    public void sumar(){
        suma = numero1+numero2;
    }
    
    public void resta(){
        resta = numero1-numero2;
    }
    public void multiplicacion(){
        multiplicacion = numero1*numero2;
    }public void divicion(){
        divicion = numero1/numero2;
    }
    public void mostrarresultados(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La divicion es: "+divicion);
    }
}

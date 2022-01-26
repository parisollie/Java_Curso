
package Operaciones;

import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args){
        
        //Para pedir los  datos al uuario
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digita un número: "));
        
        Metodos op = new Metodos();//Creamos un objeto operacion
        
        int suma = op.sumar(n1,n2);
        //System.out.println("La suma es: "+op.sumar(n1,n2)); Podriamos poner eso y borrar la linea 22
        int mul = op.multiplicacion(n1,n2);
        int resta= op.resta(n1,n2);
        int div = op.sumar(n1,n2);
        
        op.mostrarresultados(suma, resta, mul, div);
        
    
}
}

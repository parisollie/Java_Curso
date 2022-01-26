
package Ejercicio1;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        //Creao un objeto
        Cuadrilatero c1;
        float lado1,lado2;
        
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 1 del cuadrilatero: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el lado 2 del cuadrilatero: "));
        
        if(lado1 == lado2){//Entonces es un cuadrado
            c1 = new Cuadrilatero(lado1);//Inicializando con el siguiente constructor
        }else{
            c1 = new Cuadrilatero(lado1, lado2);
        }
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());
    }
}

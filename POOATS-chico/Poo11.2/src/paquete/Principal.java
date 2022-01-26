/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import javax.swing.JOptionPane;

/**
 *
 * @author andro
 */
public class Principal {
    public static void main(String [] args){
        int x = 0 , y = 0, aux = 0;
       
        //Se crea objeto op para la clase Mover
        Mover op = new Mover();
        
        //Se solicita indicar el movimiento
        aux = Integer.parseInt(JOptionPane.showInputDialog("1. Movimiento horizontar\n"
                + "2. Movimiento verticar"));
      
        //Se pasa el dato capturado anteriormente de la varible aux al metodo setAun
        op.setAux(aux);
        
        //Se capturan los datos de la posicion a mover
        if (aux == 1) {
           x = Integer.parseInt(JOptionPane.showInputDialog("Introducir la posicion a mover: \n"
                   + "Para mover a la derecha el valor debe se positivo\n"
                   + "Para mover a la izquiereda el valor debe ser negativo"));
        }
        else if(aux == 2){
            y = Integer.parseInt(JOptionPane.showInputDialog("Introducir la posicion a mover\n"
                   + "Para mover hacia arriba el valor debe se positivo\n"
                   + "Para mover hacia abajo el valor debe ser negativo"));
        }
            else {
                    JOptionPane.showMessageDialog(null, "El valor introducido es incorrecto");
                    }
        
       //Se envia la posicion al metodo setMover.
        op.setMover(x, y);
  
        //Se invoca el metodo operacion.
        op.operacion();
    }
}
    


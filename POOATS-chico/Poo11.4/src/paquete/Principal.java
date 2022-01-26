
package paquete;

import javax.swing.JOptionPane;

/**
 *
 * @author andro
 */
public class Principal {
    public static void main(String[] args){
        char opc;
        Movimiento mov=new Movimiento(0,0);
        do{
            opc=Character.toLowerCase(JOptionPane.showInputDialog("Digita la direccion \n\"n\" para salir").charAt(0));
            switch(opc){
                case'a':mov.Izq();break;
                case'd':mov.Der();break;
                case's':mov.Abaj();break;
                case'w':mov.Arri();break;
                case'n':JOptionPane.showMessageDialog(null,"Gracias vuelva pronto");break;
                default:JOptionPane.showMessageDialog(null,"Tecla incorrecta \nSolo puedes usar las teclas w, a, s, d");
            }
        }while(opc!='n');
    }

    
}

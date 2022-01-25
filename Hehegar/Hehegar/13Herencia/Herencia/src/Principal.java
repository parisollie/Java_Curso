//Herencia Hehegar 14
/*Permite la creacion de nuevas clases basadas en clases existentes.Cuando 
heredamos una clase existente,reusamos(o heredamos)metodos y atributos, y 
agregamos nuevos atributos y metodos para cumplir con la situacion nueva.
*/
import javax.swing.JOptionPane;
public class Principal {
    public static void main (String[] args) {
        
        ClaseHija ch = new ClaseHija();
        ClasePadre cp = new ClasePadre ();
        cp.hagoGalletas();
        JOptionPane.showMessageDialog(null,"Herede el oficio-clase hija-: "+ ch.oficio);
        // Lo esta hereando de la clase padre
        ch.hagoGalletas(); 
    }
    
}

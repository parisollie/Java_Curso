//Herencia Hehegar-14
/*Permite la creación de nuevas clases basadas en clases existentes.Cuando 
heredamos una clase existente,reusamos(o heredamos)metódos y atributos, y 
agregamos nuevos atributos y metódos para cumplir con la situación nueva.
*/
import javax.swing.JOptionPane;
public class Principal {
    
    public static void main (String[] args) {
        //Paso 4, creamos un objeto de clase hija.
        ClaseHija ch = new ClaseHija();
        ClasePadre cp = new ClasePadre ();
        
        //Paso 5,Aquí estamos heredando del clase padre
        cp.hagoGalletas();
        JOptionPane.showMessageDialog(null,"Herede el oficio-clase hija-: "+ ch.oficio);
        // Lo esta hereando de la clase padre.
        ch.hagoGalletas(); 
    }
    
}

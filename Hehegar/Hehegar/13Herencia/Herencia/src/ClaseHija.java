
import javax.swing.JOptionPane;

/*Paso 3,La clase hija hereda todo de la clase padre.
La palabra mágica se hereda con Extends
extends ClasePadre,la clase hija hereda todo de la clase padre*/
public class ClaseHija extends ClasePadre { 
    
    /* @Override, es para entender que se sobreesribe y para agregarle
    algo adicional.*/
    @Override 
    public void hagoGalletas(){
        JOptionPane.showMessageDialog(null,"Hola soy la subclase hija y hago"
                + " galletas de chocolate.");
    }
}

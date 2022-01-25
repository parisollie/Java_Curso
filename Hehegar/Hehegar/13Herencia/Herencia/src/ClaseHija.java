
import javax.swing.JOptionPane;

// La clase hija hereda todo de a clase padre.
//La palabra magica se hereda con Extends
// extends ClasePadre,la clase hija hereda todo de la clase padre
public class ClaseHija extends ClasePadre { 
    
    @Override // Es para entender que se sobreesribe y para agregarle algo adicional.
    public void hagoGalletas(){
        JOptionPane.showMessageDialog(null,"Hola soy la subclase hija y hago"
                + " galletas de chocolate");
    }
}

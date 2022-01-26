
import javax.swing.JOptionPane;


public class MINICopper extends Auto {
    
     public  MINICopper (int numSerieMotor, int year, String marca, double precio, int pasajeros) {
        super(numSerieMotor, year, marca, precio, pasajeros);
    }
    
    @Override // Sobreescribimos
    public void verDatos(){
        JOptionPane.showMessageDialog(null," Pasajeros: " + pasajeros +"\nNum Serie de motor: " +
                numSerieMotor + "\nAño: "+ year + "\nMarca: "+ marca +
                "\nPrecio: "+ precio," Auto Compacto",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}


import java.io.Serializable;
import javax.swing.JOptionPane;

public class Camioneta extends Vehiculo implements Serializable {

    public int capacidadCarga;
    public int cantidadEjes;
    public int cantidadRodadas;
    public int pasajeros;

    public Camioneta(int capacidadCarga, int cantidadEjes, int cantidadRodadas, int pasajeros, int numSerieMotor, int year, String marca, double precio) {
        super(numSerieMotor, year, marca, precio);
        this.capacidadCarga = capacidadCarga;
        this.cantidadEjes = cantidadEjes;
        this.cantidadRodadas = cantidadRodadas;
        this.pasajeros = pasajeros;
    }

     @Override // Sobreescribimos
    public void verDatos(){
        JOptionPane.showMessageDialog(null," Pasajeros: " + pasajeros + 
                "\nSerie de motor: " +numSerieMotor + "\nAño: "+ year + "\nMarca: "
                + ""+ marca +"\nPrecio: "+ precio+"\nCapacidad de carga:"
                + " "+capacidadCarga +"\nCantidad de ejes: "+cantidadEjes+"\nCan"
                + "tidad de rodadas:"+cantidadRodadas," Camioneta",JOptionPane.INFORMATION_MESSAGE);
    }

    

}


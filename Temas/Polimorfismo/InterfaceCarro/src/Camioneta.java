public class Camioneta extends Vehiculo {

    public int capacidadCarga;
    public int cantidadEjes;
    public int cantidadRodadas;

    public Camioneta(int numSerieMotor, int year, String marca, double precio, int capacidadCarga, int cantidadEjes,
            int cantidadRodadas) {
        super(numSerieMotor, year, marca, precio);
        this.capacidadCarga = capacidadCarga;
        this.cantidadEjes = cantidadEjes;
        this.cantidadRodadas = cantidadRodadas;
    }

    @Override
    public String toString() {
        return "Camioneta [capacidadCarga=" + capacidadCarga + ", cantidadEjes=" + cantidadEjes
                + ", cantidadRodadas=" + cantidadRodadas + ", numSerieMotor=" + numSerieMotor + ", year=" + year
                + ", marca=" + marca + ", precio=" + precio + "]";
    }

}
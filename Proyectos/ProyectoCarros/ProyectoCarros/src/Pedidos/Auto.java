
    public abstract class Auto extends Vehiculo {

    public int pasajeros;

    public Auto(int numSerieMotor, int year, String marca, double precio, int pasajeros) {
        super(numSerieMotor, year, marca, precio);
        this.pasajeros = pasajeros;
    }

}

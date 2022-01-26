public class Vagoneta extends Auto {

    public Vagoneta(int numSerieMotor, int year, String marca, double precio, int pasajeros) {
        super(numSerieMotor, year, marca, precio, pasajeros);
    }

    @Override
    public String toString() {
        return "Vagoneta [pasajeros=" + pasajeros + ", numSerieMotor=" + numSerieMotor + ", year=" + year
                + ", marca=" + marca + ", precio=" + precio + "]";
    }

}
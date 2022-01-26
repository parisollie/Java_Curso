public class AutoCompacto extends Auto {

    public AutoCompacto(int numSerieMotor, int year, String marca, double precio, int pasajeros) {
        super(numSerieMotor, year, marca, precio, pasajeros);
    }

    @Override
    public String toString() {
        return "AutoCompacto [pasajeros=" + pasajeros + ", numSerieMotor=" + 
                numSerieMotor + ", year=" + year
                + ", marca=" + marca + ", precio=" + precio + "]";
    }

}
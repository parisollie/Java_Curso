
//Nuestra super clase
public abstract class Vehiculo {

    //Atrbutos
    public int numSerieMotor;
    public int year;
    public String marca;
    public double precio;

    //Constructor
    public Vehiculo(int numSerieMotor, int year, String marca, double precio) {
        super();
        this.numSerieMotor = numSerieMotor;
        this.year = year;
        this.marca = marca;
        this.precio = precio;
    }
    
    //Metodo ver datos
    public void verDatos(){ //Metodo que no ha sido especificado
        
    }

}

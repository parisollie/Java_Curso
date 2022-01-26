
public class Triangulo extends FigurasGeometricas {
    
    //Atributos
    private double base,altura;
    
    //Constructor

    public Triangulo(double base, double altura) {
        
        super(" Triagulo");//Estoy invocancdo explicitamente al contructor que esta en clae base
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area(){ // Sobreescritura del metodo
        return base*altura/2;
    }
}

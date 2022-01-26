
public class Rectangulo extends FigurasGeometricas {
    
    //Atributos
    private double base,altura;
    
    //Constructor

    public Rectangulo(double base, double altura) {
        
        super(" Rectangulo");//Estoy invocancdo explicitamente al contructor que esta en clase base,le estamos pasando ese argumento
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double area(){ // Sobreescritura del metodo
        return base*altura;
    }
}


public class Circulo extends FigurasGeometricas{
    
    //Atributos
    private double radio;
    
    //Constructor

    public Circulo(double radio) {
        super(" Circulo");//Estoy invocancdo explicitamente al contructor que esta en clase base
        this.radio = radio;
    }
    
     @Override
    public double area(){ // Sobreescritura del metodo
        return Math.PI*Math.pow(radio,2);//Radio elevado al cuadrado
    }
    
    
}

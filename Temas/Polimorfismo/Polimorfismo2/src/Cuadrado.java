
public class Cuadrado extends FiguraGeometrica {
    //Atributos
    private String color;
    private double area;
    
    
    // Constructor
    public Cuadrado(double area) {
        this.area = area;
    }
    
    
    
    public void colorFigura(String col){
        color=col;
        System.out.println("Soy un cuadrado de color: "+color);
    }
}

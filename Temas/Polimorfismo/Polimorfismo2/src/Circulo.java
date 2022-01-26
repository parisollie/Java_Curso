
public class Circulo extends FiguraGeometrica{
    private String color;
    private double area;

    //Constructor
    public Circulo(double area) {
        this.area = area;
    }
    
    public void colorFigura(String col){
        color=col;
        System.out.println("Soy un círculo de color: "+color);
    }
    
}

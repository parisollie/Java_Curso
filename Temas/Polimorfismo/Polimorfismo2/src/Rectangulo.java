
public class Rectangulo extends FiguraGeometrica {
    
    private String color;
    private double area;
    

    //Constructor
    public Rectangulo(double area) {
        this.area = area;
    }
    
    
    
    public void colorFigura(String col){
        color=col;
        System.out.println("Soy un rectangulo de color: "+color);
    }
    
    
}

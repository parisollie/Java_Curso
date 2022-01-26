
public class Perro {
    
    //Atributos
    
    protected String nombre;
    //Con Protected acceden las clases hijas
    
    private double peso;
    private String color;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}

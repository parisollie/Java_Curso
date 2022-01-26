//72 chica
public class Polimorfismo2 {

   
    public static void main(String[] args) {
        
        //Creando instancias de la clase 
        FiguraGeometrica fg = new Cuadrado(40.2); //Creando una referencia de la super clase Figura geómetrica,puede apuntar a un objetos de sus clases(cuadrado,rectagulo,circulo)
        //Cuadrado c1 =new FiguraGeometrica(20.4);una figura geómetrica no puede ser un cuadrado
        //fg apunta a un objeto de la clase cuadrado
        FiguraGeometrica fg2 = new Rectangulo(13.2);
        FiguraGeometrica fg3 = new Circulo(13.2);
        
        
        //Es el mismo color pero se ejecuta en base al método que le damos , ya se cuadrado ,círculo o rectángulo.
        fg.colorFigura("Azul");// Se ejecuta en base a la clase del objeto,en este caso fg pertenece a cuadrado.
        fg2.colorFigura("Rojo");
        fg3.colorFigura("Turquesa");
        /*El objeto fg invoca al método colorFigura y esté nos pide un string en este caso rojo.
        
        */
    }
    
}

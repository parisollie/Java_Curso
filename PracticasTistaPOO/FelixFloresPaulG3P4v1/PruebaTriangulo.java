
public class PruebaTriangulo {

    public static void main(String[] args) {
        
        Triangulo triangulo = new Triangulo ();//Instancia para triangulo
        triangulo.base = 5;
        triangulo.altura=8;
        
        System.out.println("base: "+triangulo.base);
        System.out.println("altura: "+triangulo.altura);
        
        //metodo sobrecargado
        
        System.out.println("area() ->"+ triangulo.area());
        System.out.println("area(6,2) ->"+ triangulo.area());
        System.out.println("area(5.5f , 3.2f) ->"+ triangulo.area(5.5f,3.2f));
    }
    
}

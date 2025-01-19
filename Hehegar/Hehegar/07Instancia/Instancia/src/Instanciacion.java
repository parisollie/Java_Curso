// Hehegar-7
// Una instancia es un objeto.
public class Instanciacion {    
    //Paso 1,declaramos los atributos de la clase y asignamos valores iniciales.
    String marca,color;
    int modelo;
    double precio;
    
    public static void main(String[] args) {    
        /*Paso 2, creando objetos(Instancias) de la clase llamada Instanciación
        Creamos objetos pero con diferentes caracteristicas*/
        Instanciacion primerAuto = new Instanciacion ();
        Instanciacion segundoAuto = new Instanciacion ();
        
        //Paso 3,asignando valores a los atributos del primer auto.
        primerAuto.marca="Ford";
        primerAuto.color="Amarillo";
        primerAuto.modelo=2013;
        primerAuto.precio =18281882881.00;    
        
        //Paso 4,valores al segundo auto.
        segundoAuto.marca="BMW";
        segundoAuto.color="Rojo";
        segundoAuto.modelo=2019;
        segundoAuto.precio =1289182.00;
        
        System.out.println("-Datos del primer auto-");
        
        //Vamos haciendo referencia al primer auto y al segundo auto.
        System.out.println("Marca: "  + primerAuto.marca);
        System.out.println("Color: "  + primerAuto.color);
        System.out.println("Precio: " + primerAuto.precio);
        System.out.println("-------------------------------");
        System.out.println("-Datos del segundo auto-");
        System.out.println("Marca: "  + segundoAuto.marca);
        System.out.println("Color: "  + segundoAuto.color);
        System.out.println("Precio: " + segundoAuto.precio);
    }
    
}

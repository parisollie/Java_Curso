// Hehegar7
//Una instancia es un objeto
public class Instanciacion {    
    //Declaramos los atributos de la clase y asignando valores iniciales
    String marca,color;
    int modelo;
    double precio;
    
    public static void main(String[] args) {    
        //Creando objetos(Instancias) de la clase llamada Instanciacion
        //Creamos objetos pero con diferentes caracteristicas
        Instanciacion primerAuto = new Instanciacion ();
        Instanciacion segundoAuto = new Instanciacion ();
        
        //Asignando valores a los atributos del primer auto
        primerAuto.marca="Ford";
        primerAuto.color="Amarilo";
        primerAuto.modelo=2013;
        primerAuto.precio =18281882881.00;    
        
        //Valores al segundo auto
        segundoAuto.marca="BMW";
        segundoAuto.color="Rojo";
        segundoAuto.modelo=2019;
        segundoAuto.precio =1289182.00;
        //Mandamos a imprimir
        System.out.println("Datos del primer auto: ");
        //Vamos haciendo referencia al primer auto o al segundo
        System.out.println("Marca: "+ primerAuto.marca);
        System.out.println("Color: "+ primerAuto.color);
        System.out.println("Precii: "+ primerAuto.precio);
        
        System.out.println("Datos del segundo auto: ");
        System.out.println("Marca: "+ segundoAuto.marca);
        System.out.println("Color: "+ segundoAuto.color);
        System.out.println("Precii: "+ segundoAuto.precio);
    }
    
}

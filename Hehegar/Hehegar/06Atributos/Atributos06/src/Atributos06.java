// Hehegar6-Atributos
public class Atributos06 {

    //Declaramos los atributos de la clase y asignamos los valores iniciales
    String marca="Mini Cooper",modelo="2013",color="Amarillo";
    double precio=17800.34;
    
    public static void main(String[] args) {
        //Creando una instancia de mi clase ,es decir un objeto atributo
        Atributos06 instancia1 = new  Atributos06 ();
        //Aqui estamos cambiando el nombre del atributo,por si nos arrepentimos
        instancia1.marca="BMW";
        //Accediendo a los atributos de la instancia,mediante el nombre del
        //objeto instancia1.
        System.out.println("Marca: "+ instancia1.marca);
        System.out.println("Modelo: "+ instancia1.modelo);
        System.out.println("Color: "+ instancia1.color);       
    }    
}

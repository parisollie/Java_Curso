
public class Animal extends SerVivo {
    //Atributos
    String tipo; //Tipo de planta
    

    //Poniendo el constructor
    public Animal (String ti){
        tipo=ti; // el argumento ti lo almaceno en el atributo tipo,entonces cuándo invoquemos al método aliminetarse 
    } 
    //Sobre escribiendose el método aimientare,recordando que lo hereda de ser vivo,pero lo va hacer a sus necesidades
    
    public void alimentarse (){
        System.out.println("Soy una animal me estoy alimentando. "+" Soy un animal de tipo: "+tipo); // Escribira una cosa diferente,es un método modificado
    }
    
}

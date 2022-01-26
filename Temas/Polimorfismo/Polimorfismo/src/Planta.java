
public class Planta extends SerVivo { //Hereda de ser vivo
    
    //Atributos
    String tipo; //Tipo de planta
    
   //Poniendo el constructor
    public Planta (String ti){ // ti lo que se para como argumento
        tipo=ti; //y el argumento se guarda en tipo
    } 
    //Sobre escribiendose el método alimientare,recordando que lo hereda de ser vivo,pero lo va hacer a sus necesidades
    
    public void alimentarse (){
        System.out.println("Soy una Planta me estoy alimentando. "+" Soy una Planta de tipo: "+tipo); // Escribira una cosa diferente,es un método modificado
    }
}

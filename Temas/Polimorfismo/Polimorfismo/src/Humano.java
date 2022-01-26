
public class Humano extends SerVivo {
    //Atributos
    String genero; //Tipo de planta
    
    //Poniendo el constructor
    public Humano (String ge){
        genero=ge;
    } 
    //Sobre escribiendose el método aimientare,recordando que lo hereda de ser vivo,pero lo va hacer a sus necesidades.
    
    public void alimentarse (){
        System.out.println("Soy un humano me estoy alimentando.  "+" Soy de genero: "+genero); // Escribira una cosa diferente,es un metodo modificado
    }
    
     
    
}

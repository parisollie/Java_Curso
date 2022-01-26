
//70.-Miembros estaticos de un paquete

package paquete1;

public class Estatico {
    
    //Creamos un atributo
    private static String frase = "Primera frase"; //Usando encapsulamiento
    /*
    Como es un atributo estatico ya no le pertenece a los ojetos sino a la Clase
    */
    //Creamos un Método
    public static int sumar(int n1,int n2){
        int suma= n1+n2;
        return suma;
    }
    
    
    public static void main (String[] args){
       System.out.println(Estatico.frase);
        System.out.println("La suma es: "+Estatico.sumar(17, 12));
    }
    
}
/*
//Creamos un objeto
       Estatico ob1 = new Estatico();
       Estatico ob2 = new Estatico();
       
       ob2.frase = "Segunda frase";
       
       System.out.println(ob1.frase);
       System.out.println(ob2.frase);
*/
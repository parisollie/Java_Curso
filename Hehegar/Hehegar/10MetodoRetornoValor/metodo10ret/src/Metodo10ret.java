//Hehegar10-Metodos con retorno de un valor 
public class Metodo10ret {

    
    public static void main(String[] args) {
        //Creamos las instancias de nuestro objeto
        int resultado;
        int r = 5;
        boolean estValor ;
        
        Operaciones op1 = new Operaciones();
        resultado = op1.suma(3, 10);
        System.out.println("La suma es: " + resultado);
        //Lo mandamos a llamar
        System.out.println("La resta es: " + op1.resta(92, 9));
        System.out.println("El area del circulo con radio : " + r +" es: "+ op1.areaCirculo(r));
        //Le mandamos el valor de como esta la persona
        estValor=op1.estado(9);
        
        if(estValor == true){
            System.out.println("Vienes hasta las chanclas");
        }else{
            System.out.println("Eres buen muchacho");
        }
                
    }
    
}

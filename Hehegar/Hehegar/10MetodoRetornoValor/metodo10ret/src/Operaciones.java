
public class Operaciones {
    
    //Creamos los atributos
    int x,y;
    
    int suma(int x, int y){
        return(x+y);
    }
    
    int resta(int x, int y){
        return(x-y);
    }
    
    double areaCirculo(int radio){
        return (3.1416*(radio*radio));
    }
    
    boolean estado (int tequila){
        boolean e =false;
        if(tequila>=5){
            e=true;
        }else{
            e=false;
        }
        return e;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author andro
 */
public class Mover {
    //Atributos
private int x;
private int y;
private int aux;

//Metodo Setter
public void setMover(int x, int y){
    this.x = x;
    this.y = y;
}

public void setAux(int aux){
    this.aux = aux;
}

//Metodo Getter
public int getx(){
    return x;
}

public int gety(){
    return y;
}

public int getaux(){
    return aux;
}

//Se muestran los datos segun corresponda
public void operacion(){

    switch (aux){
        case 1: 
                if (x > 0 ) {
                System.out.println("El movimiento fue hacia la DERECHA y su cordenada es: "+x+","+y);
                }
                else if(x < 0){
                System.out.println("El movimiento fue hacea la IZQUIERDA y su coordenada es: "+x+","+y);
                }
                else{
                    System.out.println("No se realizo movimiento y la posicion es: "+x+","+y);
                }
                break;
                
        case 2:
                if(y > 0){
                System.out.println("El movimiento fue hacia ARRIBA y su coordenaa es: "+x+","+y);
                }
                else if (y < 0){   
                System.out.println("El movimiento fue hacia ABAJO y su coordenada es: "+x+","+y);
                }
                else{
                    System.out.println("No se realizo movimiento y la posicion es: "+x+","+y);
                }
        
        break;
        
        default: System.out.println("El movimiento es invalido"); //Esto no es necesario
        
    }
}
}
    


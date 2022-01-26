
package paquete;

/**
 *
 * @author andro
 */
public class Movimiento {
    
    private int x,y;
    
    public Movimiento(int x, int y){
        this.x=x;this.y=y;
    }
    public void Izq(){
        x--;
        System.out.println("Izquierda ["+x+","+y+"]");
    }
    public void Der(){
        x++;
        System.out.println("Derecha ["+x+","+y+"]");
    }
    public void Abaj(){
        y--;
        System.out.println("Abajo ["+x+","+y+"]");
    }
    public void Arri(){
        y++;
        System.out.println("Arriba ["+x+","+y+"]");
    }
}

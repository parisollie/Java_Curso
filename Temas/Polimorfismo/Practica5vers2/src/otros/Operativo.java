
package otros;
import altos.*;

public class Operativo extends Empleado{
    private String turno;
    private int jornadaLaboral;
    
    public Operativo(String Nombre, String Apellido){
        super(Nombre,Apellido);
    }
    
    public String getTurno(){
        return this.turno;
    }
    
    public void setTurno(String turno){
        this.turno=turno;
    }
    
    
    public int getJornadaLaboral(){
        return this.jornadaLaboral;
    }
    
    public void setJornadaLaboral(int jornadaLaboral){
        this.jornadaLaboral=jornadaLaboral;
    }
    
}
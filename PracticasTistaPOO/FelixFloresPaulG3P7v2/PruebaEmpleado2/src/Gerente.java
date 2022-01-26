
public class Gerente extends Empleado {
     private int presupuesto;

    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
     

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }
    void asignarPresupuesto(int p){
        presupuesto = p;
    }
     @Override
    public String toString(){
        return super.toString()+"\nPresupuesto: "+this.presupuesto; 
    }
    
}

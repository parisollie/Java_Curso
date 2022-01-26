
public class Gerente extends Empleado{
    private int presupuesto;

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getPresupuesto() {
        return presupuesto;
    }
    void asignarPresupuesto(int p){
        presupuesto = p;
    }
    public String toString(){
        return super.toString()+"\nPresupuesto: "+this.presupuesto; 
    }
}

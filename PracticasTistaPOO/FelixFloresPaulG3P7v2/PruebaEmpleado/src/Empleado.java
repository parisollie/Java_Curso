
public class Empleado {
    
    private String nombre;
    private int numEmpleado,sueldo;
    
    //getters and seeters

    public String getNombre() {
        return nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public void setSueldo(int sueldo) {
        if(sueldo >=0){
            this.sueldo = sueldo;
        }
    }
    public void aumentarSueldo(int porcentaje){
        sueldo +=(int)(sueldo* porcentaje)/100;
    }
    
    public String tosString(){
        return "Nombre: "+this.nombre+"\nNumero: "+this.numEmpleado+"\nSueldo: "+this.sueldo;
    }
}

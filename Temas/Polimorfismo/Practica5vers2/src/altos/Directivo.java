package altos;
public class Directivo extends Empleado{

    private double salarioAdicional;
    
    public Directivo(String Nombre, String Apellido){
        super(Nombre, Apellido);
    }
    
    void setSalarioAdicional(double salarioAdicional){
        this.salarioAdicional=salarioAdicional;
    }
    double getSalarioAdicional(){
        return this.salarioAdicional;
    }
    
    void setSalarioOtro(Empleado empleado,int SalarioBase){
        empleado.setSalarioBase(SalarioBase);
    }
    
    double getSalarioOtro(Empleado empleado){
        return empleado.getsalarioBase();
    }   
    
}
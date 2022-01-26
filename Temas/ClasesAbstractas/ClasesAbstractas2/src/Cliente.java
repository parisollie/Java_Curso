//Super-Clase ,sera abstractos ,ya que las demás clases lo modificaran de acuerdo a su tipo

public abstract class Cliente {
    
    //Atributos
    
    private String nombre,claveDeCliente;
    //Constructor
    public Cliente(String nombre, String claveDeCliente) {
        this.nombre = nombre;
        this.claveDeCliente = claveDeCliente;
    }
    
    //Setters and Getters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //getter
    public String devuelveNombre(){
        return nombre;
    }

    public void setClaveDeCliente(String claveDeCliente) {
        this.claveDeCliente = claveDeCliente;
    }
    //getter devuelveNombre
    public String devuelveClave() { // devuelve el nombre
        return claveDeCliente;
    }
    
    public abstract double totalAPagar();//Como es abstracto no se pone nada , ya que cada clase lo sobre escribira a su manera
    
    @Override
    public String toString(){ //Imprimimos al metodo para imprimir
        
        return "Nombre del Cliente: "+devuelveNombre()+"\n"+"Clave del cliente: "+devuelveClave();
        
    }
   
}

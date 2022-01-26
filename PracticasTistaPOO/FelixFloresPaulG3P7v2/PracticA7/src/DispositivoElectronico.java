
//Clase Principal
public abstract  class DispositivoElectronico {
    
  //Atributos
    
    public String nombre,claveDeProducto;
    //Constructor
    public DispositivoElectronico(String nombre, String claveDeProducto) {
        this.nombre = nombre;
        this.claveDeProducto = claveDeProducto;
    }
    
    //Setters and Getters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //getter
    public String devuelveNombre(){
        return nombre;
    }

    public void setClaveDeCliente(String claveDeProducto) {
        this.claveDeProducto = claveDeProducto;
    }
    //getter devuelveNombre
    public String devuelveClave() { // devuelve el nombre
        return claveDeProducto;
    }
    
    public abstract double totalAPagar();//Como es abstracto no se pone nada , ya que cada clase lo sobre escribira a su manera
    
    @Override
    public String toString(){ //Imprimimos al metodo para imprimir
        
        return "\n Nombre del dispositivo electrónico: "+devuelveNombre()+"\n"+"Clave del producto: "+devuelveClave();
        
    }
    
}


public  class DispositivoMovil extends DispositivoElectronico {
    
    private double totalDeCompra;
    
    //Constructor

    public DispositivoMovil(double totalDeCompra, String nombre, String claveDeProducto) {
        super(nombre, claveDeProducto);
        this.totalDeCompra = totalDeCompra;
    }

   
    
    public void estableceCompra(double compra){
        if(totalDeCompra>=0){
            totalDeCompra = compra;
            
        }else{
            totalDeCompra=0; // La compra debe ser mayor a cero
        }
        
    }//Cierra metodo estableceCompra
    
    
    public double devuelveCompra(){ // Nos devuelve lo que compro
        return totalDeCompra;
    }
    @Override
     public String devuelveNombre(){
        return nombre;
    }
     
      //getter devuelveNombre
    @Override
    public String devuelveClave() { // devuelve el nombre
        return claveDeProducto;
    }
     
    @Override
    public double totalAPagar(){
        if (totalDeCompra>=10000){
            return totalDeCompra-totalDeCompra*0.1;//100000-90000
        }else{
            return totalDeCompra;// No va a pagar con descuento
            
        }
    }//Fin del metodo totalApagar
      @Override
    public String toString(){ //Imprimimos al metodo para imprimir
        
        return "\n Nombre del dispositivo electrónico: "+devuelveNombre()+"\n"+"Clave del producto: "+devuelveClave();
        
    }
    
}

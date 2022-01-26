
public class ClienteA extends Cliente {
    
    private double totalDeCompra;
    
    //Constructor

    public ClienteA(String nombre, String claveDeCliente,double totalDeCompra) {
        super(nombre, claveDeCliente); //Haciendo la invocacion explicita
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
    public double totalAPagar(){
        if (totalDeCompra>=10000){
            return totalDeCompra-totalDeCompra*0.1;//100000-90000
        }else{
            return totalDeCompra;// No va a pagar con descuento
            
        }
    }//Fin del metodo totalApagar
    
    @Override
    public String toString(){
        //Imprime
        return "Cliente A: \n "+super.toString()+"\n"+"Total de la compra: "+devuelveCompra()+"\n"+"Total a pagar: "+totalAPagar();//Estamos invocando al tostring de la super clase
    }
}

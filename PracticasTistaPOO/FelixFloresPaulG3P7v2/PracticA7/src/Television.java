
import javax.swing.JOptionPane;


public class Television extends DispositivoElectronico {

     private double totalDeCompra;
    
    //Constructor

    public Television(String nombre, String claveDeProducto,double totalDeCompra) {
        super(nombre, claveDeProducto); //Haciendo la invocacion explicita
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
        return "Producto electrónico Tv:  "+super.toString()+"\n"+"Total de la compra: "+devuelveCompra()+"\n"+"Total a pagar: "+totalAPagar();//Estamos invocando al tostring de la super clase
    }
    
    
}

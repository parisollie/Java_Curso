public class Ventana  {
   
    // Atributos
    
    protected int posX,posY,ancho,alto;
    
    //Constructor
    
    public Ventana (int x , int y , int a,int h){
        posX=x; // Los datos del lado derecho son los parámetros que le mandamos al contructor
        posY=y;
        ancho=a;
        alto=h;
    }
    
    //Mostrar datos
    
    public void mostrarInformacion(){
        System.out.println("\nPosición en x: "+posX);
        System.out.println("Posición en y: "+posY);
        System.out.println("Ancho: "+ancho);
        System.out.println("Alto: "+alto);
    }
    
    public void modificarDimensiones(int cambioAncho,int cambioAlto){//Para modificar los parámetros de la ventana
        
        System.out.println("\nVentana Modificada");
        ancho+=cambioAncho;
        alto+=cambioAlto;
        
    }
    
    
}

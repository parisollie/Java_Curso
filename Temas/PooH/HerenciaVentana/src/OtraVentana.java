
public class OtraVentana extends Ventana {
    
    
    //Atributo
    
    protected String titulo;
    
    //Constructor
    public OtraVentana( int x, int y, int a, int h,String titulo) {
        super(x, y, a, h);//Debemos ponerle super con los argumentos.
        this.titulo = titulo;
    }
    //Nos permite hacer un cambio en la posición en x y en y
    public void desplazaVentana (int cambioX,int cambioY){
        //posX posY los está heredado de la clase ventana
        posX+=cambioX;
        posY+=cambioY;
    }
    //Redefiniendo mostrar información.
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("\nNueva Ventana");
        System.out.println("Titulo: "+titulo);//Añadimos nueva información
    }
    
    
}

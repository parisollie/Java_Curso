//Programa que simule las caracteristicas de una ventana
public class HerenciaVentana {

    public static void main(String[] args) {
        
        Ventana v1 = new Ventana(50,50,400,400);
        v1.mostrarInformacion();
        v1.modificarDimensiones(100,100);
        v1.mostrarInformacion();
        OtraVentana nueva = new OtraVentana(100,50,400,450,"Ollie I love u");
        nueva.mostrarInformacion();
        
    }
    
}


public class Ejercicio1 {

    
    public static void main(String[] args) {
        try {
            String mensajes[] = {"Primero","Segundo","Tercero"};
            for(int i=0; i<=3 ; i++){
                System.out.println(mensajes[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Error: apuntador fuera del rango del arreglo");
                    }
    }
    
}

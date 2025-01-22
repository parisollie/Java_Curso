import javax.swing.JOptionPane;
public class ArbolesBinarios {

    
    public static void main(String[] args) {
        
        int opcion=0,elemento;
        String nombre;
        ArbolBinario arbolito = new ArbolBinario();
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo\n"
                      + "2.Recorrer el árbol Inorden\n"
                      + "3.Recorrer el árbol Preorden\n"
                      + "4.Recorrer el árbol Posorden\n"
                      + "5.Buscar un nodo en el árbol\n"
                      + "6.Eliminar un nodo en el árbol\n"
                      + "7.Salir\n"
                      + "Elige una opcion...","Menu Arboles Binarios",JOptionPane.QUESTION_MESSAGE));
                
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingesa el Numero del nodo...","Agregando Nodo",JOptionPane.QUESTION_MESSAGE));
                        
                        //Solicitando el nombre
                        nombre = JOptionPane.showInputDialog(null,"Ingresa el nombre del nodo..","Agregando Nodo",JOptionPane.QUESTION_MESSAGE);
                        //Mandamos a llamar a nuestra instancia
                        arbolito.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        //In-Orden
                        System.out.println();
                        if(!arbolito.estaVacio()){
                            arbolito.inorden(arbolito.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "El árbol esta vacío","Watch out!",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        //Pre-Orden
                        if(!arbolito.estaVacio()){
                            System.out.println();
                            arbolito.preOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "El árbol esta vacío","Watch out!",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        
                        //Post-Orden
                        if(!arbolito.estaVacio()){
                            System.out.println();
                            arbolito.posOrden(arbolito.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null, "El árbol esta vacío","Watch out!",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    
                    case 5:
                        //Buscando nodo
                        if(!arbolito.estaVacio()){
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingesa el número del nodo a buscar...","Buscando el nodo",JOptionPane.QUESTION_MESSAGE));
                            
                            if(arbolito.buscarNodo(elemento)==null){ // Quiere decir que no lo encontro
                                JOptionPane.showMessageDialog(null,"El nodo no está en el árbol ","!Nodo no encontrado!", JOptionPane.INFORMATION_MESSAGE);
                                
                            }else{
                                System.out.println("\nEl nodo ha sido encontrado, sus datos son:" +arbolito.buscarNodo(elemento));//Lo buscamos con el toString
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "El árbol esta vacío","Watch out!",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        //Eliminar nodo
                        if(!arbolito.estaVacio()){
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingesa el número del nodo a eliminar...","Eliminando el nodo",JOptionPane.QUESTION_MESSAGE));
                            
                            if(arbolito.eliminar(elemento)==false){ //Si es igual a fase quiere decir que no lo encontro 
                                JOptionPane.showMessageDialog(null,"El nodo no está en el árbol ","!Nodo no encontrado!", JOptionPane.INFORMATION_MESSAGE);
                                
                            }else{
                                JOptionPane.showMessageDialog(null,"El nodo ha sido eliminado del arbol ","!Nodo eliminado!", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "El árbol esta vacío","Watch out!",JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada","Fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta","Watch out!",JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
                
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "Error "+ n.getMessage());
            }
            
        }while(opcion!=7);
        
    
       
    }
    
}

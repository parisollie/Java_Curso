
import javax.swing.JOptionPane;


public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion=0,elemento,tamanio;
        boolean estado = false; //para saber si esta vacia
        try{
            tamanio = Integer.parseInt(JOptionPane.showInputDialog(null,"¿De que tamaño quieres la Pila?", "Solicitando el tamaño",
                    JOptionPane.INFORMATION_MESSAGE));
            //Creamos un objeto del tipo pila
            Pilitas pilis = new Pilitas(tamanio);
            do{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1.Empujar un elemeno en la Pila\n"
                      + "2. Sacar un elemento en la Pila\n"
                      + "3. ¿La Pila está vacía?\n"
                      + "4. ¿La Pila esta llena?\n"
                      + "5. ¿Que elemento está en la cima?\n"
                      + "6. Tamaño de la pila\n"
                      + "7.Salir\n"
                      + "Elige una opcion...","Menu de opciones",JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                                + "Ingresa el elemento a empujar en la pila", "Apilando Datos",JOptionPane.INFORMATION_MESSAGE));
                        //para saber que la pila no este llena
                        if(!pilis.estaLLena()){
                            pilis.empujar(elemento);//Le empujamos el elemento
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta llena","Pila Llena"
                                + "",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 2:
                        if(!pilis.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento obtenido es: "
                                    +pilis.sacar(),
                              "Obteniendo datos de la pila",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila esta vacia","Pila vacía"
                                + "",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if(pilis.estaVacia()){
                            JOptionPane.showMessageDialog(null, "La pila esta vacia",
                                    "Pila vacía",JOptionPane.INFORMATION_MESSAGE);
                           
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila no esta vacia",
                                     "La Pila contiene datos",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(pilis.estaLLena()){
                            JOptionPane.showMessageDialog(null, "La pila esta llena",
                                    "La pila esta Llena",JOptionPane.INFORMATION_MESSAGE);
                           
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila no esta llena",
                                     "La Pila contiene espacio aun",JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                    case 5:
                        if(!pilis.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento que se encuentra en la cima es: " +pilis.cimaPila(),
                                     "Cima de la pila",JOptionPane.INFORMATION_MESSAGE);
                            
                        }else{
                            JOptionPane.showMessageDialog(null, "La pila no esta llena",
                                     "La Pila contiene espacio aun",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "El tamaño de la pila es: "+ pilis.tamanioPila(),
                                     "Tamaño de la pila",JOptionPane.INFORMATION_MESSAGE);
                        
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada","Fin"
                                + "",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta","Fin"
                                + "",JOptionPane.INFORMATION_MESSAGE);
                }        
           
            }while(opcion != 7);
        
        }catch(NumberFormatException n){
        JOptionPane.showMessageDialog(null, "Error "+ n.getMessage());
        
    }
    
}
}

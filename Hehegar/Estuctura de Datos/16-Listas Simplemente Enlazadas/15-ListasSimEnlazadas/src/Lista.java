
public class Lista {
    /*
     * Paso 4,Dos punteros,las listas tienen referencias al inicio y al final de la
     * lista Punteros tipo Nodo para saber donde esta el inicio y el fin
     */
    protected Nodo inicio, fin;

    // Paso 5,constructor inicializamos los punteros.
    public Lista() {
        inicio = null;
        fin = null;
    }

    /*
     * Paso 6, método para agregar un Nodo al inicio de la lista
     * me sirve para crear un nodo al incio de la lista
     */
    public void agregarAlInicio(int elemento) {
        /*
         * Creando el Nodo
         * Para saber donde esta ubicado el inicio de mi lista.
         */
        inicio = new Nodo(elemento, inicio);

        // Signifíca que no hay ningun nodo.
        if (fin == null) {
            // así que fin apunta a inicia ,por tanto no haía ninguno.
            fin = inicio;
        }
    }

    // Paso 7, método para mostrar los datos.
    public void mostrarLista() {
        // Creamos un nodo auxiliar
        Nodo recorrer = inicio;
        System.out.println("\n");
        while (recorrer != null) {
            // Accede a recorrer.dato
            System.out.print("[" + recorrer.dato + "]---->");
            // Para que vaya avanzando
            recorrer = recorrer.siguiente;
        }
    }
    
    //Paso 13,método para saber si la lista esta vacía me retorna un true o un false.
    public boolean estaVacia(){
        // Si apunta a null es obvio que la lista esta vacía.
        if(inicio==null){ 
            return true;
        }else{
            return false;
        }   
    }
    
    
    //Paso 14,método para insertar al final de la lista
    public void agregarAlFinal(int elemento){
        // Si no esta vacía
        if(!estaVacia()){ 
            //Donde se encontraba mi puntero Fin a punta al nuevo nodo.
            fin.siguiente=new Nodo(elemento);
            // Fin apúntamelo a fin de siguiente.
            fin=fin.siguiente; 
        }else{ // No hay elementos 
            // El Inicio y el fin apuntan al nuedo nodo.
            inicio=fin=new Nodo(elemento);
        }
    }
    
    //Paso 15,método borrar para eliminar un nodo del incio.
    
    public int borrarDelInicio(){
        int elemento =inicio.dato;
        //Si inicio es igual al fin ,solo tenemos un nodo
        if(inicio==fin){
            //Los dos apuntan a null, de acuerdo al algoritimo.
            inicio=fin=null;
        //al menos ya hay dos nodos
        }else{ 
            inicio=inicio.siguiente;
        }
        //Retornamos un elemento que no existe.
        return elemento;
    }
    
     /*Paso 16,Método para eliminar un nodo del final.
    no recibe parámetros solo retorna*/
    public int borrarDelFinal(){ 
        int elemento=fin.dato;
        if(inicio==fin){
            inicio=fin=null;
        }else{
            /*El nodo temporal nos sirve para ir recorriendo toda la lista
            y saber cúal vamos a eliminar*/
            Nodo temporal=inicio; 
            //temporal.siguiente = temporal de siguiente,mientras no llegie a fin
            while(temporal.siguiente!=fin){
                temporal=temporal.siguiente;
            }
            //Apuntamos
            fin=temporal;
            fin.siguiente=null;
        }
        return elemento;
    }
    
    //Paso 17,método para eliminar un nodo en epecifico
    public void eliminar(int elemento){
            if(!estaVacia()){
                // si inicio es igual a fin y elemento a incio
                if(inicio==fin && elemento == inicio.dato){
                    //ya encontre al al elemento.
                    inicio=fin=null;
                    
                }else if(elemento == inicio.dato){
                    //Apuntar a inicio a inicio de siguiente
                    inicio=inicio.siguiente; 
                }else{
                    //Se crean dos punteros de tipo nodo.
                    Nodo anterior,temporal;
                    anterior=inicio;
                    temporal=inicio.siguiente;
                    /*Recorriendo nuestra lista hasta que encuentre al 
                    elemento que estoy buscando
                    temporal!=null..mientras el temporal no llegue a null
                    nadatemporal.dato!=elemento....el elemento que estoy buscando*/
                    while(temporal!=null && temporal.dato!=elemento){ 
                        //estoy recorriendo mis punteros
                       anterior=anterior.siguiente; 
                       temporal=temporal.siguiente;
                    }
                    // si es diferente de null,quiere decir que lo encontró.
                    if(temporal!=null){
                        anterior.siguiente=temporal.siguiente;
                        //Quiere decir que el temporal es el final.
                        if(temporal==fin){ 
                            // Mover a fin a anterior porque se elimino uno
                            fin=anterior;
                        }
                    }
                }//fin else    
        } 
    }//fin public
    
     //Paso 18,Método para buscar un Elemento
    public boolean estaEnLaLista(int elemento){
        // Nodo temporal que apunta a inicio
        Nodo temporal = inicio; 
        while(temporal!=null && temporal.dato!=elemento){
            temporal=temporal.siguiente;
            
        }
        // Si temporal es diferente de null ,es obvio que nos retorna un true
        return temporal!=null; 
        
    }  
    
    

}

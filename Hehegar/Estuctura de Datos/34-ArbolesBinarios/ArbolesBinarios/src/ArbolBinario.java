
//Se lee así  padre.hijoIzquierdo=null -> padre de hijo izquierdo lo apuntamos a null.
public class ArbolBinario {
    //Puntero ,de donde arranca el árbol
    NodoArbol raiz;
    
    //Creamos nuestro constructor
    public ArbolBinario(){
        // ES para saber cuando nuestro elemento cambie a otro valor distinto de nulo
        raiz=null; 
    }
    
    //Método para insertar un Nodo en el árbol
    public void agregarNodo(int d, String nom){
        //Creamos un nodo tipo arbol , el tipo de dato entero y su nombre.
        NodoArbol nuevo = new NodoArbol(d, nom);
        //Significa que todavía no habia nada.
        if(raiz==null){
            //La Raiz se convierte el nuevo nodo , el que acabamos de crear.
            raiz=nuevo;
        }else{
            /*creamos 2 tipos NodoArbol
            El auxiliar apunta a la raíz.*/
            NodoArbol auxiliar=raiz; 
            NodoArbol padre;
            
            while(true){
                /* En este momento el padre apunta al auxiliar, el padre
                apunta a la raiz en este momento.*/
                padre=auxiliar;
                
                // Si es dato que me das es menor se debe ir a la izquierda.
                if(d<auxiliar.dato){
                    //recorrete a la izquierda, solo lo apuntamos ahí.
                    auxiliar=auxiliar.hijoIzquierdo;
                    //Si auxiliar ya apunto a nulo , significa que ya llego al final.
                    if(auxiliar == null){
                        //Ya se inserto el hijo en teoría.
                        padre.hijoIzquierdo=nuevo;
                        //Para que salga del método
                        return;
                    }
                    
                //Si es mayor o es igual se inserta a la derecha.
                }else{
                    auxiliar=auxiliar.hijoDerecho;
                    if(auxiliar == null){
                        //Ya se inserto el hijo en teoría
                            padre.hijoDerecho=nuevo;
                            //Para que salga del método
                            return;
                    }
                }
            }
        }
    }
    
    //Método para saber si el arbol esta vacío.
    public boolean estaVacio(){
         //Si es igual a null nos retorna un true y sino nos retornara un false.
        return raiz == null;
    }
    
    //Método para recorrer el árbol (In-Orden)
    // r es la raíz de mi árbol
    public void inorden(NodoArbol r){ 
        //si la raiz es diferente de null, significa que hay algo.
        if(r!=null){ 
            //1)Debemos recorrer el arbol izquierdo primeramente de manera recursiva.
            inorden(r.hijoIzquierdo);
            //2)Mostramos el dato del que tiene la raiz.
            System.out.print(r.dato +", ");
            //3)Debemos recorrer el arbol derecho de manera recursiva.
            inorden(r.hijoDerecho);
        }
    }
    
    //Método para recorrer el árbol en (Pre-orden)
    public void preOrden(NodoArbol r){
        //si la raiz es diferente de null, significa que hay algo.
        if(r!=null){ 
            //1)Mostramos el dato del que tiene la raíz.
            System.out.print(r.dato +", ");
            //2)Debemos recorrer el arbol izquierdo primeramente de manera recursiva.
            preOrden(r.hijoIzquierdo);
            //3)Debemos recorrer el arbol derecho de manera recursiva.
            preOrden(r.hijoDerecho);
        }
    }
    
    //Método para recorrer el árbol en (Pos-orden) Muestra a último la raiz
    public void posOrden(NodoArbol r){
        //si la raiz es diferente de null, significa que hay algo.
        if(r!=null){ 
            //1)Debemos recorrer el arbol izquierdo primeramente de manera recursiva
            posOrden(r.hijoIzquierdo);
            //2)Debemos recorrer el arbol derecho de manera recursiva
            posOrden(r.hijoDerecho);
            //3)Mostramos el dato del que tiene la raiz
            System.out.print(r.dato+", ");
        }
    }
    
    //Método para buscar en un nodo en el árbol
    public NodoArbol buscarNodo(int  d){
        //creamos un puntero auxiliar de tipo NodoArbol y lo apuntamos  a la raiz
        NodoArbol aux=raiz;
        //Mientras auxiliar de dato sea diferente de dato buscado, hacemos
        while(aux.dato!=d){
            //si dato buscado es menor que auxiliar de dato entonces
            if(d<aux.dato){
                // apuntamos a auxiliar de hijo izquierda
                aux=aux.hijoIzquierdo;
            }else{
                // sino apuntamos a auxiliar de hijo derecho
                aux=aux.hijoDerecho;
                //Quiere decir que ya llego al final y nunca lo encontró
            } if(aux==null){
                //Nunca lo encontró
                    return null;
                }
        }
        //Si retorna a aux significa que encontró el dato.
        return aux;
    }
    
    //Método para eliminar un Nodo del árbol.
    public boolean eliminar(int  d){
        
        //Necesitamos 2 2untero que apunta a la raíz.
        NodoArbol auxiliar = raiz;
        NodoArbol padre = raiz;
        //Variable boolean para saber si es hijo izquierdo.
        boolean esHijoIzq = true;
        
        /*Buscando el nodo a eliminar.
        -Cuando no sea diferente todavía no lo encuentra*/
        while(auxiliar.dato !=d){
            padre=auxiliar;
            
            //si d < auxiliar de datos ,se debe ir por la izquierda.
            if(d<auxiliar.dato){
                //como se debe ir por la izquierda le ponemos true.
                esHijoIzq = true;
                //Para ir recorriendo por la izquierda
                auxiliar=auxiliar.hijoIzquierdo;
            }else{
                //si es mayor , se va por la parte derecha.
                esHijoIzq = false;
                //Para ir recorriendo por la derecha.
                auxiliar=auxiliar.hijoDerecho;
            }
            //Si es nullo, quiere decir que llego hasta el final,nunca lo encontró.
            if(auxiliar==null){
                //Si nos retorna el false significa que nunca lo encontró
                return false;
            }
        }//Fin del while
        
        //Cuándo los dos nodos son nulos, significa que son hojas.
        if(auxiliar.hijoIzquierdo==null && auxiliar.hijoDerecho==null){
            //Significa que sólo hay un elemento en el arbol
            if(auxiliar == raiz){
                raiz=null;
            }else if(esHijoIzq){
                padre.hijoIzquierdo=null;
            }else{
                padre.hijoDerecho=null;
            }
        //si auxiliar de hijo a derecho es igual a null
        }else if(auxiliar.hijoDerecho==null){
            //Significa que sólo hay un elemento
            if(auxiliar == raiz){
                raiz=auxiliar.hijoIzquierdo;
            }else if(esHijoIzq){
                padre.hijoIzquierdo=auxiliar.hijoIzquierdo;
            }else{
                padre.hijoDerecho=auxiliar.hijoIzquierdo;
            }
        //otro caso,reacomodando los punteros.
        }else if(auxiliar.hijoDerecho == null){
            //Significa que sólo hay un elemento
            if(auxiliar == raiz){
                raiz=auxiliar.hijoIzquierdo;
            }else if(esHijoIzq){
                padre.hijoIzquierdo=auxiliar.hijoDerecho;
            }else{
                padre.hijoDerecho=auxiliar.hijoDerecho;
            }
        /*
            //Cometio un error, es el codifgo de hehegar
            }else if(auxiliar.hijoIzquierdo == null){
            //Significa que sólo hay un elemento
            if(auxiliar == raiz){
                raiz=auxiliar.hijoDerecho;
            }else if(esHijoIzq){
                padre.hijoIzquierdo=auxiliar.hijoDerecho;
            }else{
                padre.hijoDerecho=auxiliar.hijoDerecho;
        }*/
            
            
        //Buscando al nodo reemplazo del que vamos a eliminar.
        }else{
            //Le enviamos nuestro médoto Nodo Reemplazo
            NodoArbol reemplazo=obtenerNodoReemplazo(auxiliar);
            if(auxiliar==raiz){
                //El reemplazo puede ser la raiz ,el hijo-izq o el hijo-der
                raiz=reemplazo; 
            }else if(esHijoIzq){
                padre.hijoIzquierdo=reemplazo;
            }else{
                padre.hijoDerecho=reemplazo;
            }
            // Para que no se haga un caos
            reemplazo.hijoIzquierdo=auxiliar.hijoIzquierdo;
        }
        return true;
    }
    
    //Método encargado de volvernos el nodo reemplazado
    public NodoArbol obtenerNodoReemplazo(NodoArbol nodoReemp){
        //Lo igualamos al que nos manden 
        NodoArbol reemplazarPadre=nodoReemp;
        NodoArbol reemplazo=nodoReemp;
        NodoArbol auxiliar=nodoReemp.hijoDerecho;
        
        //Recorriendo para saber cual es el nodo a reemplazar
        while(auxiliar!=null){
            reemplazarPadre=reemplazo;
            reemplazo=auxiliar;
            auxiliar=auxiliar.hijoIzquierdo;
        }
        if(reemplazo !=nodoReemp.hijoDerecho){
            //Para reacomodar los enlaces
            reemplazarPadre.hijoIzquierdo = reemplazo.hijoDerecho;
            reemplazo.hijoDerecho = nodoReemp.hijoDerecho;
        }
        System.out.println("El nodo reemplazo es "+ reemplazo);
        return reemplazo;
    }
}


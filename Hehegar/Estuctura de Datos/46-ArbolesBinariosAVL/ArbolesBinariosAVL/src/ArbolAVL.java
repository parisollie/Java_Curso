//Clase arbol AVL
public class ArbolAVL {
    private NodoArbolAVL raiz;

    // Constructor, inicializar la raiz en nulo
    public ArbolAVL() {
        raiz = null;
    }

    public NodoArbolAVL obtenerRaiz() {
        return raiz;
    }

    // Método para buscar
    public NodoArbolAVL buscar(int dato, NodoArbolAVL r) {
        // si no tenemos nada es nullo
        if (r == null)
            return null;
        // si ya lo encontró.
        if (r.dato == dato) {
            return r;
        } else if (r.dato < dato) {
            return buscar(dato, r.hijoDerecho);
        } else {
            return buscar(dato, r.hijoIzquierdo);
        }
    }

    // Método para buscar el factor de equilibrio.
    public int obtenerFE(NodoArbolAVL r) {
        if (r == null) {
            return -1;
        } else {
            // retornamos el factor de equilibrio.
            return r.fe;
        }
    }

    // Hacemos las rotaciones simples izquierda.
    public NodoArbolAVL rotacionIzquierda(NodoArbolAVL r) {

        NodoArbolAVL auxiliar = r.hijoIzquierdo;
        r.hijoDerecho = auxiliar.hijoDerecho;
        auxiliar.hijoDerecho = r;
        /*
         * en r su factor de equilibrio, max me devuelve el factor maximo, factior de
         * equlibrio + 1
         */
        r.fe = Math.max(obtenerFE(r.hijoIzquierdo), obtenerFE(r.hijoDerecho)) + 1;
        auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho)) + 1;
        return auxiliar;
    }

    // Método rotacion simple derecha
    public NodoArbolAVL rotacionDerecha(NodoArbolAVL r) {
        NodoArbolAVL auxiliar = r.hijoDerecho;
        r.hijoDerecho = auxiliar.hijoIzquierdo;
        auxiliar.hijoIzquierdo = r;
        r.fe = Math.max(obtenerFE(r.hijoIzquierdo), obtenerFE(r.hijoDerecho)) + 1;
        auxiliar.fe = Math.max(obtenerFE(auxiliar.hijoIzquierdo), obtenerFE(auxiliar.hijoDerecho)) + 1;
        return auxiliar;
    }

    // Método rotacion doble Izquierda, es un algortimo que ya esta hecho.
    public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL r) {
        NodoArbolAVL temporal;
        r.hijoIzquierdo = rotacionDerecha(r.hijoIzquierdo);
        temporal = rotacionIzquierda(r);
        return temporal;
    }

    // Método rotacion doble derecha.
    public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL r) {
        NodoArbolAVL temporal;
        r.hijoDerecho = rotacionIzquierda(r.hijoDerecho);
        temporal = rotacionDerecha(r);
        return temporal;
    }
    // Método para insertar avl

    public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subAr) {

        NodoArbolAVL nuevoPadre = subAr;
        if (nuevo.dato < subAr.dato) {
            if (subAr.hijoIzquierdo == null) {
                subAr.hijoIzquierdo = nuevo;
            } else {
                subAr.hijoIzquierdo = insertarAVL(nuevo, subAr.hijoIzquierdo);
                if ((obtenerFE(subAr.hijoIzquierdo) - obtenerFE(subAr.hijoDerecho) == 2)) {
                    if (nuevo.dato < subAr.hijoIzquierdo.dato) {
                        nuevoPadre = rotacionIzquierda(subAr);
                    } else {
                        nuevoPadre = rotacionDobleIzquierda(subAr);
                    }
                }
            }
        } else if (nuevo.dato > subAr.dato) {
            if (subAr.hijoDerecho == null) {
                subAr.hijoDerecho = nuevo;
            } else {
                subAr.hijoDerecho = insertarAVL(nuevo, subAr.hijoDerecho);
                if ((obtenerFE(subAr.hijoDerecho) - obtenerFE(subAr.hijoIzquierdo) == 2)) {
                    if (nuevo.dato > subAr.hijoDerecho.dato) {
                        nuevoPadre = rotacionDerecha(subAr);
                    } else {
                        nuevoPadre = rotacionDobleDerecha(subAr);
                    }
                }
            }
            // Fin else-if
        } else {
            System.out.println("Nodo duplicado");
        }
        // Actualizando la altura
        if ((subAr.hijoIzquierdo == null && (subAr.hijoDerecho != null))) {
            // le sumamos 1 para balncearlo
            subAr.fe = subAr.hijoDerecho.fe + 1;
        } else if ((subAr.hijoDerecho == null) && (subAr.hijoIzquierdo != null)) {
            subAr.fe = subAr.hijoIzquierdo.fe + 1;
        } else {
            subAr.fe = Math.max(obtenerFE(subAr.hijoIzquierdo), obtenerFE(subAr.hijoDerecho)) + 1;
        }
        return nuevoPadre;
    }

    // Método para insertar
    public void insertar(int d) {
        NodoArbolAVL nuevo = new NodoArbolAVL(d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            raiz = insertarAVL(nuevo, raiz);
        }
    }

    // Recorridos

    // Método para recorrer el árbol (In-Orden)
    // r es la raíz de mi árbol
    public void inorden(NodoArbolAVL r) {
        // si la raiz es diferente de null, significa que hay algo.
        if (r != null) {
            // 1)Debemos recorrer el arbol izquierdo primeramente de manera recursiva.
            inorden(r.hijoIzquierdo);
            // 2)Mostramos el dato del que tiene la raiz.
            System.out.print(r.dato + ", ");
            // 3)Debemos recorrer el arbol derecho de manera recursiva.
            inorden(r.hijoDerecho);
        }
    }

    // Método para recorrer el árbol en (Pre-orden)
    public void preOrden(NodoArbolAVL r) {
        // si la raiz es diferente de null, significa que hay algo.
        if (r != null) {
            // 1)Mostramos el dato del que tiene la raíz.
            System.out.print(r.dato + ", ");
            // 2)Debemos recorrer el arbol izquierdo primeramente de manera recursiva.
            preOrden(r.hijoIzquierdo);
            // 3)Debemos recorrer el arbol derecho de manera recursiva.
            preOrden(r.hijoDerecho);
        }
    }

    // Método para recorrer el árbol en (Pos-orden) Muestra a último la raiz
    public void posOrden(NodoArbolAVL r) {
        // si la raiz es diferente de null, significa que hay algo.
        if (r != null) {
            // 1)Debemos recorrer el arbol izquierdo primeramente de manera recursiva
            posOrden(r.hijoIzquierdo);
            // 2)Debemos recorrer el arbol derecho de manera recursiva
            posOrden(r.hijoDerecho);
            // 3)Mostramos el dato del que tiene la raiz
            System.out.print(r.dato + ", ");
        }
    }

}
